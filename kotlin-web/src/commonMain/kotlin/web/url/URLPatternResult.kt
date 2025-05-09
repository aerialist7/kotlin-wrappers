package web.url

import js.array.Tuple2
import js.core.JsString
import js.objects.JsPlainObject

/**
 * `URLPatternResult` is the object returned from `URLPattern.exec`.
 */
@JsPlainObject
external interface URLPatternResult {
    /** The inputs provided when matching. */
    val inputs: Tuple2<URLPatternInit, JsString?>

    /** The matched result for the `protocol` matcher. */
    val protocol: URLPatternComponentResult

    /** The matched result for the `username` matcher. */
    val username: URLPatternComponentResult

    /** The matched result for the `password` matcher. */
    val password: URLPatternComponentResult

    /** The matched result for the `hostname` matcher. */
    val hostname: URLPatternComponentResult

    /** The matched result for the `port` matcher. */
    val port: URLPatternComponentResult

    /** The matched result for the `pathname` matcher. */
    val pathname: URLPatternComponentResult

    /** The matched result for the `search` matcher. */
    val search: URLPatternComponentResult

    /** The matched result for the `hash` matcher. */
    val hash: URLPatternComponentResult
}
