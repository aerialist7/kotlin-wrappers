// Generated by Karakum - do not modify it manually!

package node.module

sealed external interface RegisterOptions<Data> {
    /**
     * If you want to resolve `specifier` relative to a
     * base URL, such as `import.meta.url`, you can pass that URL here. This
     * property is ignored if the `parentURL` is supplied as the second argument.
     * @default 'data:'
     */
    var parentURL: Any? /* string | URL | undefined */

    /**
     * Any arbitrary, cloneable JavaScript value to pass into the
     * {@link initialize} hook.
     */
    var data: Data?

    /**
     * [Transferable objects](https://nodejs.org/docs/latest-v22.x/api/worker_threads.html#portpostmessagevalue-transferlist)
     * to be passed into the `initialize` hook.
     */
    var transferList: js.array.ReadonlyArray<Any?>?
}
