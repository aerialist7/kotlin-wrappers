// Automatically generated - do not modify!

package web.push

import js.array.ReadonlyArray
import js.core.JsString
import js.promise.Promise
import js.promise.await
import web.permissions.PermissionState
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`PushManager`** interface of the Push API provides a way to receive notifications from third-party servers as well as request URLs for push notifications.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager)
 */
open external class PushManager
private constructor() {
    /**
     * The **`PushManager.getSubscription()`** method of the PushManager interface retrieves an existing push subscription.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/getSubscription)
     */
    @JsName("getSubscription")
    fun getSubscriptionAsync(): Promise<PushSubscription?>

    /**
     * The **`permissionState()`** method of the PushManager interface returns a Promise that resolves to a string indicating the permission state of the push manager.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/permissionState)
     */
    @JsName("permissionState")
    fun permissionStateAsync(options: PushSubscriptionOptionsInit = definedExternally): Promise<PermissionState>

    /**
     * The **`subscribe()`** method of the PushManager interface subscribes to a push service.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/subscribe)
     */
    @JsName("subscribe")
    fun subscribeAsync(options: PushSubscriptionOptionsInit = definedExternally): Promise<PushSubscription>

    companion object {
        /**
         * The **`supportedContentEncodings`** read-only static property of the PushManager interface returns an array of supported content codings that can be used to encrypt the payload of a push message.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/supportedContentEncodings_static)
         */
        val supportedContentEncodings: ReadonlyArray<JsString>
    }
}

/**
 * The **`PushManager.getSubscription()`** method of the PushManager interface retrieves an existing push subscription.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/getSubscription)
 */
suspend inline fun PushManager.getSubscription(): PushSubscription? {
    return getSubscriptionAsync().await()
}

/**
 * The **`permissionState()`** method of the PushManager interface returns a Promise that resolves to a string indicating the permission state of the push manager.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/permissionState)
 */
suspend inline fun PushManager.permissionState(options: PushSubscriptionOptionsInit): PermissionState {
    return permissionStateAsync(
        options = options,
    ).await()
}

/**
 * The **`permissionState()`** method of the PushManager interface returns a Promise that resolves to a string indicating the permission state of the push manager.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/permissionState)
 */
suspend inline fun PushManager.permissionState(): PermissionState {
    return permissionStateAsync().await()
}

/**
 * The **`subscribe()`** method of the PushManager interface subscribes to a push service.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/subscribe)
 */
suspend inline fun PushManager.subscribe(options: PushSubscriptionOptionsInit): PushSubscription {
    return subscribeAsync(
        options = options,
    ).await()
}

/**
 * The **`subscribe()`** method of the PushManager interface subscribes to a push service.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushManager/subscribe)
 */
suspend inline fun PushManager.subscribe(): PushSubscription {
    return subscribeAsync().await()
}
