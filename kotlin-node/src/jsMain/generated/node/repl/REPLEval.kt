// Generated by Karakum - do not modify it manually!


package node.repl

import node.vm.Context

typealias REPLEval = (/* this: REPLServer, */ evalCmd: String, context: Context, file: String, cb: (err: Throwable /* JsError */?, result: Any?) -> Unit) -> Unit