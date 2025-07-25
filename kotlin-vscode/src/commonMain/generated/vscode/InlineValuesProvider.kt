// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void

/**
 * The inline values provider interface defines the contract between extensions and the editor's debugger inline values feature.
 * In this contract the provider returns inline value information for a given document range
 * and the editor shows this information in the editor at the end of lines.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValuesProvider)
 */
external interface InlineValuesProvider {
    /**
     * An optional event to signal that inline values have changed.
     * @see [EventEmitter]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValuesProvider.onDidChangeInlineValues)
     */
    var onDidChangeInlineValues: Event<Void>?

    /**
     * Provide "inline value" information for a given document and range.
     * The editor calls this method whenever debugging stops in the given document.
     * The returned inline values information is rendered in the editor at the end of lines.
     *
     * @param document The document for which the inline values information is needed.
     * @param viewPort The visible document range for which inline values should be computed.
     * @param context A bag containing contextual information like the current location.
     * @param token A cancellation token.
     * @returns An array of InlineValueDescriptors or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValuesProvider.provideInlineValues)
     */
    fun provideInlineValues(
        document: TextDocument,
        viewPort: Range,
        context: InlineValueContext,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<InlineValue>>
}
