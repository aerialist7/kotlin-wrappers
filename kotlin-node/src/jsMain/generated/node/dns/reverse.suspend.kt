// Generated by Karakum - do not modify it manually!

package node.dns

import js.promise.await


suspend fun reverse(ip: String): js.array.ReadonlyArray<String> =
    reverseAsync(
        ip
    ).await()