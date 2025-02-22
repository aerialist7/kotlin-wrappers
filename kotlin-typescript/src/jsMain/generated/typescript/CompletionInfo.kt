// Automatically generated - do not modify!

package typescript

sealed external interface CompletionInfo {
    /** For performance telemetry. */
    var flags: CompletionInfoFlags?

    /** Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
    var isGlobalCompletion: Boolean
    var isMemberCompletion: Boolean

    /**
     * In the absence of `CompletionEntry["replacementSpan"]`, the editor may choose whether to use
     * this span or its default one. If `CompletionEntry["replacementSpan"]` is defined, that span
     * must be used to commit that completion entry.
     */
    var optionalReplacementSpan: TextSpan?

    /**
     * true when the current location also allows for a new identifier
     */
    var isNewIdentifierLocation: Boolean

    /**
     * Indicates to client to continue requesting completions on subsequent keystrokes.
     */
    var isIncomplete: Boolean /* true */?
    var entries: js.array.ReadonlyArray<CompletionEntry>

    /**
     * Default commit characters for the completion entries.
     */
    var defaultCommitCharacters: js.array.ReadonlyArray<String>?
}
