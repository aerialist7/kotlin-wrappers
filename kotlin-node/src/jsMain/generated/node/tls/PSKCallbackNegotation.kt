package node.tls


sealed external interface PSKCallbackNegotation {
    var psk: Any /* DataView | NodeJS.TypedArray */
    var identity: String
}