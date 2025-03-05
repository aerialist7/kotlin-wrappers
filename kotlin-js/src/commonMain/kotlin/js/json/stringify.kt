@file:JsQualifier("JSON")

package js.json

import js.import.JsQualifier
import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.definedExternally as definedExternally_

/**
 * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
 * @param value A JavaScript value, usually an object or array, to be converted.
 * @param replacer A function that transforms the results.
 * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
 */
external fun stringify(
    value: JsAny?,
    replacer: Replacer = definedExternally_,
    space: String = definedExternally_,
): String

external fun stringify(
    value: JsAny?,
    replacer: Replacer = definedExternally_,
    space: Int = definedExternally_,
): String

/**
 * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
 * @param value A JavaScript value, usually an object or array, to be converted.
 * @param replacer An array of strings and numbers that acts as an approved list for selecting the object properties that will be stringified.
 * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
 */
external fun stringify(
    value: JsAny?,
    replacer: ReadonlyArray<JsAny /* number | string */> = definedExternally_,
    space: String = definedExternally_,
): String

external fun stringify(
    value: JsAny?,
    replacer: ReadonlyArray<JsAny /* number | string */> = definedExternally_,
    space: Int = definedExternally_,
): String
