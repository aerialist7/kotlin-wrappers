// Generated by Karakum - do not modify it manually!

package node.http2

import js.errors.JsError

import node.http.OutgoingHttpHeaders

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface Http2Stream : node.stream.Duplex {
    /**
     * Set to `true` if the `Http2Stream` instance was aborted abnormally. When set,
     * the `'aborted'` event will have been emitted.
     * @since v8.4.0
     */
    val aborted: Boolean

    /**
     * This property shows the number of characters currently buffered to be written.
     * See `net.Socket.bufferSize` for details.
     * @since v11.2.0, v10.16.0
     */
    val bufferSize: Double

    /**
     * Set to `true` if the `Http2Stream` instance has been closed.
     * @since v9.4.0
     */
    override val closed: Boolean

    /**
     * Set to `true` if the `Http2Stream` instance has been destroyed and is no longer
     * usable.
     * @since v8.4.0
     */
    @JsName("destroyed")
    val readonlyDestroyed: Boolean

    /**
     * Set to `true` if the `END_STREAM` flag was set in the request or response
     * HEADERS frame received, indicating that no additional data should be received
     * and the readable side of the `Http2Stream` will be closed.
     * @since v10.11.0
     */
    val endAfterHeaders: Boolean

    /**
     * The numeric stream identifier of this `Http2Stream` instance. Set to `undefined` if the stream identifier has not yet been assigned.
     * @since v8.4.0
     */
    val id: Double?

    /**
     * Set to `true` if the `Http2Stream` instance has not yet been assigned a
     * numeric stream identifier.
     * @since v9.4.0
     */
    val pending: Boolean

    /**
     * Set to the `RST_STREAM` `error code` reported when the `Http2Stream` is
     * destroyed after either receiving an `RST_STREAM` frame from the connected peer,
     * calling `http2stream.close()`, or `http2stream.destroy()`. Will be `undefined` if the `Http2Stream` has not been closed.
     * @since v8.4.0
     */
    val rstCode: Double

    /**
     * An object containing the outbound headers sent for this `Http2Stream`.
     * @since v9.5.0
     */
    val sentHeaders: OutgoingHttpHeaders

    /**
     * An array of objects containing the outbound informational (additional) headers
     * sent for this `Http2Stream`.
     * @since v9.5.0
     */
    val sentInfoHeaders: js.array.ReadonlyArray<OutgoingHttpHeaders>?

    /**
     * An object containing the outbound trailers sent for this `HttpStream`.
     * @since v9.5.0
     */
    val sentTrailers: OutgoingHttpHeaders?

    /**
     * A reference to the `Http2Session` instance that owns this `Http2Stream`. The
     * value will be `undefined` after the `Http2Stream` instance is destroyed.
     * @since v8.4.0
     */
    val session: Http2Session?

    /**
     * Provides miscellaneous information about the current state of the `Http2Stream`.
     *
     * A current state of this `Http2Stream`.
     * @since v8.4.0
     */
    val state: StreamState

    /**
     * Closes the `Http2Stream` instance by sending an `RST_STREAM` frame to the
     * connected HTTP/2 peer.
     * @since v8.4.0
     * @param [code=http2.constants.NGHTTP2_NO_ERROR] Unsigned 32-bit integer identifying the error code.
     * @param callback An optional function registered to listen for the `'close'` event.
     */
    fun close(code: Number = definedExternally, callback: () -> Unit = definedExternally): Unit

    /**
     * Updates the priority for this `Http2Stream` instance.
     * @since v8.4.0
     */
    fun priority(options: StreamPriorityOptions): Unit

    /**
     * ```js
     * const http2 = require('node:http2');
     * const client = http2.connect('http://example.org:8000');
     * const { NGHTTP2_CANCEL } = http2.constants;
     * const req = client.request({ ':path': '/' });
     *
     * // Cancel the stream if there's no activity after 5 seconds
     * req.setTimeout(5000, () => req.close(NGHTTP2_CANCEL));
     * ```
     * @since v8.4.0
     */
    fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally): Unit

    /**
     * Sends a trailing `HEADERS` frame to the connected HTTP/2 peer. This method
     * will cause the `Http2Stream` to be immediately closed and must only be
     * called after the `'wantTrailers'` event has been emitted. When sending a
     * request or sending a response, the `options.waitForTrailers` option must be set
     * in order to keep the `Http2Stream` open after the final `DATA` frame so that
     * trailers can be sent.
     *
     * ```js
     * const http2 = require('node:http2');
     * const server = http2.createServer();
     * server.on('stream', (stream) => {
     *   stream.respond(undefined, { waitForTrailers: true });
     *   stream.on('wantTrailers', () => {
     *     stream.sendTrailers({ xyz: 'abc' });
     *   });
     *   stream.end('Hello World');
     * });
     * ```
     *
     * The HTTP/1 specification forbids trailers from containing HTTP/2 pseudo-header
     * fields (e.g. `':method'`, `':path'`, etc).
     * @since v10.0.0
     */
    fun sendTrailers(headers: OutgoingHttpHeaders): Unit
    fun addListener(event: Http2StreamEvent.ABORTED, listener: () -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.END, listener: () -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: Http2StreamEvent.FRAMEERROR,
        listener: (frameType: Double, errorCode: Double) -> Unit,
    ): Unit /* this */

    fun addListener(event: Http2StreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.STREAMCLOSED, listener: (code: Double) -> Unit): Unit /* this */
    fun addListener(event: Http2StreamEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: Http2StreamEvent.TRAILERS,
        listener: (trailers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun addListener(event: Http2StreamEvent.WANTTRAILERS, listener: () -> Unit): Unit /* this */
    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun addListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun emit(event: Http2StreamEvent.ABORTED): Boolean
    fun emit(event: Http2StreamEvent.CLOSE): Boolean
    fun emit(event: Http2StreamEvent.DATA, chunk: node.buffer.Buffer): Boolean

    fun emit(event: Http2StreamEvent.DATA, chunk: String): Boolean
    fun emit(event: Http2StreamEvent.DRAIN): Boolean
    fun emit(event: Http2StreamEvent.END): Boolean
    fun emit(event: Http2StreamEvent.ERROR, err: JsError): Boolean
    fun emit(event: Http2StreamEvent.FINISH): Boolean
    fun emit(event: Http2StreamEvent.FRAMEERROR, frameType: Number, errorCode: Number): Boolean
    fun emit(event: Http2StreamEvent.PIPE, src: node.stream.Readable): Boolean
    fun emit(event: Http2StreamEvent.UNPIPE, src: node.stream.Readable): Boolean
    fun emit(event: Http2StreamEvent.STREAMCLOSED, code: Number): Boolean
    fun emit(event: Http2StreamEvent.TIMEOUT): Boolean
    fun emit(event: Http2StreamEvent.TRAILERS, trailers: IncomingHttpHeaders, flags: Number): Boolean
    fun emit(event: Http2StreamEvent.WANTTRAILERS): Boolean
    override fun emit(event: String, vararg args: Any?): Boolean

    override fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean
    fun on(event: Http2StreamEvent.ABORTED, listener: () -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.END, listener: () -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun on(
        event: Http2StreamEvent.FRAMEERROR,
        listener: (frameType: Double, errorCode: Double) -> Unit,
    ): Unit /* this */

    fun on(event: Http2StreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.STREAMCLOSED, listener: (code: Double) -> Unit): Unit /* this */
    fun on(event: Http2StreamEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun on(
        event: Http2StreamEvent.TRAILERS,
        listener: (trailers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun on(event: Http2StreamEvent.WANTTRAILERS, listener: () -> Unit): Unit /* this */
    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: Http2StreamEvent.ABORTED, listener: () -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.END, listener: () -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun once(
        event: Http2StreamEvent.FRAMEERROR,
        listener: (frameType: Double, errorCode: Double) -> Unit,
    ): Unit /* this */

    fun once(event: Http2StreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.STREAMCLOSED, listener: (code: Double) -> Unit): Unit /* this */
    fun once(event: Http2StreamEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun once(
        event: Http2StreamEvent.TRAILERS,
        listener: (trailers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun once(event: Http2StreamEvent.WANTTRAILERS, listener: () -> Unit): Unit /* this */
    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: Http2StreamEvent.ABORTED, listener: () -> Unit): Unit /* this */
    fun prependListener(event: Http2StreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: Http2StreamEvent.DATA,
        listener: (chunk: Any /* Buffer | string */) -> Unit,
    ): Unit /* this */

    fun prependListener(event: Http2StreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependListener(event: Http2StreamEvent.END, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: Http2StreamEvent.ERROR,
        listener: (err: JsError) -> Unit,
    ): Unit /* this */

    fun prependListener(event: Http2StreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: Http2StreamEvent.FRAMEERROR,
        listener: (frameType: Double, errorCode: Double) -> Unit,
    ): Unit /* this */

    fun prependListener(event: Http2StreamEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun prependListener(event: Http2StreamEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun prependListener(event: Http2StreamEvent.STREAMCLOSED, listener: (code: Double) -> Unit): Unit /* this */
    fun prependListener(event: Http2StreamEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: Http2StreamEvent.TRAILERS,
        listener: (trailers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun prependListener(event: Http2StreamEvent.WANTTRAILERS, listener: () -> Unit): Unit /* this */
    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(event: Http2StreamEvent.ABORTED, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: Http2StreamEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: Http2StreamEvent.DATA,
        listener: (chunk: Any /* Buffer | string */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: Http2StreamEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: Http2StreamEvent.END, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: Http2StreamEvent.ERROR,
        listener: (err: JsError) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: Http2StreamEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: Http2StreamEvent.FRAMEERROR,
        listener: (frameType: Double, errorCode: Double) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2StreamEvent.PIPE,
        listener: (src: node.stream.Readable) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2StreamEvent.UNPIPE,
        listener: (src: node.stream.Readable) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: Http2StreamEvent.STREAMCLOSED, listener: (code: Double) -> Unit): Unit /* this */
    fun prependOnceListener(event: Http2StreamEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: Http2StreamEvent.TRAILERS,
        listener: (trailers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: Http2StreamEvent.WANTTRAILERS, listener: () -> Unit): Unit /* this */
    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */
}
