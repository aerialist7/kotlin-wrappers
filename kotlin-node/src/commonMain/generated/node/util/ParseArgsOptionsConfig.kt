// Generated by Karakum - do not modify it manually!

package node.util

sealed external interface ParseArgsOptionsConfig {
    operator fun get(key: String): ParseArgsOptionConfig?

    operator fun set(
        key: String,
        value: ParseArgsOptionConfig?,
    )
}
