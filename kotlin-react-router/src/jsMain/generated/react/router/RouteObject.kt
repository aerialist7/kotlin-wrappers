// Generated by Karakum - do not modify it manually!

package react.router

import remix.run.router.ActionLike
import remix.run.router.LazyRouteFunction
import remix.run.router.LoaderLike
import remix.run.router.ShouldRevalidateFunction

@js.objects.JsPlainObject
sealed external interface RouteObject {
    var caseSensitive: Boolean?
    var path: String?
    var id: String?
    var loader: LoaderLike?
    var action: ActionLike?
    var hasErrorBoundary: Boolean?
    var shouldRevalidate: ShouldRevalidateFunction?
    var handle: Any?
    var index: Boolean /* false */?
    var children: js.array.ReadonlyArray<RouteObject>?
    var element: react.ReactNode?
    var hydrateFallbackElement: react.ReactNode?
    var errorElement: react.ReactNode?
    var Component: react.ComponentType<*>?
    var HydrateFallback: react.ComponentType<*>?
    var ErrorBoundary: react.ComponentType<*>?
    var lazy: LazyRouteFunction<RouteObject>?
}
