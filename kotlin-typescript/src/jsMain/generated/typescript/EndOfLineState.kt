// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

sealed external interface EndOfLineState {
    companion object {
        @JsIntValue(0)
        val None: EndOfLineState

        @JsIntValue(1)
        val InMultiLineCommentTrivia: EndOfLineState

        @JsIntValue(2)
        val InSingleQuoteStringLiteral: EndOfLineState

        @JsIntValue(3)
        val InDoubleQuoteStringLiteral: EndOfLineState

        @JsIntValue(4)
        val InTemplateHeadOrNoSubstitutionTemplate: EndOfLineState

        @JsIntValue(5)
        val InTemplateMiddleOrTail: EndOfLineState

        @JsIntValue(6)
        val InTemplateSubstitutionPosition: EndOfLineState
    }
}
