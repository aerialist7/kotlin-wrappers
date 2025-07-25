// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.objects.JsPlainObject
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Creates an [IonImageryProvider] instance for ion's default global base imagery layer, currently Bing Maps.
 * ```
 * // Create a Cesium World Imagery base layer with default settings
 * try {
 *   const imageryProvider = await createWorldImageryAsync();
 * } catch (error) {
 *   console.log(`There was an error creating world imagery: ${error}`);
 * }
 * ```
 * ```
 * // Create Cesium World Imagery with different style
 * try {
 *   const imageryProvider = await createWorldImageryAsync({
 *         style: IonWorldImageryStyle.AERIAL_WITH_LABELS
 *   });
 * } catch (error) {
 *   console.log(`There was an error creating world imagery: ${error}`);
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#createWorldImageryAsync">Online Documentation</a>
 */
@JsAsync
@Suppress("WRONG_EXTERNAL_DECLARATION")
external suspend fun createWorldImagery(options: CreateWorldImageryAsyncOptions? = definedExternally): IonImageryProvider

external fun createWorldImageryAsync(options: CreateWorldImageryAsyncOptions? = definedExternally): Promise<IonImageryProvider>

/**
 * @property [style] The style of base imagery, only AERIAL, AERIAL_WITH_LABELS, and ROAD are currently supported.
 *   Default value - [IonWorldImageryStyle]
 */
@JsPlainObject
external interface CreateWorldImageryAsyncOptions {
    val style: IonWorldImageryStyle?
}
