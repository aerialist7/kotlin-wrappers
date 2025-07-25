// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * A string that will be quoted depending on the used shell.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellQuotedString)
 */
@JsPlainObject
external interface ShellQuotedString {
    /**
     * The actual string value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellQuotedString.value)
     */
    var value: String

    /**
     * The quoting style to use.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellQuotedString.quoting)
     */
    var quoting: ShellQuoting
}
