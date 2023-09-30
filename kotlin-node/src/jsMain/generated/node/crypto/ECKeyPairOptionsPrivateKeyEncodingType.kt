package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{sec1: 'sec1', pkcs8: 'pkcs8'}/*union*/)""")
sealed external interface ECKeyPairOptionsPrivateKeyEncodingType {
    companion object {
        val sec1: ECKeyPairOptionsPrivateKeyEncodingType
        val pkcs8: ECKeyPairOptionsPrivateKeyEncodingType
    }
}