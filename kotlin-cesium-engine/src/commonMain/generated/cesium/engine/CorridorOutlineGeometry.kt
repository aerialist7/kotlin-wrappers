// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.JsDouble
import js.objects.JsPlainObject

/**
 * A description of a corridor outline.
 * ```
 * const corridor = new CorridorOutlineGeometry({
 *   positions : Cartesian3.fromDegreesArray([-72.0, 40.0, -70.0, 35.0]),
 *   width : 100000
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorOutlineGeometry.html">Online Documentation</a>
 */
external class CorridorOutlineGeometry(
    options: ConstructorOptions,
) {
    /**
     * @property [positions] An array of positions that define the center of the corridor outline.
     * @property [width] The distance between the edges of the corridor outline.
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.default]
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [height] The distance in meters between the positions and the ellipsoid surface.
     *   Default value - `0`
     * @property [extrudedHeight] The distance in meters between the extruded face and the ellipsoid surface.
     * @property [cornerType] Determines the style of the corners.
     *   Default value - [CornerType.ROUNDED]
     */
    @JsPlainObject
    interface ConstructorOptions {
        val positions: ReadonlyArray<Cartesian3>
        val width: Double
        val ellipsoid: Ellipsoid?
        val granularity: Double?
        val height: Double?
        val extrudedHeight: Double?
        val cornerType: CornerType?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorOutlineGeometry.html#packedLength">Online Documentation</a>
     */
    val packedLength: Int

    companion object {
        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorOutlineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: CorridorOutlineGeometry,
            array: ReadonlyArray<JsDouble>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<JsDouble>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new CorridorOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<JsDouble>,
            startingIndex: Int? = definedExternally,
            result: CorridorOutlineGeometry? = definedExternally,
        ): CorridorOutlineGeometry

        /**
         * Computes the geometric representation of a corridor, including its vertices, indices, and a bounding sphere.
         * @param [corridorOutlineGeometry] A description of the corridor.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorridorOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(corridorOutlineGeometry: CorridorOutlineGeometry): Geometry?
    }
}
