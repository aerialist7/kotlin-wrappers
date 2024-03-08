// Generated by Karakum - do not modify it manually!

package node.cluster


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface WorkerEvent {
    sealed interface DISCONNECT : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface EXIT : node.events.LegacyEventType
    sealed interface LISTENING : node.events.LegacyEventType
    sealed interface MESSAGE : node.events.LegacyEventType
    sealed interface ONLINE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("disconnect")
        val DISCONNECT: DISCONNECT

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("exit")
        val EXIT: EXIT

        @seskar.js.JsValue("listening")
        val LISTENING: LISTENING

        @seskar.js.JsValue("message")
        val MESSAGE: MESSAGE

        @seskar.js.JsValue("online")
        val ONLINE: ONLINE

        @seskar.js.JsValue("disconnect")
        fun disconnect(): node.events.EventType<Worker, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Worker, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("exit")
        fun exit(): node.events.EventType<Worker, js.array.JsTuple2<Double, String>>

        @seskar.js.JsValue("listening")
        fun listening(): node.events.EventType<Worker, js.array.JsTuple1<Address>>

        @seskar.js.JsValue("message")
        fun message(): node.events.EventType<Worker, js.array.JsTuple2<Any?, Any /* net.Socket | net.Server */>>

        @seskar.js.JsValue("online")
        fun online(): node.events.EventType<Worker, js.array.JsTuple>
    }
}
