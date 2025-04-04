// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCStatsIceCandidatePairState {
    companion object {
        @JsValue("failed")
        val failed: RTCStatsIceCandidatePairState

        @JsValue("frozen")
        val frozen: RTCStatsIceCandidatePairState

        @JsValue("in-progress")
        val inProgress: RTCStatsIceCandidatePairState

        @JsValue("inprogress")
        val inprogress: RTCStatsIceCandidatePairState

        @JsValue("succeeded")
        val succeeded: RTCStatsIceCandidatePairState

        @JsValue("waiting")
        val waiting: RTCStatsIceCandidatePairState
    }
}
