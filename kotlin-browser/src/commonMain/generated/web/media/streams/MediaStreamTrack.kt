// Automatically generated - do not modify!

package web.media.streams

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`MediaStreamTrack`** interface of the Media Capture and Streams API represents a single media track within a stream; typically, these are audio or video tracks, but other track types may exist as well.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack)
 */
open external class MediaStreamTrack
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/contentHint)
     */
    var contentHint: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/enabled)
     */
    var enabled: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/kind)
     */
    val kind: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/label)
     */
    val label: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/muted)
     */
    val muted: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/ended_event)
     */
    var onended: EventHandler<Event, MediaStreamTrack, MediaStreamTrack>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/mute_event)
     */
    var onmute: EventHandler<Event, MediaStreamTrack, MediaStreamTrack>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/unmute_event)
     */
    var onunmute: EventHandler<Event, MediaStreamTrack, MediaStreamTrack>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/readyState)
     */
    val readyState: MediaStreamTrackState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/applyConstraints)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun applyConstraints(constraints: MediaTrackConstraints = definedExternally)

    @JsName("applyConstraints")
    fun applyConstraintsAsync(constraints: MediaTrackConstraints = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/clone)
     */
    fun clone(): MediaStreamTrack

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getCapabilities)
     */
    fun getCapabilities(): MediaTrackCapabilities

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getConstraints)
     */
    fun getConstraints(): MediaTrackConstraints

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getSettings)
     */
    fun getSettings(): MediaTrackSettings

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/stop)
     */
    fun stop()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/ended_event)
     */
    @JsEvent("ended")
    val endedEvent: EventInstance<Event, MediaStreamTrack /* this */, MediaStreamTrack /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/mute_event)
     */
    @JsEvent("mute")
    val muteEvent: EventInstance<Event, MediaStreamTrack /* this */, MediaStreamTrack /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/unmute_event)
     */
    @JsEvent("unmute")
    val unmuteEvent: EventInstance<Event, MediaStreamTrack /* this */, MediaStreamTrack /* this */>
}
