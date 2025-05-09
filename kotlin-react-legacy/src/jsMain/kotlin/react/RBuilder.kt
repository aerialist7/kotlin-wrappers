package react

import js.objects.unsafeJso
import kotlin.reflect.KClass

typealias Render = RBuilder.() -> Unit

@ReactDsl
interface RBuilder {
    val childList: MutableList<ReactNode>

    fun child(element: ReactNode) {
        childList.add(element)
    }

    operator fun ReactNode.unaryPlus() {
        child(this)
    }

    operator fun String.unaryPlus() {
        child(ReactNode(this))
    }

    fun <P : Props> child(
        type: ElementType<P>,
        props: P = unsafeJso(),
        handler: RHandler<P>? = null,
    ) {
        if (handler == null) {
            child(createElement(type, props))
            return
        }

        val children = RElementBuilder(props)
            .apply(handler)
            .childList
            .toTypedArray()

        child(createElement(type, props, *children))
    }

    operator fun <P : Props> ElementType<P>.invoke() {
        child(createElement(this))
    }

    operator fun <P : Props> ElementType<P>.invoke(
        handler: RHandler<P>,
    ) {
        child(this, handler = handler)
    }

    operator fun <T> Provider<T>.invoke(
        value: T,
        handler: RHandler<ProviderProps<T>>,
    ) {
        child(this) {
            attrs.value = value
            handler()
        }
    }

    operator fun <T> Consumer<T>.invoke(
        handler: RBuilder.(T) -> Unit,
    ) {
        child(this) {
            attrs.children = { value -> createElement<Props> { handler(value) } }
        }
    }

    fun <P : Props> child(
        klazz: KClass<out Component<P, *>>,
        handler: RHandler<P>,
    ) {
        klazz.react(handler)
    }

    fun PropsWithChildren.children() {
        childList.addAll(Children.toArray(children))
    }
}

@JsName("createBuilder")
fun RBuilder(): RBuilder =
    RBuilderImpl()

inline fun <P : Props, reified C : Component<P, *>> RBuilder.child(
    noinline handler: RHandler<P>,
) {
    child(C::class, handler)
}

open class RBuilderImpl : RBuilder {
    override val childList = mutableListOf<ReactNode>()
}

open class RBuilderMultiple : RBuilderImpl()

fun <T : RBuilder> buildElements(builder: T, handler: T.() -> Unit): ReactNode? {
    val nodes = builder.apply(handler).childList
    return when (nodes.size) {
        0 -> null
        1 -> nodes.first()
        else -> createElement(Fragment, unsafeJso(), *nodes.toTypedArray())
    }
}

open class RBuilderSingle : RBuilderImpl()

inline fun <T : RBuilder> buildElement(rBuilder: T, handler: T.() -> Unit): ReactElement<*> =
    rBuilder.apply(handler)
        .childList.first()
        .unsafeCastToElement<Props>()

inline fun buildElement(handler: Render): ReactElement<*> =
    buildElement(RBuilder(), handler)

interface RElementBuilder<out P : Props> : RBuilder {
    val attrs: P

    fun attrs(handler: P.() -> Unit) {
        attrs.handler()
    }

    var key: Key?
        @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            attrs.key = value
        }

    var ref: Ref<*>?
        @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            attrs.ref = value
        }
}

fun <P : Props> RElementBuilder(attrs: P): RElementBuilder<P> =
    RElementBuilderImpl(attrs)

open class RElementBuilderImpl<out P : Props>(override val attrs: P) : RElementBuilder<P>, RBuilderImpl()

typealias RHandler<P> = RElementBuilder<P>.() -> Unit
