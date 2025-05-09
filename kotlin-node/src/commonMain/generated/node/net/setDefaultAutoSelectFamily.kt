// Generated by Karakum - do not modify it manually!

@file:JsModule("node:net")

package node.net

/**
 * Sets the default value of the `autoSelectFamily` option of `socket.connect(options)`.
 * @param value The new default value.
 * The initial default value is `true`, unless the command line option
 * `--no-network-family-autoselection` is provided.
 * @since v19.4.0
 */
external fun setDefaultAutoSelectFamily(value: Boolean)
