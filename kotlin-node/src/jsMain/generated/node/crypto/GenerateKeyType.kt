// Generated by Karakum - do not modify it manually!

package node.crypto


sealed external interface GenerateKeyType {
    companion object {
        @seskar.js.JsValue("hmac")
        val hmac: GenerateKeyType

        @seskar.js.JsValue("aes")
        val aes: GenerateKeyType
    }
}
