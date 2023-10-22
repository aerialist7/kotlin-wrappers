@file:JsModule("node:readline/promises")

package node.readline

import js.promise.Promise
import js.promise.await


external class Readline {
    /**
     * @param stream A TTY stream.
     */
    constructor (stream: node.WritableStream, options: ReadlineOptions = definedExternally)

    /**
     * The `rl.clearLine()` method adds to the internal list of pending action an action that clears current line of the associated `stream` in a specified direction identified by `dir`.
     * Call `rl.commit()` to see the effect of this method, unless `autoCommit: true` was passed to the constructor.
     */
    fun clearLine(dir: Direction): Unit /* this */

    /**
     * The `rl.clearScreenDown()` method adds to the internal list of pending action an action that clears the associated `stream` from the current position of the cursor down.
     * Call `rl.commit()` to see the effect of this method, unless `autoCommit: true` was passed to the constructor.
     */
    fun clearScreenDown(): Unit /* this */

    /**
     * The `rl.commit()` method sends all the pending actions to the associated `stream` and clears the internal list of pending actions.
     */

    @JsName("commit")
    fun commitAsync(): Promise<Unit>


    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
        "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
        "DECLARATION_CANT_BE_INLINED",
    )
    suspend inline fun commit(): Unit =
        commitAsync(

        ).await()

    /**
     * The `rl.cursorTo()` method adds to the internal list of pending action an action that moves cursor to the specified position in the associated `stream`.
     * Call `rl.commit()` to see the effect of this method, unless `autoCommit: true` was passed to the constructor.
     */
    fun cursorTo(x: Number, y: Number = definedExternally): Unit /* this */

    /**
     * The `rl.moveCursor()` method adds to the internal list of pending action an action that moves the cursor relative to its current position in the associated `stream`.
     * Call `rl.commit()` to see the effect of this method, unless autoCommit: true was passed to the constructor.
     */
    fun moveCursor(dx: Number, dy: Number): Unit /* this */

    /**
     * The `rl.rollback()` method clears the internal list of pending actions without sending it to the associated `stream`.
     */
    fun rollback(): Unit /* this */
}