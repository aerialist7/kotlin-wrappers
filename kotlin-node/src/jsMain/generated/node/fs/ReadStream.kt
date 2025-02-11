// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

import node.stream.ReadableOptions

/**
 * Instances of `fs.ReadStream` are created and returned using the {@link createReadStream} function.
 * @since v0.1.93
 */
external class ReadStream : node.stream.Readable {
    constructor (opts: ReadableOptions = definedExternally)

    fun close(callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit = definedExternally): Unit

    /**
     * The number of bytes that have been read so far.
     * @since v6.4.0
     */
    var bytesRead: Double

    /**
     * The path to the file the stream is reading from as specified in the first
     * argument to `fs.createReadStream()`. If `path` is passed as a string, then`readStream.path` will be a string. If `path` is passed as a `Buffer`, then`readStream.path` will be a
     * `Buffer`. If `fd` is specified, then`readStream.path` will be `undefined`.
     * @since v0.1.93
     */
    var path: Any /* string | Buffer */

    /**
     * This property is `true` if the underlying file has not been opened yet,
     * i.e. before the `'ready'` event is emitted.
     * @since v11.2.0, v10.16.0
     */
    var pending: Boolean

    /**
     * events.EventEmitter
     *   1. open
     *   2. close
     *   3. ready
     */


    @web.events.JsEvent("close")
    override val closeEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("data")
    override val dataEvent: node.events.EventInstance<js.array.JsTuple1<Any /* Buffer | string */>>

    @web.events.JsEvent("end")
    override val endEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("error")
    override val errorEvent: node.events.EventInstance<js.array.JsTuple1<js.errors.JsError>>

    @web.events.JsEvent("open")
    val openEvent: node.events.EventInstance<js.array.JsTuple1<Number>>

    @web.events.JsEvent("pause")
    override val pauseEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("readable")
    override val readableEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("ready")
    val readyEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("resume")
    override val resumeEvent: node.events.EventInstance<js.array.JsTuple>
}
