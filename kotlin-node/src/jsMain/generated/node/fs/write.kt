@file:JsModule("node:fs")

package node.fs


/**
 * Write `buffer` to the file specified by `fd`.
 *
 * `offset` determines the part of the buffer to be written, and `length` is
 * an integer specifying the number of bytes to write.
 *
 * `position` refers to the offset from the beginning of the file where this data
 * should be written. If `typeof position !== 'number'`, the data will be written
 * at the current position. See [`pwrite(2)`](http://man7.org/linux/man-pages/man2/pwrite.2.html).
 *
 * The callback will be given three arguments `(err, bytesWritten, buffer)` where`bytesWritten` specifies how many _bytes_ were written from `buffer`.
 *
 * If this method is invoked as its `util.promisify()` ed version, it returns
 * a promise for an `Object` with `bytesWritten` and `buffer` properties.
 *
 * It is unsafe to use `fs.write()` multiple times on the same file without waiting
 * for the callback. For this scenario, {@link createWriteStream} is
 * recommended.
 *
 * On Linux, positional writes don't work when the file is opened in append mode.
 * The kernel ignores the position argument and always appends the data to
 * the end of the file.
 * @since v0.0.2
 */
external fun <TBuffer : js.buffer.ArrayBufferView> write(
    fd: Number,
    buffer: TBuffer,
    offset: Double?,
    length: Double?,
    position: Double?,
    callback: (err: node.ErrnoException?, written: Double, buffer: TBuffer) -> Unit,
): Unit

/**
 * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
 * @param fd A file descriptor.
 * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
 * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
 */
external fun <TBuffer : js.buffer.ArrayBufferView> write(
    fd: Number,
    buffer: TBuffer,
    offset: Double?,
    length: Double?,
    callback: (err: node.ErrnoException?, written: Double, buffer: TBuffer) -> Unit,
): Unit

/**
 * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
 * @param fd A file descriptor.
 * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
 */
external fun <TBuffer : js.buffer.ArrayBufferView> write(
    fd: Number,
    buffer: TBuffer,
    offset: Double?,
    callback: (err: node.ErrnoException?, written: Double, buffer: TBuffer) -> Unit,
): Unit

/**
 * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
 * @param fd A file descriptor.
 */
external fun <TBuffer : js.buffer.ArrayBufferView> write(
    fd: Number,
    buffer: TBuffer,
    callback: (err: node.ErrnoException?, written: Double, buffer: TBuffer) -> Unit,
): Unit

/**
 * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
 * @param fd A file descriptor.
 * @param string A string to write.
 * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
 * @param encoding The expected string encoding.
 */
external fun write(
    fd: Number,
    string: String,
    position: Double?,
    encoding: node.buffer.BufferEncoding?,
    callback: (err: node.ErrnoException?, written: Double, str: String) -> Unit,
): Unit

/**
 * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
 * @param fd A file descriptor.
 * @param string A string to write.
 * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
 */
external fun write(
    fd: Number,
    string: String,
    position: Double?,
    callback: (err: node.ErrnoException?, written: Double, str: String) -> Unit,
): Unit

/**
 * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
 * @param fd A file descriptor.
 * @param string A string to write.
 */
external fun write(
    fd: Number,
    string: String,
    callback: (err: node.ErrnoException?, written: Double, str: String) -> Unit,
): Unit