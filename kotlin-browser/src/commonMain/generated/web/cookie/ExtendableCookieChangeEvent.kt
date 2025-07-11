// Automatically generated - do not modify!

package web.cookie

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import web.events.EventType
import web.serviceworker.ExtendableEvent
import kotlin.js.definedExternally

/**
 * The **`ExtendableCookieChangeEvent`** interface of the Cookie Store API is the event type passed to ServiceWorkerGlobalScope/cookiechange_event event fired at the ServiceWorkerGlobalScope when any cookie changes occur which match the service worker's cookie change subscription list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableCookieChangeEvent)
 */
open external class ExtendableCookieChangeEvent(
    override val type: EventType<ExtendableCookieChangeEvent>,
    init: ExtendableCookieChangeEventInit = definedExternally,
) : ExtendableEvent {
    /**
     * The **`changed`** read-only property of the ExtendableCookieChangeEvent interface returns any cookies that have been changed by the given `ExtendableCookieChangeEvent` instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableCookieChangeEvent/changed)
     */
    val changed: ReadonlyArray<CookieListItem>

    /**
     * The **`deleted`** read-only property of the ExtendableCookieChangeEvent interface returns any cookies that have been deleted by the given `ExtendableCookieChangeEvent` instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableCookieChangeEvent/deleted)
     */
    val deleted: ReadonlyArray<CookieListItem>

    companion object
}

inline fun ExtendableCookieChangeEvent.asInit(): ExtendableCookieChangeEventInit =
    unsafeCast(this)

inline val ExtendableCookieChangeEvent.Companion.COOKIECHANGE: EventType<ExtendableCookieChangeEvent>
    get() = EventType("cookiechange")
