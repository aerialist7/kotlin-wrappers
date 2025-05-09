// Automatically generated - do not modify!

package web.media.streams

import js.array.ReadonlyArray
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * The **`MediaStream`** interface of the Media Capture and Streams API represents a stream of media content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream)
 */
open external class MediaStream() :
    EventTarget {
    constructor(stream: MediaStream)
    constructor(tracks: ReadonlyArray<MediaStreamTrack>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/active)
     */
    val active: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event)
     */
    var onaddtrack: EventHandler<MediaStreamTrackEvent, MediaStream, MediaStream>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event)
     */
    var onremovetrack: EventHandler<MediaStreamTrackEvent, MediaStream, MediaStream>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addTrack)
     */
    fun addTrack(track: MediaStreamTrack)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/clone)
     */
    fun clone(): MediaStream

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getAudioTracks)
     */
    fun getAudioTracks(): ReadonlyArray<MediaStreamTrack>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTrackById)
     */
    fun getTrackById(trackId: String): MediaStreamTrack?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTracks)
     */
    fun getTracks(): ReadonlyArray<MediaStreamTrack>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getVideoTracks)
     */
    fun getVideoTracks(): ReadonlyArray<MediaStreamTrack>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removeTrack)
     */
    fun removeTrack(track: MediaStreamTrack)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event)
     */
    @JsEvent("addtrack")
    val addTrackEvent: EventInstance<MediaStreamTrackEvent, MediaStream /* this */, MediaStream /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event)
     */
    @JsEvent("removetrack")
    val removeTrackEvent: EventInstance<MediaStreamTrackEvent, MediaStream /* this */, MediaStream /* this */>
}
