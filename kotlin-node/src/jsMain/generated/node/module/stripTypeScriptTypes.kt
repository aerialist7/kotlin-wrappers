// Generated by Karakum - do not modify it manually!

@file:JsModule("node:module")

package node.module

/**
 * `module.stripTypeScriptTypes()` removes type annotations from TypeScript code. It
 * can be used to strip type annotations from TypeScript code before running it
 * with `vm.runInContext()` or `vm.compileFunction()`.
 * By default, it will throw an error if the code contains TypeScript features
 * that require transformation such as `Enums`,
 * see [type-stripping](https://nodejs.org/docs/latest-v22.x/api/typescript.md#type-stripping) for more information.
 * When mode is `'transform'`, it also transforms TypeScript features to JavaScript,
 * see [transform TypeScript features](https://nodejs.org/docs/latest-v22.x/api/typescript.md#typescript-features) for more information.
 * When mode is `'strip'`, source maps are not generated, because locations are preserved.
 * If `sourceMap` is provided, when mode is `'strip'`, an error will be thrown.
 *
 * _WARNING_: The output of this function should not be considered stable across Node.js versions,
 * due to changes in the TypeScript parser.
 *
 * ```js
 * import { stripTypeScriptTypes } from 'node:module';
 * const code = 'const a: number = 1;';
 * const strippedCode = stripTypeScriptTypes(code);
 * console.log(strippedCode);
 * // Prints: const a         = 1;
 * ```
 *
 * If `sourceUrl` is provided, it will be used appended as a comment at the end of the output:
 *
 * ```js
 * import { stripTypeScriptTypes } from 'node:module';
 * const code = 'const a: number = 1;';
 * const strippedCode = stripTypeScriptTypes(code, { mode: 'strip', sourceUrl: 'source.ts' });
 * console.log(strippedCode);
 * // Prints: const a         = 1\n\n//# sourceURL=source.ts;
 * ```
 *
 * When `mode` is `'transform'`, the code is transformed to JavaScript:
 *
 * ```js
 * import { stripTypeScriptTypes } from 'node:module';
 * const code = `
 *   namespace MathUtil {
 *     export const add = (a: number, b: number) => a + b;
 *   }`;
 * const strippedCode = stripTypeScriptTypes(code, { mode: 'transform', sourceMap: true });
 * console.log(strippedCode);
 * // Prints:
 * // var MathUtil;
 * // (function(MathUtil) {
 * //     MathUtil.add = (a, b)=>a + b;
 * // })(MathUtil || (MathUtil = {}));
 * // # sourceMappingURL=data:application/json;base64, ...
 * ```
 * @since v22.13.0
 * @param code The code to strip type annotations from.
 * @returns The code with type annotations stripped.
 */
external fun stripTypeScriptTypes(code: String, options: StripTypeScriptTypesOptions = definedExternally): String
