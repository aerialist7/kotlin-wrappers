// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny

/**
 * Converts an object representing a set of name/value pairs into a query string,
 * with names and values encoded properly for use in a URL.  Values that are arrays
 * will produce multiple values with the same name.
 * ```
 * const str = objectToQuery({
 *     key1 : 'some value',
 *     key2 : 'a/b',
 *     key3 : ['x', 'y']
 * });
 * ```
 * @param [obj] The object containing data to encode.
 * @return An encoded query string.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#objectToQuery">Online Documentation</a>
 */
external fun objectToQuery(obj: JsAny): String
