@file:JsModule("react-router")

package react.router

import remix.run.router.RouterState
import remix.run.router.TrackedPromise

/* import * as React from "react"; */

/* import type { AgnosticIndexRouteObject, AgnosticNonIndexRouteObject, AgnosticRouteMatch, History, LazyRouteFunction, Location, Action as NavigationType, RelativeRoutingType, Router, StaticHandlerContext, To, TrackedPromise } from "@remix-run/router"; */


@JsName("UNSAFE_DataRouterContext")
external val DataRouterContext: react.Context<DataRouterContextObject?>


@JsName("UNSAFE_DataRouterStateContext")
external val DataRouterStateContext: react.Context<(/* import("@remix-run/router") */ RouterState)?>


external val AwaitContext: react.Context<TrackedPromise?>


@JsName("UNSAFE_NavigationContext")
external val NavigationContext: react.Context<NavigationContextObject>


@JsName("UNSAFE_LocationContext")
external val LocationContext: react.Context<LocationContextObject>


@JsName("UNSAFE_RouteContext")
external val RouteContext: react.Context<RouteContextObject>


external val RouteErrorContext: react.Context<Any?>

/* export {}; */
