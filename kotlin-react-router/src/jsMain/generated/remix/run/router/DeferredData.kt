// Generated by Karakum - do not modify it manually!

@file:JsModule("@remix-run/router")

package remix.run.router

import js.promise.Promise
import web.abort.AbortSignal
import web.http.ResponseInit

external class DeferredData {
    constructor (data: js.objects.ReadonlyRecord<String, Any?>, responseInit: ResponseInit = definedExternally)

    var data: js.objects.ReadonlyRecord<String, Any?>
    var init: ResponseInit?
    var deferredKeys: js.array.ReadonlyArray<String>
    fun subscribe(fn: (aborted: Boolean, settledKey: String? /* use undefined for default */) -> Unit): () -> Boolean
    fun cancel()
    fun resolveData(signal: AbortSignal): Promise<Boolean>
    val done: Boolean
    val unwrappedData: Any
    val pendingKeys: js.array.ReadonlyArray<String>
}
