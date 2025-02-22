// Generated by Karakum - do not modify it manually!

@file:JsModule("node:tls")

package node.tls

/**
 * An immutable array of strings representing the root certificates (in PEM format)
 * from the bundled Mozilla CA store as supplied by the current Node.js version.
 *
 * The bundled CA store, as supplied by Node.js, is a snapshot of Mozilla CA store
 * that is fixed at release time. It is identical on all supported platforms.
 * @since v12.3.0
 */
external val rootCertificates: js.array.ReadonlyArray<String>
