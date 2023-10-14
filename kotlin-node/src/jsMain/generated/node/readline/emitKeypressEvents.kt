@file:JsModule("node:readline")

package node.readline


/**
 * The `readline.emitKeypressEvents()` method causes the given `Readable` stream to begin emitting `'keypress'` events corresponding to received input.
 *
 * Optionally, `interface` specifies a `readline.Interface` instance for which
 * autocompletion is disabled when copy-pasted input is detected.
 *
 * If the `stream` is a `TTY`, then it must be in raw mode.
 *
 * This is automatically called by any readline instance on its `input` if the`input` is a terminal. Closing the `readline` instance does not stop
 * the `input` from emitting `'keypress'` events.
 *
 * ```js
 * readline.emitKeypressEvents(process.stdin);
 * if (process.stdin.isTTY)
 *   process.stdin.setRawMode(true);
 * ```
 *
 * ## Example: Tiny CLI
 *
 * The following example illustrates the use of `readline.Interface` class to
 * implement a small command-line interface:
 *
 * ```js
 * const readline = require('readline');
 * const rl = readline.createInterface({
 *   input: process.stdin,
 *   output: process.stdout,
 *   prompt: 'OHAI> '
 * });
 *
 * rl.prompt();
 *
 * rl.on('line', (line) => {
 *   switch (line.trim()) {
 *     case 'hello':
 *       console.log('world!');
 *       break;
 *     default:
 *       console.log(`Say what? I might have heard '${line.trim()}'`);
 *       break;
 *   }
 *   rl.prompt();
 * }).on('close', () => {
 *   console.log('Have a great day!');
 *   process.exit(0);
 * });
 * ```
 *
 * ## Example: Read file stream line-by-Line
 *
 * A common use case for `readline` is to consume an input file one line at a
 * time. The easiest way to do so is leveraging the `fs.ReadStream` API as
 * well as a `for await...of` loop:
 *
 * ```js
 * const fs = require('fs');
 * const readline = require('readline');
 *
 * async function processLineByLine() {
 *   const fileStream = fs.createReadStream('input.txt');
 *
 *   const rl = readline.createInterface({
 *     input: fileStream,
 *     crlfDelay: Infinity
 *   });
 *   // Note: we use the crlfDelay option to recognize all instances of CR LF
 *   // ('\r\n') in input.txt as a single line break.
 *
 *   for await (const line of rl) {
 *     // Each line in input.txt will be successively available here as `line`.
 *     console.log(`Line from file: ${line}`);
 *   }
 * }
 *
 * processLineByLine();
 * ```
 *
 * Alternatively, one could use the `'line'` event:
 *
 * ```js
 * const fs = require('fs');
 * const readline = require('readline');
 *
 * const rl = readline.createInterface({
 *   input: fs.createReadStream('sample.txt'),
 *   crlfDelay: Infinity
 * });
 *
 * rl.on('line', (line) => {
 *   console.log(`Line from file: ${line}`);
 * });
 * ```
 *
 * Currently, `for await...of` loop can be a bit slower. If `async` / `await`flow and speed are both essential, a mixed approach can be applied:
 *
 * ```js
 * const { once } = require('events');
 * const { createReadStream } = require('fs');
 * const { createInterface } = require('readline');
 *
 * (async function processLineByLine() {
 *   try {
 *     const rl = createInterface({
 *       input: createReadStream('big-file.txt'),
 *       crlfDelay: Infinity
 *     });
 *
 *     rl.on('line', (line) => {
 *       // Process the line.
 *     });
 *
 *     await once(rl, 'close');
 *
 *     console.log('File processed.');
 *   } catch (err) {
 *     console.error(err);
 *   }
 * })();
 * ```
 * @since v0.7.7
 */
external fun emitKeypressEvents(stream: node.ReadableStream, readlineInterface: Interface = definedExternally): Unit
