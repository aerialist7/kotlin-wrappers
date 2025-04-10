@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package js.iterable

import js.core.JsAny
import js.iterable.internal.iteratorFromAsyncIterable
import js.symbol.Symbol
import seskar.js.JsNativeGetter
import kotlin.js.definedExternally

external interface AsyncIterable<out T : JsAny?> {
    @JsNativeGetter
    operator fun get(
        key: Symbol.asyncIterator,
    ): () -> AsyncIterator<T> = definedExternally

    inline operator fun iterator(): SuspendableIterator<T> =
        iteratorFromAsyncIterable(this)
}
