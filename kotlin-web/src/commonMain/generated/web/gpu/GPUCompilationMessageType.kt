// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUCompilationMessageType {
    companion object {
        @JsValue("error")
        val error: GPUCompilationMessageType

        @JsValue("info")
        val info: GPUCompilationMessageType

        @JsValue("warning")
        val warning: GPUCompilationMessageType
    }
}
