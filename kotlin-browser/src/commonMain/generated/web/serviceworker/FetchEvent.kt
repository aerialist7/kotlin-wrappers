// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import web.http.Request
import web.http.Response

/**
 * This is the event type for `fetch` events dispatched on the ServiceWorkerGlobalScope.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent)
 */
open external class FetchEvent(
    override val type: EventType<FetchEvent>,
    init: FetchEventInit,
) : ExtendableEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/clientId)
     */
    val clientId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/handled)
     */
    val handled: Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/preloadResponse)
     */
    val preloadResponse: Promise<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/request)
     */
    val request: Request

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/resultingClientId)
     */
    val resultingClientId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/respondWith)
     */
    fun respondWith(r: Response)
    fun respondWith(r: PromiseLike<Response>)

    @JsAlias(THIS)
    override fun asInit(): FetchEventInit

    companion object {
        @JsValue("fetch")
        val FETCH: EventType<FetchEvent>
    }
}
