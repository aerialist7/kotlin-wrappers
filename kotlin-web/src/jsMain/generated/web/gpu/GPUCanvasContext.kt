// Automatically generated - do not modify!

package web.gpu

import web.events.EventTarget
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext)
 */
external class GPUCanvasContext
private constructor() :
    OffscreenRenderingContext,
    RenderingContext {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/canvas)
     */
    val canvas: EventTarget /* HTMLCanvasElement | OffscreenCanvas */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure)
     */
    fun configure(configuration: GPUCanvasConfiguration)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/getCurrentTexture)
     */
    fun getCurrentTexture(): GPUTexture

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/unconfigure)
     */
    fun unconfigure()
}
