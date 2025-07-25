// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * The location of the terminal.
 */
sealed /* enum */
external interface TerminalLocation {
    companion object {
        /**
         * In the terminal view
         */
        val Panel: TerminalLocation // 1

        /**
         * In the editor area
         */
        val Editor: TerminalLocation // 2
    }
}
