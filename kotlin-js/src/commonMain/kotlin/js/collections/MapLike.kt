package js.collections

import js.array.JsTuple2
import js.core.JsAny
import js.iterable.JsIterable
import js.iterable.JsIterator

external interface MapLike<K : JsAny?, out V : JsAny?> :
    JsIterable<JsTuple2<K, V>> {

    fun entries(): JsIterator<JsTuple2<K, V>>
    fun keys(): JsIterator<K>
    fun values(): JsIterator<V>

    fun forEach(action: (value: V, key: K) -> Unit)
}
