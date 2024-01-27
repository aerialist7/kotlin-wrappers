// Generated by Karakum - do not modify it manually!

@file:JsModule("node:assert/strict")
@file:JsQualifier("assert")

package node.assert


/**
 * Tests if `value` is truthy. It is equivalent to`assert.equal(!!value, true, message)`.
 *
 * If `value` is not truthy, an `AssertionError` is thrown with a `message`property set equal to the value of the `message` parameter. If the `message`parameter is `undefined`, a default
 * error message is assigned. If the `message`parameter is an instance of an `Error` then it will be thrown instead of the`AssertionError`.
 * If no arguments are passed in at all `message` will be set to the string:`` 'No value argument passed to `assert.ok()`' ``.
 *
 * Be aware that in the `repl` the error message will be different to the one
 * thrown in a file! See below for further details.
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.ok(true);
 * // OK
 * assert.ok(1);
 * // OK
 *
 * assert.ok();
 * // AssertionError: No value argument passed to `assert.ok()`
 *
 * assert.ok(false, 'it\'s false');
 * // AssertionError: it's false
 *
 * // In the repl:
 * assert.ok(typeof 123 === 'string');
 * // AssertionError: false == true
 *
 * // In a file (e.g. test.js):
 * assert.ok(typeof 123 === 'string');
 * // AssertionError: The expression evaluated to a falsy value:
 * //
 * //   assert.ok(typeof 123 === 'string')
 *
 * assert.ok(false);
 * // AssertionError: The expression evaluated to a falsy value:
 * //
 * //   assert.ok(false)
 *
 * assert.ok(0);
 * // AssertionError: The expression evaluated to a falsy value:
 * //
 * //   assert.ok(0)
 * ```
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * // Using `assert()` works the same:
 * assert(0);
 * // AssertionError: The expression evaluated to a falsy value:
 * //
 * //   assert(0)
 * ```
 * @since v0.1.21
 */
external fun ok(value: Any?, message: String = definedExternally): Unit /* asserts value */

external fun ok(value: Any?, message: Throwable /* JsError */ = definedExternally): Unit /* asserts value */