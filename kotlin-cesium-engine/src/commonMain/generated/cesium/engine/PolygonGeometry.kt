// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.JsDouble
import js.objects.JsPlainObject

/**
 * A description of a polygon on the ellipsoid. The polygon is defined by a polygon hierarchy. Polygon geometry can be rendered with both [Primitive] and [GroundPrimitive].
 * ```
 * // 1. create a polygon from points
 * const polygon = new PolygonGeometry({
 *   polygonHierarchy : new PolygonHierarchy(
 *     Cartesian3.fromDegreesArray([
 *       -72.0, 40.0,
 *       -70.0, 35.0,
 *       -75.0, 30.0,
 *       -70.0, 30.0,
 *       -68.0, 40.0
 *     ])
 *   )
 * });
 * const geometry = PolygonGeometry.createGeometry(polygon);
 *
 * // 2. create a nested polygon with holes
 * const polygonWithHole = new PolygonGeometry({
 *   polygonHierarchy : new PolygonHierarchy(
 *     Cartesian3.fromDegreesArray([
 *       -109.0, 30.0,
 *       -95.0, 30.0,
 *       -95.0, 40.0,
 *       -109.0, 40.0
 *     ]),
 *     [new PolygonHierarchy(
 *       Cartesian3.fromDegreesArray([
 *         -107.0, 31.0,
 *         -107.0, 39.0,
 *         -97.0, 39.0,
 *         -97.0, 31.0
 *       ]),
 *       [new PolygonHierarchy(
 *         Cartesian3.fromDegreesArray([
 *           -105.0, 33.0,
 *           -99.0, 33.0,
 *           -99.0, 37.0,
 *           -105.0, 37.0
 *         ]),
 *         [new PolygonHierarchy(
 *           Cartesian3.fromDegreesArray([
 *             -103.0, 34.0,
 *             -101.0, 34.0,
 *             -101.0, 36.0,
 *             -103.0, 36.0
 *           ])
 *         )]
 *       )]
 *     )]
 *   )
 * });
 * const geometry = PolygonGeometry.createGeometry(polygonWithHole);
 *
 * // 3. create extruded polygon
 * const extrudedPolygon = new PolygonGeometry({
 *   polygonHierarchy : new PolygonHierarchy(
 *     Cartesian3.fromDegreesArray([
 *       -72.0, 40.0,
 *       -70.0, 35.0,
 *       -75.0, 30.0,
 *       -70.0, 30.0,
 *       -68.0, 40.0
 *     ])
 *   ),
 *   extrudedHeight: 300000
 * });
 * const geometry = PolygonGeometry.createGeometry(extrudedPolygon);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGeometry.html">Online Documentation</a>
 */
external class PolygonGeometry(
    options: ConstructorOptions,
) {
    /**
     * @property [polygonHierarchy] A polygon hierarchy that can include holes.
     * @property [height] The distance in meters between the polygon and the ellipsoid surface.
     *   Default value - `0.0`
     * @property [extrudedHeight] The distance in meters between the polygon's extruded face and the ellipsoid surface.
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     * @property [stRotation] The rotation of the texture coordinates, in radians. A positive rotation is counter-clockwise.
     *   Default value - `0.0`
     * @property [ellipsoid] The ellipsoid to be used as a reference.
     *   Default value - [Ellipsoid.default]
     * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
     *   Default value - [Math.RADIANS_PER_DEGREE]
     * @property [perPositionHeight] Use the height of options.positions for each position instead of using options.height to determine the height.
     *   Default value - `false`
     * @property [closeTop] When false, leaves off the top of an extruded polygon open.
     *   Default value - `true`
     * @property [closeBottom] When false, leaves off the bottom of an extruded polygon open.
     *   Default value - `true`
     * @property [arcType] The type of line the polygon edges must follow. Valid options are [ArcType.GEODESIC] and [ArcType.RHUMB].
     *   Default value - [ArcType.GEODESIC]
     * @property [textureCoordinates] Texture coordinates as a [PolygonHierarchy] of [Cartesian2] points. Has no effect for ground primitives.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val polygonHierarchy: PolygonHierarchy
        val height: Double?
        val extrudedHeight: Double?
        val vertexFormat: VertexFormat?
        val stRotation: Double?
        val ellipsoid: Ellipsoid?
        val granularity: Double?
        val perPositionHeight: Boolean?
        val closeTop: Boolean?
        val closeBottom: Boolean?
        val arcType: ArcType?
        val textureCoordinates: PolygonHierarchy?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGeometry.html#packedLength">Online Documentation</a>
     */
    val packedLength: Int

    companion object {
        /**
         * A description of a polygon from an array of positions. Polygon geometry can be rendered with both [Primitive] and [GroundPrimitive].
         * ```
         * // create a polygon from points
         * const polygon = PolygonGeometry.fromPositions({
         *   positions : Cartesian3.fromDegreesArray([
         *     -72.0, 40.0,
         *     -70.0, 35.0,
         *     -75.0, 30.0,
         *     -70.0, 30.0,
         *     -68.0, 40.0
         *   ])
         * });
         * const geometry = PolygonGeometry.createGeometry(polygon);
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGeometry.html#.fromPositions">Online Documentation</a>
         */
        fun fromPositions(options: FromPositionsOptions): PolygonGeometry

        /**
         * @property [positions] An array of positions that defined the corner points of the polygon.
         * @property [height] The height of the polygon.
         *   Default value - `0.0`
         * @property [extrudedHeight] The height of the polygon extrusion.
         * @property [vertexFormat] The vertex attributes to be computed.
         *   Default value - [VertexFormat.DEFAULT]
         * @property [stRotation] The rotation of the texture coordinates, in radians. A positive rotation is counter-clockwise.
         *   Default value - `0.0`
         * @property [ellipsoid] The ellipsoid to be used as a reference.
         *   Default value - [Ellipsoid.default]
         * @property [granularity] The distance, in radians, between each latitude and longitude. Determines the number of positions in the buffer.
         *   Default value - [Math.RADIANS_PER_DEGREE]
         * @property [perPositionHeight] Use the height of options.positions for each position instead of using options.height to determine the height.
         *   Default value - `false`
         * @property [closeTop] When false, leaves off the top of an extruded polygon open.
         *   Default value - `true`
         * @property [closeBottom] When false, leaves off the bottom of an extruded polygon open.
         *   Default value - `true`
         * @property [arcType] The type of line the polygon edges must follow. Valid options are [ArcType.GEODESIC] and [ArcType.RHUMB].
         *   Default value - [ArcType.GEODESIC]
         * @property [textureCoordinates] Texture coordinates as a [PolygonHierarchy] of [Cartesian2] points. Has no effect for ground primitives.
         */
        @JsPlainObject
        interface FromPositionsOptions {
            val positions: ReadonlyArray<Cartesian3>
            val height: Double?
            val extrudedHeight: Double?
            val vertexFormat: VertexFormat?
            val stRotation: Double?
            val ellipsoid: Ellipsoid?
            val granularity: Double?
            val perPositionHeight: Boolean?
            val closeTop: Boolean?
            val closeBottom: Boolean?
            val arcType: ArcType?
            val textureCoordinates: PolygonHierarchy?
        }

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: PolygonGeometry,
            array: ReadonlyArray<JsDouble>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<JsDouble>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new PolygonGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<JsDouble>,
            startingIndex: Int? = definedExternally,
            result: PolygonGeometry? = definedExternally,
        ): PolygonGeometry

        /**
         * Computes a rectangle which encloses the polygon defined by the list of positions, including cases over the international date line and the poles.
         * @param [positions] A linear ring defining the outer boundary of the polygon.
         * @param [ellipsoid] The ellipsoid to be used as a reference.
         *   Default value - [Ellipsoid.default]
         * @param [arcType] The type of line the polygon edges must follow. Valid options are [ArcType.GEODESIC] and [ArcType.RHUMB].
         *   Default value - [ArcType.GEODESIC]
         * @param [result] An object in which to store the result.
         * @return The result rectangle
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGeometry.html#.computeRectangleFromPositions">Online Documentation</a>
         */
        fun computeRectangleFromPositions(
            positions: ReadonlyArray<Cartesian3>,
            ellipsoid: Ellipsoid? = definedExternally,
            arcType: ArcType? = definedExternally,
            result: Rectangle? = definedExternally,
        ): Rectangle

        /**
         * Computes the geometric representation of a polygon, including its vertices, indices, and a bounding sphere.
         * @param [polygonGeometry] A description of the polygon.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(polygonGeometry: PolygonGeometry): Geometry?
    }
}
