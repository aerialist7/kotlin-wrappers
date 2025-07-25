// Generated by Karakum - do not modify it manually!

package node.module

import node.Dict

sealed external interface Require {
    /**
     * Used to import modules, `JSON`, and local files.
     * @since v0.1.13
     */
    operator fun invoke(id: String): Any?

    /**
     * Modules are cached in this object when they are required. By deleting a key
     * value from this object, the next `require` will reload the module.
     * This does not apply to
     * [native addons](https://nodejs.org/docs/latest-v22.x/api/addons.html),
     * for which reloading will result in an error.
     * @since v0.3.0
     */
    var cache: Dict<Module>

    /**
     * Instruct `require` on how to handle certain file extensions.
     * @since v0.3.0
     * @deprecated
     */
    var extensions: RequireExtensions

    /**
     * The `Module` object representing the entry script loaded when the Node.js
     * process launched, or `undefined` if the entry point of the program is not a
     * CommonJS module.
     * @since v0.1.17
     */
    var main: Module?

    /**
     * @since v0.3.0
     */
    var resolve: RequireResolve
}
