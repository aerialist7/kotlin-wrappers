// Generated by Karakum - do not modify it manually!

package node.module

/**
 * The `load` hook provides a way to define a custom method of determining how a
 * URL should be interpreted, retrieved, and parsed. It is also in charge of
 * validating the import attributes.
 */
typealias LoadHook = (url: String, context: LoadHookContext, nextLoad: (url: String, context: LoadHookContext? /* use undefined for default */) -> js.promise.PromiseResult<LoadFnOutput>) -> js.promise.PromiseResult<LoadFnOutput>
