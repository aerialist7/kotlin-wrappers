// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.JsAny
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import web.messaging.MessagePort
import kotlin.js.definedExternally

/**
 * The **`ExtendableMessageEvent`** interface of the Service Worker API represents the event object of a ServiceWorkerGlobalScope/message_event event fired on a service worker (when a message is received on the ServiceWorkerGlobalScope from another context) — extends the lifetime of such events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent)
 */
open external class ExtendableMessageEvent(
    override val type: EventType<ExtendableMessageEvent>,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/data)
     */
    val data: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/lastEventId)
     */
    val lastEventId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/origin)
     */
    val origin: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ports)
     */
    val ports: ReadonlyArray<MessagePort>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/source)
     */
    val source: JsAny /* Client | ServiceWorker | MessagePort */?

    @JsAlias(THIS)
    override fun asInit(): ExtendableMessageEventInit

    companion object {
        @JsValue("message")
        val MESSAGE: EventType<ExtendableMessageEvent>
    }
}
