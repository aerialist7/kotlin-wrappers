// Generated by Karakum - do not modify it manually!

package node.fs


@seskar.js.JsAsync
external suspend fun statfs(path: PathLike): StatsFs


@seskar.js.JsAsync
external suspend fun statfs(path: PathLike, opts: StatfsOpts = definedExternally): StatsFs


@seskar.js.JsAsync
external suspend fun statfs(path: PathLike, opts: StatfsBigIntOpts): BigIntStatsFs


@seskar.js.JsAsync
external suspend fun statfs(path: PathLike, opts: StatFsOptions = definedExternally): Any /* StatsFs | BigIntStatsFs */
