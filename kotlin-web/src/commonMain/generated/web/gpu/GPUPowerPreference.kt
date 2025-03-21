// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUPowerPreference {
    companion object {
        @JsValue("high-performance")
        val highPerformance: GPUPowerPreference

        @JsValue("low-power")
        val lowPower: GPUPowerPreference
    }
}
