// Generated by Karakum - do not modify it manually!


package node.inspector.runtime


/**
 * @experimental
 */

sealed external interface PropertyPreview {
    /**
     * Property name.
     */
    var name: String

    /**
     * Object type. Accessor means that the property itself is an accessor property.
     */
    var type: String

    /**
     * User-friendly property value string.
     */
    var value: String?

    /**
     * Nested value preview.
     */
    var valuePreview: ObjectPreview?

    /**
     * Object subtype hint. Specified for <code>object</code> type values only.
     */
    var subtype: String?
}