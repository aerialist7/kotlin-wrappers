// Generated by Karakum - do not modify it manually!

package node.http


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{fifo: 'fifo', lifo: 'lifo'}/*union*/)""")
sealed external interface AgentOptionsScheduling {
    companion object {
        val fifo: AgentOptionsScheduling
        val lifo: AgentOptionsScheduling
    }
}