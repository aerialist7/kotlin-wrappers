// Automatically generated - do not modify!

package web.data

import js.array.ArrayLike
import js.iterable.JsIterable
import web.file.File

/**
 * The **`DataTransferItemList`** object is a list of DataTransferItem objects representing items being dragged.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList)
 */
external class DataTransferItemList
private constructor() :
    ArrayLike<DataTransferItem>,
    JsIterable<DataTransferItem> {
    /**
     * Returns the number of items in the drag data store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/length)
     */
    override val length: Int

    /**
     * Adds a new entry for the given data to the drag data store. If the data is plain text then a type string has to be provided also.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/add)
     */
    fun add(
        data: String,
        type: String,
    ): DataTransferItem?

    fun add(data: File): DataTransferItem?

    /**
     * Removes all the entries in the drag data store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/clear)
     */
    fun clear()

    /**
     * Removes the indexth entry in the drag data store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/remove)
     */
    fun remove(index: Int)
}
