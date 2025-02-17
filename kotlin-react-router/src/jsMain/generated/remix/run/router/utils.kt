// Generated by Karakum - do not modify it manually!

@file:JsModule("@remix-run/router")

package remix.run.router


external val immutableRouteKeys: js.collections.ReadonlySet<ImmutableRouteKey>

/**
 * @private
 */
external val joinPaths: (paths: js.array.ReadonlyArray<String>) -> String

/**
 * @private
 */
external val normalizePathname: (pathname: String) -> String

/**
 * @private
 */
external val normalizeSearch: (search: String) -> String

/**
 * @private
 */
external val normalizeHash: (hash: String) -> String

/**
 * This is a shortcut for creating `application/json` responses. Converts `data`
 * to JSON and sets the `Content-Type` header.
 *
 * @deprecated The `json` method is deprecated in favor of returning raw objects.
 * This method will be removed in v7.
 */
external val json: JsonFunction<*>

/**
 * @deprecated The `defer` method is deprecated in favor of returning raw
 * objects. This method will be removed in v7.
 */
external val defer: DeferFunction

/**
 * A redirect response. Sets the status code and the `Location` header.
 * Defaults to "302 Found".
 */
external val redirect: RedirectFunction

/**
 * A redirect response that will force a document reload to the new location.
 * Sets the status code and the `Location` header.
 * Defaults to "302 Found".
 */
external val redirectDocument: RedirectFunction

/**
 * A redirect response that will perform a `history.replaceState` instead of a
 * `history.pushState` for client-side navigation redirects.
 * Sets the status code and the `Location` header.
 * Defaults to "302 Found".
 */
external val replace: RedirectFunction

/* export {}; */
