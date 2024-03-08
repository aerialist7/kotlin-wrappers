// Generated by Karakum - do not modify it manually!

package node.stream


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ReadableEvent {
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface DATA : node.events.LegacyEventType
    sealed interface END : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface PAUSE : node.events.LegacyEventType
    sealed interface READABLE : node.events.LegacyEventType
    sealed interface RESUME : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("data")
        val DATA: DATA

        @seskar.js.JsValue("end")
        val END: END

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("pause")
        val PAUSE: PAUSE

        @seskar.js.JsValue("readable")
        val READABLE: READABLE

        @seskar.js.JsValue("resume")
        val RESUME: RESUME

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Readable, js.array.JsTuple>

        @seskar.js.JsValue("data")
        fun data(): node.events.EventType<Readable, js.array.JsTuple1<Any?>>

        @seskar.js.JsValue("end")
        fun end(): node.events.EventType<Readable, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Readable, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("pause")
        fun pause(): node.events.EventType<Readable, js.array.JsTuple>

        @seskar.js.JsValue("readable")
        fun readable(): node.events.EventType<Readable, js.array.JsTuple>

        @seskar.js.JsValue("resume")
        fun resume(): node.events.EventType<Readable, js.array.JsTuple>
    }
}
