// Generated by Karakum - do not modify it manually!

package node.http2

import node.http.IncomingHttpHeaders as Http1IncomingHttpHeaders

sealed external interface IncomingHttpHeaders : Http1IncomingHttpHeaders {
    var `:path`: String?
    var `:method`: String?
    var `:authority`: String?
    var `:scheme`: String?
}
