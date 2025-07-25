@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.svg

import js.reflect.unsafeCast

sealed external interface RepeatCount {
    companion object
}

inline val RepeatCount.Companion.indefinite: RepeatCount
    get() = unsafeCast("indefinite")

fun RepeatCount(value: Double): RepeatCount =
    unsafeCast(value)
