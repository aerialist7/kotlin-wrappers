// Generated by Karakum - do not modify it manually!

package node.test


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface TestsStreamEvent {
    sealed interface TEST_DIAGNOSTIC : node.events.LegacyEventType
    sealed interface TEST_FAIL : node.events.LegacyEventType
    sealed interface TEST_PASS : node.events.LegacyEventType
    sealed interface TEST_PLAN : node.events.LegacyEventType
    sealed interface TEST_START : node.events.LegacyEventType
    sealed interface TEST_STDERR : node.events.LegacyEventType
    sealed interface TEST_STDOUT : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("test:diagnostic")
        val TEST_DIAGNOSTIC: TEST_DIAGNOSTIC

        @seskar.js.JsValue("test:fail")
        val TEST_FAIL: TEST_FAIL

        @seskar.js.JsValue("test:pass")
        val TEST_PASS: TEST_PASS

        @seskar.js.JsValue("test:plan")
        val TEST_PLAN: TEST_PLAN

        @seskar.js.JsValue("test:start")
        val TEST_START: TEST_START

        @seskar.js.JsValue("test:stderr")
        val TEST_STDERR: TEST_STDERR

        @seskar.js.JsValue("test:stdout")
        val TEST_STDOUT: TEST_STDOUT

        @seskar.js.JsValue("test:diagnostic")
        fun testDiagnostic(): node.events.EventType<TestsStream, js.array.JsTuple1<DiagnosticData>>

        @seskar.js.JsValue("test:fail")
        fun testFail(): node.events.EventType<TestsStream, js.array.JsTuple1<TestFail>>

        @seskar.js.JsValue("test:pass")
        fun testPass(): node.events.EventType<TestsStream, js.array.JsTuple1<TestPass>>

        @seskar.js.JsValue("test:plan")
        fun testPlan(): node.events.EventType<TestsStream, js.array.JsTuple1<TestPlan>>

        @seskar.js.JsValue("test:start")
        fun testStart(): node.events.EventType<TestsStream, js.array.JsTuple1<TestStart>>

        @seskar.js.JsValue("test:stderr")
        fun testStderr(): node.events.EventType<TestsStream, js.array.JsTuple1<TestStderr>>

        @seskar.js.JsValue("test:stdout")
        fun testStdout(): node.events.EventType<TestsStream, js.array.JsTuple1<TestStdout>>
    }
}
