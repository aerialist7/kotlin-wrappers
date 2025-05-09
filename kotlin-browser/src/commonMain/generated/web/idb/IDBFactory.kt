// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.UInt53
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`IDBFactory`** interface of the IndexedDB API lets applications asynchronously access the indexed databases.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory)
 */
external class IDBFactory
private constructor() {
    /**
     * Compares two values as keys. Returns -1 if key1 precedes key2, 1 if key2 precedes key1, and 0 if the keys are equal.
     *
     * Throws a "DataError" DOMException if either input is not a valid key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/cmp)
     */
    fun cmp(
        first: JsAny?,
        second: JsAny?,
    ): Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/databases)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun databases(): ReadonlyArray<IDBDatabaseInfo>

    @JsName("databases")
    fun databasesAsync(): Promise<ReadonlyArray<IDBDatabaseInfo>>

    /**
     * Attempts to delete the named database. If the database already exists and there are open connections that don't close in response to a versionchange event, the request will be blocked until all they close. If the request is successful request's result will be null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/deleteDatabase)
     */
    fun deleteDatabase(name: String): IDBOpenDBRequest

    /**
     * Attempts to open a connection to the named database with the current version, or 1 if it does not already exist. If the request is successful request's result will be the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/open)
     */
    fun open(
        name: String,
        version: UInt53 = definedExternally,
    ): IDBOpenDBRequest
}
