// Generated by Karakum - do not modify it manually!

@file:JsModule("node:module")

package node.module

/* eslint-enable @definitelytyped/no-unnecessary-generics */
/**
 * The `module.syncBuiltinESMExports()` method updates all the live bindings for
 * builtin `ES Modules` to match the properties of the `CommonJS` exports. It
 * does not add or remove exported names from the `ES Modules`.
 *
 * ```js
 * import fs from 'node:fs';
 * import assert from 'node:assert';
 * import { syncBuiltinESMExports } from 'node:module';
 *
 * fs.readFile = newAPI;
 *
 * delete fs.readFileSync;
 *
 * function newAPI() {
 *   // ...
 * }
 *
 * fs.newAPI = newAPI;
 *
 * syncBuiltinESMExports();
 *
 * import('node:fs').then((esmFS) => {
 *   // It syncs the existing readFile property with the new value
 *   assert.strictEqual(esmFS.readFile, newAPI);
 *   // readFileSync has been deleted from the required fs
 *   assert.strictEqual('readFileSync' in fs, false);
 *   // syncBuiltinESMExports() does not remove readFileSync from esmFS
 *   assert.strictEqual('readFileSync' in esmFS, true);
 *   // syncBuiltinESMExports() does not add names
 *   assert.strictEqual(esmFS.newAPI, undefined);
 * });
 * ```
 * @since v12.12.0
 */
external fun syncBuiltinESMExports(): Unit
