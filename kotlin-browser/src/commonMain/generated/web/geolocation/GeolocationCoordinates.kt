// Automatically generated - do not modify!

package web.geolocation

import js.core.JsAny

/**
 * The **`GeolocationCoordinates`** interface represents the position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates)
 */
external class GeolocationCoordinates
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/accuracy)
     */
    val accuracy: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitude)
     */
    val altitude: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitudeAccuracy)
     */
    val altitudeAccuracy: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/heading)
     */
    val heading: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/latitude)
     */
    val latitude: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/longitude)
     */
    val longitude: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/speed)
     */
    val speed: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/toJSON)
     */
    fun toJSON(): JsAny
}
