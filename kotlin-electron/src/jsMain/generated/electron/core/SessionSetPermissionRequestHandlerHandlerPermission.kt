// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface SessionSetPermissionRequestHandlerHandlerPermission {
    companion object {
        @seskar.js.JsValue("clipboard-read")
        val clipboardRead: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("clipboard-sanitized-write")
        val clipboardSanitizedWrite: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("display-capture")
        val displayCapture: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("fullscreen")
        val fullscreen: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("geolocation")
        val geolocation: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("idle-detection")
        val idleDetection: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("media")
        val media: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("mediaKeySystem")
        val mediaKeySystem: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("midi")
        val midi: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("midiSysex")
        val midiSysex: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("notifications")
        val notifications: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("pointerLock")
        val pointerLock: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("keyboardLock")
        val keyboardLock: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("openExternal")
        val openExternal: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("window-management")
        val windowManagement: SessionSetPermissionRequestHandlerHandlerPermission

        @seskar.js.JsValue("unknown")
        val unknown: SessionSetPermissionRequestHandlerHandlerPermission
    }
}