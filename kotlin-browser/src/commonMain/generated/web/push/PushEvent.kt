// Automatically generated - do not modify!

package web.push

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import web.serviceworker.ExtendableEvent
import kotlin.js.definedExternally

/**
 * This Push API interface represents a push message that has been received. This event is sent to the global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent)
 */
open external class PushEvent(
    override val type: EventType<PushEvent>,
    init: PushEventInit = definedExternally,
) : ExtendableEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent/data)
     */
    val data: PushMessageData?

    @JsAlias(THIS)
    override fun asInit(): PushEventInit

    companion object {
        @JsValue("push")
        val PUSH: EventType<PushEvent>
    }
}
