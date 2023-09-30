@file:JsModule("node:fs")

package node.fs


/**
 * Asynchronously removes files and directories (modeled on the standard POSIX `rm`utility). No arguments other than a possible exception are given to the
 * completion callback.
 * @since v14.14.0
 */
external fun rm(path: PathLike, callback: NoParamCallback): Unit

external fun rm(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit