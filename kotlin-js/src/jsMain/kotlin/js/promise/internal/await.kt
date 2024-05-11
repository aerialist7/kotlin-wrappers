package js.promise.internal

import js.promise.*
import kotlinx.coroutines.await

@PublishedApi
internal suspend fun <T> awaitPromiseResult(
    p: PromiseResult<T>,
): T =
    awaitPromiseLike(p as? Promise<T> ?: p.toPromise())

@PublishedApi
internal suspend fun <T> awaitPromiseLike(
    p: PromiseLike<T>,
): T =
    p.unsafeCast<LegacyPromise<T>>().await()

internal suspend fun <T> awaitOptionalPromiseLike(
    p: PromiseLike<T>?,
): T? =
    if (p != null) {
        awaitPromiseLike(p)
    } else null