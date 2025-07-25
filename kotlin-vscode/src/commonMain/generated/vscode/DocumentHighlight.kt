// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A document highlight is a range inside a text document which deserves
 * special attention. Usually a document highlight is visualized by changing
 * the background color of its range.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentHighlight)
 */
open external class DocumentHighlight {
    /**
     * The range this highlight applies to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentHighlight.range)
     */
    var range: Range

    /**
     * The highlight kind, default is [text][DocumentHighlightKind.Text].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentHighlight.kind)
     */
    var kind: DocumentHighlightKind?

    /**
     * Creates a new document highlight object.
     *
     * @param range The range the highlight applies to.
     * @param kind The highlight kind, default is [text][DocumentHighlightKind.Text].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentHighlight.constructor)
     */
    constructor(
        range: Range,
        kind: DocumentHighlightKind = definedExternally,
    )
}
