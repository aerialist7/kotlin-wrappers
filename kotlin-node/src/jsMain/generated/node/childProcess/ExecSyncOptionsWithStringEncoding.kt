// Generated by Karakum - do not modify it manually!


package node.childProcess


sealed external interface ExecSyncOptionsWithStringEncoding : ExecSyncOptions {
    @JsName("encoding")
    var stringEncoding: node.buffer.BufferEncoding
}