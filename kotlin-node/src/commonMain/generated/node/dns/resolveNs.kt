// Generated by Karakum - do not modify it manually!

@file:JsModule("node:dns")

package node.dns

/**
 * Uses the DNS protocol to resolve name server records (`NS` records) for the `hostname`. The `addresses` argument passed to the `callback` function will
 * contain an array of name server records available for `hostname` (e.g. `['ns1.example.com', 'ns2.example.com']`).
 * @since v0.1.90
 */
external fun resolveNs(
    hostname: String,
    callback: (err: node.ErrnoException?, addresses: js.array.ReadonlyArray<String>) -> Unit,
)
