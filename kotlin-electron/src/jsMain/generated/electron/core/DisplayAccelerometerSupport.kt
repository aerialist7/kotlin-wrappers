// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface DisplayAccelerometerSupport {
    companion object {
        @seskar.js.JsValue("available")
        val available: DisplayAccelerometerSupport

        @seskar.js.JsValue("unavailable")
        val unavailable: DisplayAccelerometerSupport

        @seskar.js.JsValue("unknown")
        val unknown: DisplayAccelerometerSupport
    }
}
