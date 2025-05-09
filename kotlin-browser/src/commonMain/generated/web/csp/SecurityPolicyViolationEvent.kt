// Automatically generated - do not modify!

package web.csp

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`SecurityPolicyViolationEvent`** interface inherits from Event, and represents the event object of a `securitypolicyviolation` event sent on an Element/securitypolicyviolation_event, Document/securitypolicyviolation_event, or WorkerGlobalScope/securitypolicyviolation_event when its Content Security Policy (CSP) is violated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent)
 */
open external class SecurityPolicyViolationEvent(
    override val type: EventType<SecurityPolicyViolationEvent>,
    init: SecurityPolicyViolationEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/blockedURI)
     */
    val blockedURI: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/columnNumber)
     */
    val columnNumber: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/disposition)
     */
    val disposition: SecurityPolicyViolationEventDisposition

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/documentURI)
     */
    val documentURI: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/effectiveDirective)
     */
    val effectiveDirective: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/lineNumber)
     */
    val lineNumber: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/originalPolicy)
     */
    val originalPolicy: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/referrer)
     */
    val referrer: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sample)
     */
    val sample: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sourceFile)
     */
    val sourceFile: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/statusCode)
     */
    val statusCode: Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/violatedDirective)
     */
    val violatedDirective: String

    @JsAlias(THIS)
    override fun asInit(): SecurityPolicyViolationEventInit

    companion object {
        @JsValue("securitypolicyviolation")
        val SECURITY_POLICY_VIOLATION: EventType<SecurityPolicyViolationEvent>
    }
}
