// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter)
 */
open external class GPUAdapter
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/features)
     */
    val features: GPUSupportedFeatures

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/info)
     */
    val info: GPUAdapterInfo

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/isFallbackAdapter)
     */
    val isFallbackAdapter: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/limits)
     */
    val limits: GPUSupportedLimits

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice)
     */
    @JsName("requestDevice")
    fun requestDeviceAsync(descriptor: GPUDeviceDescriptor = definedExternally): Promise<GPUDevice>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice)
 */
suspend inline fun GPUAdapter.requestDevice(descriptor: GPUDeviceDescriptor): GPUDevice {
    return requestDeviceAsync(
        descriptor = descriptor,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice)
 */
suspend inline fun GPUAdapter.requestDevice(): GPUDevice {
    return requestDeviceAsync().await()
}
