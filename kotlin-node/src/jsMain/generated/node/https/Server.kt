// Generated by Karakum - do not modify it manually!

@file:JsModule("node:https")

package node.https

import js.errors.JsError
import node.http.IncomingMessage
import node.http.ServerResponse
import node.stream.Duplex


/**
 * See `http.Server` for more information.
 * @since v0.3.4
 */
@Suppress("MANY_CLASSES_IN_SUPERTYPE_LIST")
external class Server<Request : IncomingMessage, Response : ServerResponse<*>> : node.tls.Server, @seskar.js.JsMixin
node.http.Server<Request, Response> {
    constructor (requestListener: node.http.RequestListener<Request, Response> = definedExternally)
    constructor (
        options: ServerOptions<Request, Response>,
        requestListener: node.http.RequestListener<Request, Response> = definedExternally,
    )

    /**
     * Closes all connections connected to this server.
     * @since v18.2.0
     */
    override fun closeAllConnections(): Unit

    /**
     * Closes all connections connected to this server which are not sending a request or waiting for a response.
     * @since v18.2.0
     */
    override fun closeIdleConnections(): Unit
    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: (err: JsError, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: JsError?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: JsError, sessionData: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.SECURECONNECTION,
        listener: (tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: JsError, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun addListener(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: ServerEvent.CONNECTION, listener: (socket: Duplex) -> Unit): Unit /* this */
    fun addListener(event: ServerEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun addListener(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: ServerEvent.CHECKCONTINUE,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.CHECKEXPECTATION,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.CLIENTERROR,
        listener: (err: JsError, socket: Duplex) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.CONNECT,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun addListener(event: ServerEvent.REQUEST, listener: node.http.RequestListener<Request, Response>): Unit /* this */
    fun addListener(
        event: ServerEvent.UPGRADE,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    override fun emit(event: String, vararg args: Any?): Boolean
    fun emit(event: ServerEvent.KEYLOG, line: node.buffer.Buffer, tlsSocket: node.tls.TLSSocket): Boolean
    fun emit(
        event: ServerEvent.NEWSESSION,
        sessionId: node.buffer.Buffer,
        sessionData: node.buffer.Buffer,
        callback: (err: JsError, resp: node.buffer.Buffer) -> Unit,
    ): Boolean

    fun emit(
        event: ServerEvent.OCSPREQUEST,
        certificate: node.buffer.Buffer,
        issuer: node.buffer.Buffer,
        callback: (err: JsError?, resp: node.buffer.Buffer) -> Unit,
    ): Boolean

    fun emit(
        event: ServerEvent.RESUMESESSION,
        sessionId: node.buffer.Buffer,
        callback: (err: JsError, sessionData: node.buffer.Buffer) -> Unit,
    ): Boolean

    fun emit(event: ServerEvent.SECURECONNECTION, tlsSocket: node.tls.TLSSocket): Boolean
    fun emit(event: ServerEvent.TLSCLIENTERROR, err: JsError, tlsSocket: node.tls.TLSSocket): Boolean
    fun emit(event: ServerEvent.CLOSE): Boolean
    fun emit(event: ServerEvent.CONNECTION, socket: Duplex): Boolean
    fun emit(event: ServerEvent.ERROR, err: JsError): Boolean
    fun emit(event: ServerEvent.LISTENING): Boolean
    fun emit(event: ServerEvent.CHECKCONTINUE, req: Request, res: Response): Boolean
    fun emit(event: ServerEvent.CHECKEXPECTATION, req: Request, res: Response): Boolean
    fun emit(event: ServerEvent.CLIENTERROR, err: JsError, socket: Duplex): Boolean
    fun emit(event: ServerEvent.CONNECT, req: Request, socket: Duplex, head: node.buffer.Buffer): Boolean
    fun emit(event: ServerEvent.REQUEST, req: Request, res: Response): Boolean
    fun emit(event: ServerEvent.UPGRADE, req: Request, socket: Duplex, head: node.buffer.Buffer): Boolean
    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun on(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: (err: JsError, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: JsError?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: JsError, sessionData: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun on(event: ServerEvent.SECURECONNECTION, listener: (tlsSocket: node.tls.TLSSocket) -> Unit): Unit /* this */
    fun on(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: JsError, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun on(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: ServerEvent.CONNECTION, listener: (socket: Duplex) -> Unit): Unit /* this */
    fun on(event: ServerEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun on(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun on(event: ServerEvent.CHECKCONTINUE, listener: node.http.RequestListener<Request, Response>): Unit /* this */
    fun on(event: ServerEvent.CHECKEXPECTATION, listener: node.http.RequestListener<Request, Response>): Unit /* this */
    fun on(
        event: ServerEvent.CLIENTERROR,
        listener: (err: JsError, socket: Duplex) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerEvent.CONNECT,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun on(event: ServerEvent.REQUEST, listener: node.http.RequestListener<Request, Response>): Unit /* this */
    fun on(
        event: ServerEvent.UPGRADE,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: (err: JsError, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: JsError?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: JsError, sessionData: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun once(event: ServerEvent.SECURECONNECTION, listener: (tlsSocket: node.tls.TLSSocket) -> Unit): Unit /* this */
    fun once(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: JsError, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun once(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: ServerEvent.CONNECTION, listener: (socket: Duplex) -> Unit): Unit /* this */
    fun once(event: ServerEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun once(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun once(event: ServerEvent.CHECKCONTINUE, listener: node.http.RequestListener<Request, Response>): Unit /* this */
    fun once(
        event: ServerEvent.CHECKEXPECTATION,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun once(
        event: ServerEvent.CLIENTERROR,
        listener: (err: JsError, socket: Duplex) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerEvent.CONNECT,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun once(event: ServerEvent.REQUEST, listener: node.http.RequestListener<Request, Response>): Unit /* this */
    fun once(
        event: ServerEvent.UPGRADE,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: (err: JsError, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: JsError?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: JsError, sessionData: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.SECURECONNECTION,
        listener: (tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: JsError, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependListener(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ServerEvent.CONNECTION, listener: (socket: Duplex) -> Unit): Unit /* this */
    fun prependListener(event: ServerEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun prependListener(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: ServerEvent.CHECKCONTINUE,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.CHECKEXPECTATION,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.CLIENTERROR,
        listener: (err: JsError, socket: Duplex) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.CONNECT,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.REQUEST,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.UPGRADE,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: (err: JsError, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: JsError?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: JsError, sessionData: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.SECURECONNECTION,
        listener: (tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: JsError, tlsSocket: node.tls.TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: ServerEvent.CONNECTION, listener: (socket: Duplex) -> Unit): Unit /* this */
    fun prependOnceListener(event: ServerEvent.ERROR, listener: (err: JsError) -> Unit): Unit /* this */
    fun prependOnceListener(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ServerEvent.CHECKCONTINUE,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.CHECKEXPECTATION,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.CLIENTERROR,
        listener: (err: JsError, socket: Duplex) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.CONNECT,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.REQUEST,
        listener: node.http.RequestListener<Request, Response>,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.UPGRADE,
        listener: (req: Request, socket: Duplex, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */
}
