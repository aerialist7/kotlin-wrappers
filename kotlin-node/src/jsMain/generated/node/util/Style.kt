// Generated by Karakum - do not modify it manually!


package node.util


sealed external interface Style {
    companion object {
        @seskar.js.JsValue("special")
        val special: Style

        @seskar.js.JsValue("number")
        val number: Style

        @seskar.js.JsValue("bigint")
        val bigint: Style

        @seskar.js.JsValue("boolean")
        val boolean: Style

        @seskar.js.JsValue("undefined")
        val undefined: Style

        @seskar.js.JsValue("null")
        val `null`: Style

        @seskar.js.JsValue("string")
        val string: Style

        @seskar.js.JsValue("symbol")
        val symbol: Style

        @seskar.js.JsValue("date")
        val date: Style

        @seskar.js.JsValue("regexp")
        val regexp: Style

        @seskar.js.JsValue("module")
        val module: Style
    }
}
