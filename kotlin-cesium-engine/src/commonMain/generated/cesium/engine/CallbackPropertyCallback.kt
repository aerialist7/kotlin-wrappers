// Automatically generated - do not modify!

package cesium.engine

import js.core.JsAny

/**
 * A function that returns the value of the property.
 * @param [time] The time for which to retrieve the value. If omitted, the current system time is used.
 *   Default value - `JulianDate.now()`
 * @param [result] The object to store the value into. If omitted, the function must create and return a new instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackProperty.html#.Callback">Online Documentation</a>
 */
typealias CallbackPropertyCallback = (
    time: JulianDate?,
    result: JsAny?,
) -> JsAny
