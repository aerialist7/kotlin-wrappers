@file:JsModule("node:readline")

package node.readline


/**
 * The `readline.cursorTo()` method moves cursor to the specified position in a
 * given `TTY` `stream`.
 * @since v0.7.7
 * @param callback Invoked once the operation completes.
 * @return `false` if `stream` wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
 */
external fun cursorTo(
    stream: node.WritableStream,
    x: Number,
    y: Number = definedExternally,
    callback: () -> Unit = definedExternally,
): Boolean
