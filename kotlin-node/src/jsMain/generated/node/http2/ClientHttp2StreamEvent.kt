// Generated by Karakum - do not modify it manually!

package node.http2


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ClientHttp2StreamEvent {
    sealed interface CONTINUE : node.events.LegacyEventType
    sealed interface HEADERS : node.events.LegacyEventType
    sealed interface PUSH : node.events.LegacyEventType
    sealed interface RESPONSE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("continue")
        val CONTINUE: CONTINUE

        @seskar.js.JsValue("headers")
        val HEADERS: HEADERS

        @seskar.js.JsValue("push")
        val PUSH: PUSH

        @seskar.js.JsValue("response")
        val RESPONSE: RESPONSE

        @seskar.js.JsValue("continue")
        fun `continue`(): node.events.EventType<ClientHttp2Stream, js.array.JsTuple>

        @seskar.js.JsValue("headers")
        fun headers(): node.events.EventType<ClientHttp2Stream, js.array.JsTuple2<ClientHttp2StreamAddListenerListenerHeaders, Double>>

        @seskar.js.JsValue("push")
        fun push(): node.events.EventType<ClientHttp2Stream, js.array.JsTuple2<IncomingHttpHeaders, Double>>

        @seskar.js.JsValue("response")
        fun response(): node.events.EventType<ClientHttp2Stream, js.array.JsTuple2<ClientHttp2StreamAddListenerListenerHeaders, Double>>
    }
}
