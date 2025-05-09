package js.generator

import js.array.Tuple
import js.function.JsFunction
import seskar.js.JsSpecialName

internal const val ASYNC_GENERATOR_FUNCTION: String = "(async function* () {}.constructor)"

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
open external class AsyncGeneratorFunction<in A : Tuple, out R : AsyncGenerator<*, *, *>>(
    vararg parameterNames: String,
    body: String,
) : JsFunction<A, R>
