package js.errors

import js.reflect.unsafeCast

sealed external interface JsErrorName

inline fun JsErrorName(
    value: String,
): JsErrorName =
    unsafeCast(value)
