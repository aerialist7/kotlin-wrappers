// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

import js.array.ReadonlyArray
import js.buffer.ArrayBufferView

/**
 * Read from a file specified by `fd` and write to an array of `ArrayBufferView`s
 * using `readv()`.
 *
 * `position` is the offset from the beginning of the file from where data
 * should be read. If `typeof position !== 'number'`, the data will be read
 * from the current position.
 *
 * The callback will be given three arguments: `err`, `bytesRead`, and `buffers`. `bytesRead` is how many bytes were read from the file.
 *
 * If this method is invoked as its `util.promisify()` ed version, it returns
 * a promise for an `Object` with `bytesRead` and `buffers` properties.
 * @since v13.13.0, v12.17.0
 * @param [position='null']
 */
external fun readv(
    fd: Number,
    buffers: ReadonlyArray<ArrayBufferView<*>>,
    cb: (err: node.ErrnoException?, bytesRead: Double, buffers: ReadonlyArray<ArrayBufferView<*>>) -> Unit,
)

external fun readv(
    fd: Number,
    buffers: ReadonlyArray<ArrayBufferView<*>>,
    position: Number,
    cb: (err: node.ErrnoException?, bytesRead: Double, buffers: ReadonlyArray<ArrayBufferView<*>>) -> Unit,
)
