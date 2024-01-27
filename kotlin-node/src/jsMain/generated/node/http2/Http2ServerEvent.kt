// Generated by Karakum - do not modify it manually!

package node.http2


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface Http2ServerEvent : node.events.EventType {
    sealed interface CHECKCONTINUE : Http2ServerEvent
    sealed interface REQUEST : Http2ServerEvent
    sealed interface SESSION : Http2ServerEvent
    sealed interface SESSIONERROR : Http2ServerEvent
    sealed interface STREAM : Http2ServerEvent
    sealed interface TIMEOUT : Http2ServerEvent

    companion object {
        @seskar.js.JsValue("checkContinue")
        val CHECKCONTINUE: CHECKCONTINUE

        @seskar.js.JsValue("request")
        val REQUEST: REQUEST

        @seskar.js.JsValue("session")
        val SESSION: SESSION

        @seskar.js.JsValue("sessionError")
        val SESSIONERROR: SESSIONERROR

        @seskar.js.JsValue("stream")
        val STREAM: STREAM

        @seskar.js.JsValue("timeout")
        val TIMEOUT: TIMEOUT
    }
}