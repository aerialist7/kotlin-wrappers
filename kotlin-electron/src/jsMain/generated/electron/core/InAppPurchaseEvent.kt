// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface InAppPurchaseEvent {
    sealed interface TRANSACTIONS_UPDATED : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("transactions-updated")
        val TRANSACTIONS_UPDATED: TRANSACTIONS_UPDATED
    }
}
