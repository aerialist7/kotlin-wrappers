// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util


/**
 * Returns `true` if the given `object` is a `RegExp`. Otherwise, returns `false`.
 *
 * ```js
 * const util = require('util');
 *
 * util.isRegExp(/some regexp/);
 * // Returns: true
 * util.isRegExp(new RegExp('another regexp'));
 * // Returns: true
 * util.isRegExp({});
 * // Returns: false
 * ```
 * @since v0.6.0
 * @deprecated Since v4.0.0 - Deprecated
 */
external fun isRegExp(`object`: Any?): Boolean