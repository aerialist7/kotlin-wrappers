// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface ClipboardHasType {
    companion object {
        @seskar.js.JsValue("selection")
        val selection: ClipboardHasType

        @seskar.js.JsValue("clipboard")
        val clipboard: ClipboardHasType
    }
}
