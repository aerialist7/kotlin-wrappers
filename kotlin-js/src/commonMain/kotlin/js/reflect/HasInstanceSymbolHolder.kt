@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.reflect

import js.symbol.Symbol
import kotlin.js.definedExternally as definedExternally_
import seskar.js.JsNativeGetter

external interface HasInstanceSymbolHolder {
    @JsNativeGetter
    operator fun get(
        key: Symbol.hasInstance,
    ): HasInstance = definedExternally_
}
