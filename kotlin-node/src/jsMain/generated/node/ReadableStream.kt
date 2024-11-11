// Generated by Karakum - do not modify it manually!

package node

import js.typedarrays.Uint8Array
import node.events.EventEmitter

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface ReadableStream : EventEmitter {
    var readable: Boolean
    fun read(size: Number = definedExternally): Any /* string | Buffer */
    fun setEncoding(encoding: node.buffer.BufferEncoding): Unit /* this */
    fun pause(): Unit /* this */
    fun resume(): Unit /* this */
    fun isPaused(): Boolean
    fun <T : WritableStream> pipe(destination: T, options: ReadableStreamPipeOptions = definedExternally): T
    fun unpipe(destination: WritableStream = definedExternally): Unit /* this */
    fun unshift(chunk: String, encoding: node.buffer.BufferEncoding = definedExternally): Unit

    fun unshift(chunk: Uint8Array<*>, encoding: node.buffer.BufferEncoding = definedExternally): Unit
    fun wrap(stream: ReadableStream): Unit /* this */
}
