package web.cssom

import js.reflect.unsafeCast

inline fun ScrollbarColor(
    thumbColor: Color,
    trackColor: Color,
): ScrollbarColor =
    unsafeCast("$thumbColor $trackColor")
