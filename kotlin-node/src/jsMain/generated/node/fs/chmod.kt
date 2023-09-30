@file:JsModule("node:fs")

package node.fs


/**
 * Asynchronously changes the permissions of a file. No arguments other than a
 * possible exception are given to the completion callback.
 *
 * See the POSIX [`chmod(2)`](http://man7.org/linux/man-pages/man2/chmod.2.html) documentation for more detail.
 *
 * ```js
 * import { chmod } from 'fs';
 *
 * chmod('my_file.txt', 0o775, (err) => {
 *   if (err) throw err;
 *   console.log('The permissions for file "my_file.txt" have been changed!');
 * });
 * ```
 * @since v0.1.30
 */
external fun chmod(path: PathLike, mode: Mode, callback: NoParamCallback): Unit