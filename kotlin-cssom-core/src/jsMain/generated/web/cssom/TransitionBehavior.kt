// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TransitionBehavior {
    companion object {
        @JsValue("allow-discrete")
        val allowDiscrete: TransitionBehavior

        @JsValue("normal")
        val normal: TransitionBehavior
    }
}
