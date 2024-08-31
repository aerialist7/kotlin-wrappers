// Generated by Karakum - do not modify it manually!

package node.test

import js.errors.JsError

sealed external interface MockFunctionCall<F : Function<*>, ReturnType /* default is Any /* F extends (...args: any) => infer T ? T : F extends abstract new (...args: any) => infer T ? T : unknown */ */, Args /* default is Any /* F extends (...args: infer Y) => any ? Y : F extends abstract new (...args: infer Y) => any ? Y : unknown[] */ */> {
    /**
     * An array of the arguments passed to the mock function.
     */
    var arguments: Args

    /**
     * If the mocked function threw then this property contains the thrown value.
     */
    var error: Any?

    /**
     * The value returned by the mocked function.
     *
     * If the mocked function threw, it will be `undefined`.
     */
    var result: ReturnType?

    /**
     * An `Error` object whose stack can be used to determine the callsite of the mocked function invocation.
     */
    var stack: JsError

    /**
     * If the mocked function is a constructor, this field contains the class being constructed.
     * Otherwise this will be `undefined`.
     */
    var target: Any? /* F extends abstract new (...args: any) => any ? F : undefined */

    /**
     * The mocked function's `this` value.
     */
    var `this`: Any?
}
