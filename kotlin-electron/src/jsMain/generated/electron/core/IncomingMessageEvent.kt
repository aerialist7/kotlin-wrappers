// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface IncomingMessageEvent {
    sealed interface ABORTED : node.events.LegacyEventType
    sealed interface DATA : node.events.LegacyEventType
    sealed interface END : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("aborted")
        val ABORTED: ABORTED

        @seskar.js.JsValue("data")
        val DATA: DATA

        @seskar.js.JsValue("end")
        val END: END

        @seskar.js.JsValue("error")
        val ERROR: ERROR
    }
}
