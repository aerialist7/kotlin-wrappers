// Generated by Karakum - do not modify it manually!


package remix.run.router


/**
 * Non-index routes may have children, but cannot have index
 */

sealed external interface AgnosticNonIndexRouteObject : AgnosticBaseRouteObject {
    var children: js.array.ReadonlyArray<AgnosticRouteObject>?
    var index: Boolean /* false */?
}
