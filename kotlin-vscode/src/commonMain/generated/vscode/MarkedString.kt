// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * MarkedString can be used to render human-readable text. It is either a markdown string
 * or a code-block that provides a language and a code snippet. Note that
 * markdown strings will be sanitized - that means html will be escaped.
 *
 * @deprecated This type is deprecated, please use {@linkcode MarkdownString} instead.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#MarkedString)
 */
typealias MarkedString = JsAny /* string | {
	/**
	 * The language of a markdown code block
	 * @deprecated please use {@linkcode MarkdownString} instead
	 */
	language: string;
	/**
	 * The code snippet of a markdown code block.
	 * @deprecated please use {@linkcode MarkdownString} instead
	 */
	value: string;
} */
