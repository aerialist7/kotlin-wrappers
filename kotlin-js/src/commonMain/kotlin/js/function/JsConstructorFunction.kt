package js.function

import js.array.JsTuple
import js.core.JsAny
import js.reflect.JsClass
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface JsConstructorFunction<in A : JsTuple, R : JsAny> :
    JsClass<R>
