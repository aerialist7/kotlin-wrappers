// Automatically generated - do not modify!

package web.payment

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.Void
import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The Payment Request API's **`PaymentRequest`** interface is the primary access point into the API, and lets web content and apps accept payments from the end user on behalf of the operator of the site or the publisher of the app.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest)
 */
open external class PaymentRequest(
    methodData: ReadonlyArray<PaymentMethodData>,
    details: PaymentDetailsInit,
    options: PaymentOptions = definedExternally,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event)
     */
    var onpaymentmethodchange: EventHandler<PaymentMethodChangeEvent, PaymentRequest, PaymentRequest>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/abort)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun abort()

    @JsName("abort")
    fun abortAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/canMakePayment)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun canMakePayment(): Boolean

    @JsName("canMakePayment")
    fun canMakePaymentAsync(): Promise<JsBoolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun show(detailsPromise: PaymentDetailsUpdate = definedExternally): PaymentResponse

    @JsName("show")
    fun showAsync(detailsPromise: PaymentDetailsUpdate = definedExternally): Promise<PaymentResponse>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun show(detailsPromise: PromiseLike<PaymentDetailsUpdate>): PaymentResponse

    @JsName("show")
    fun showAsync(detailsPromise: PromiseLike<PaymentDetailsUpdate>): Promise<PaymentResponse>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event)
     */
    @JsEvent("paymentmethodchange")
    val paymentMethodChangeEvent: EventInstance<PaymentMethodChangeEvent, PaymentRequest /* this */, PaymentRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingaddresschange_event)
     */
    @JsEvent("shippingaddresschange")
    val shippingAddressChangeEvent: EventInstance<PaymentRequestUpdateEvent, PaymentRequest /* this */, PaymentRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingoptionchange_event)
     */
    @JsEvent("shippingoptionchange")
    val shippingOptionChangeEvent: EventInstance<PaymentRequestUpdateEvent, PaymentRequest /* this */, PaymentRequest /* this */>
}
