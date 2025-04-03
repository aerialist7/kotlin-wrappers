package web.workers

import js.coroutines.internal.IsolatedCoroutineScope
import js.reflect.legacyUnsafeCast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import web.globals.internal.getGlobalScope

internal fun <T : AbstractWorker, S : WorkerGlobalScope> createWorkerFactory(
    workerName: String,
    scopeClassName: String,
    block: suspend CoroutineScope.(self: S) -> Unit,
): WorkerFactory<T> {
    val self: S = getGlobalScope(scopeClassName)

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return legacyUnsafeCast {
        error("Missed plugin integration! $workerName factory shouldn't be called directly!")
    }
}
