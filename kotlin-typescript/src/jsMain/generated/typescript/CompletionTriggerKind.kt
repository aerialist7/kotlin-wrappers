// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

sealed external interface CompletionTriggerKind {
    companion object {
        /** Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API. */
        @JsIntValue(1)
        val Invoked: CompletionTriggerKind

        /** Completion was triggered by a trigger character. */
        @JsIntValue(2)
        val TriggerCharacter: CompletionTriggerKind

        /** Completion was re-triggered as the current completion list is incomplete. */
        @JsIntValue(3)
        val TriggerForIncompleteCompletions: CompletionTriggerKind
    }
}
