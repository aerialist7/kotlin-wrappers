// Generated by Karakum - do not modify it manually!

package node.module

sealed external interface RequireResolve {
    /**
     * Use the internal `require()` machinery to look up the location of a module,
     * but rather than loading the module, just return the resolved filename.
     *
     * If the module can not be found, a `MODULE_NOT_FOUND` error is thrown.
     * @since v0.3.0
     * @param request The module path to resolve.
     */
    @seskar.js.JsNative
    operator fun invoke(request: String, options: RequireResolveOptions = definedExternally): String

    /**
     * Returns an array containing the paths searched during resolution of `request` or
     * `null` if the `request` string references a core module, for example `http` or
     * `fs`.
     * @since v8.9.0
     * @param request The module path whose lookup paths are being retrieved.
     */
    fun paths(request: String): js.array.ReadonlyArray<String>?
}
