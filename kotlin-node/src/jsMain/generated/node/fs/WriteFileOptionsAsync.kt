// Generated by Karakum - do not modify it manually!

package node.fs

import web.abort.Abortable

@js.objects.JsPlainObject
sealed external interface WriteFileAsyncOptions : ObjectEncodingOptions, Abortable {
    var mode: Mode?
    var flag: OpenMode?
    var flush: Boolean?
}
