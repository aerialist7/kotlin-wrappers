// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsValue

sealed external interface CanvasLineJoin {
    companion object {
        @JsValue("bevel")
        val bevel: CanvasLineJoin

        @JsValue("miter")
        val miter: CanvasLineJoin

        @JsValue("round")
        val round: CanvasLineJoin
    }
}
