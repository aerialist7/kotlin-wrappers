@file:JsModule("node:readline/promises")

package node.readline

import js.promise.Promise
import js.promise.await
import node.events.Abortable


external class Interface : _Interface {
    /**
     * The rl.question() method displays the query by writing it to the output, waits for user input to be provided on input,
     * then invokes the callback function passing the provided input as the first argument.
     *
     * When called, rl.question() will resume the input stream if it has been paused.
     *
     * If the readlinePromises.Interface was created with output set to null or undefined the query is not written.
     *
     * If the question is called after rl.close(), it returns a rejected promise.
     *
     * Example usage:
     *
     * ```js
     * const answer = await rl.question('What is your favorite food? ');
     * console.log(`Oh, so your favorite food is ${answer}`);
     * ```
     *
     * Using an AbortSignal to cancel a question.
     *
     * ```js
     * const signal = AbortSignal.timeout(10_000);
     *
     * signal.addEventListener('abort', () => {
     *   console.log('The food question timed out');
     * }, { once: true });
     *
     * const answer = await rl.question('What is your favorite food? ', { signal });
     * console.log(`Oh, so your favorite food is ${answer}`);
     * ```
     *
     * @since v17.0.0
     * @param query A statement or query to write to output, prepended to the prompt.
     */

    @JsName("question")
    fun questionAsync(query: String): Promise<String>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
        "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
        "DECLARATION_CANT_BE_INLINED",
    )
    suspend inline fun question(query: String): String =
        questionAsync(
            query
        ).await()


    @JsName("question")
    fun questionAsync(query: String, options: Abortable): Promise<String>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
        "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
        "DECLARATION_CANT_BE_INLINED",
    )
    suspend inline fun question(query: String, options: Abortable): String =
        questionAsync(
            query, options
        ).await()

}
