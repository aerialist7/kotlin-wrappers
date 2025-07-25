// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * A particle emitted by a [ParticleSystem].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html">Online Documentation</a>
 */
external class Particle(
    options: ConstructorOptions,
) {
    /**
     * @property [mass] The mass of the particle in kilograms.
     *   Default value - `1.0`
     * @property [position] The initial position of the particle in world coordinates.
     *   Default value - [Cartesian3.ZERO]
     * @property [velocity] The velocity vector of the particle in world coordinates.
     *   Default value - [Cartesian3.ZERO]
     * @property [life] The life of the particle in seconds.
     *   Default value - [Number.MAX_VALUE]
     * @property [image] The URI, HTMLImageElement, or HTMLCanvasElement to use for the billboard.
     * @property [startColor] The color of a particle when it is born.
     *   Default value - [Color.WHITE]
     * @property [endColor] The color of a particle when it dies.
     *   Default value - [Color.WHITE]
     * @property [startScale] The scale of the particle when it is born.
     *   Default value - `1.0`
     * @property [endScale] The scale of the particle when it dies.
     *   Default value - `1.0`
     * @property [imageSize] The dimensions, width by height, to scale the particle image in pixels.
     *   Default value - [Cartesian2(1.0, 1.0)][Cartesian2]
     */
    @JsPlainObject
    interface ConstructorOptions {
        val mass: Double?
        val position: Cartesian3?
        val velocity: Cartesian3?
        val life: Double?
        val image: JsAny?
        val startColor: Color?
        val endColor: Color?
        val startScale: Double?
        val endScale: Double?
        val imageSize: Cartesian2?
    }

    /**
     * The mass of the particle in kilograms.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#mass">Online Documentation</a>
     */
    var mass: Double

    /**
     * The positon of the particle in world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * The velocity of the particle in world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#velocity">Online Documentation</a>
     */
    var velocity: Cartesian3

    /**
     * The life of the particle in seconds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#life">Online Documentation</a>
     */
    var life: Double

    /**
     * The image to use for the particle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#image">Online Documentation</a>
     */
    var image: JsAny

    /**
     * The color of the particle when it is born.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#startColor">Online Documentation</a>
     */
    var startColor: Color

    /**
     * The color of the particle when it dies.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#endColor">Online Documentation</a>
     */
    var endColor: Color

    /**
     * the scale of the particle when it is born.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#startScale">Online Documentation</a>
     */
    var startScale: Double

    /**
     * The scale of the particle when it dies.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#endScale">Online Documentation</a>
     */
    var endScale: Double

    /**
     * The dimensions, width by height, to scale the particle image in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#imageSize">Online Documentation</a>
     */
    var imageSize: Cartesian2

    /**
     * Gets the age of the particle in seconds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#age">Online Documentation</a>
     */
    var age: Double

    /**
     * Gets the age normalized to a value in the range [0.0, 1.0].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Particle.html#normalizedAge">Online Documentation</a>
     */
    var normalizedAge: Double
}
