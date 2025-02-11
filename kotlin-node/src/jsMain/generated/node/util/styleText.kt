// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

/**
 * This function returns a formatted text considering the `format` passed.
 *
 * ```js
 * import { styleText } from 'node:util';
 * const errorMessage = styleText('red', 'Error! Error!');
 * console.log(errorMessage);
 * ```
 *
 * `util.inspect.colors` also provides text formats such as `italic`, and `underline` and you can combine both:
 *
 * ```js
 * console.log(
 *   util.styleText(['underline', 'italic'], 'My italic underlined message'),
 * );
 * ```
 *
 * When passing an array of formats, the order of the format applied is left to right so the following style
 * might overwrite the previous one.
 *
 * ```js
 * console.log(
 *   util.styleText(['red', 'green'], 'text'), // green
 * );
 * ```
 *
 * The full list of formats can be found in [modifiers](https://nodejs.org/docs/latest-v22.x/api/util.html#modifiers).
 * @param format A text format or an Array of text formats defined in `util.inspect.colors`.
 * @param text The text to to be formatted.
 * @since v20.12.0
 */
external fun styleText(format: ForegroundColors, text: String): String

/**
 * This function returns a formatted text considering the `format` passed.
 *
 * ```js
 * import { styleText } from 'node:util';
 * const errorMessage = styleText('red', 'Error! Error!');
 * console.log(errorMessage);
 * ```
 *
 * `util.inspect.colors` also provides text formats such as `italic`, and `underline` and you can combine both:
 *
 * ```js
 * console.log(
 *   util.styleText(['underline', 'italic'], 'My italic underlined message'),
 * );
 * ```
 *
 * When passing an array of formats, the order of the format applied is left to right so the following style
 * might overwrite the previous one.
 *
 * ```js
 * console.log(
 *   util.styleText(['red', 'green'], 'text'), // green
 * );
 * ```
 *
 * The full list of formats can be found in [modifiers](https://nodejs.org/docs/latest-v22.x/api/util.html#modifiers).
 * @param format A text format or an Array of text formats defined in `util.inspect.colors`.
 * @param text The text to to be formatted.
 * @since v20.12.0
 */
external fun styleText(format: BackgroundColors, text: String): String

/**
 * This function returns a formatted text considering the `format` passed.
 *
 * ```js
 * import { styleText } from 'node:util';
 * const errorMessage = styleText('red', 'Error! Error!');
 * console.log(errorMessage);
 * ```
 *
 * `util.inspect.colors` also provides text formats such as `italic`, and `underline` and you can combine both:
 *
 * ```js
 * console.log(
 *   util.styleText(['underline', 'italic'], 'My italic underlined message'),
 * );
 * ```
 *
 * When passing an array of formats, the order of the format applied is left to right so the following style
 * might overwrite the previous one.
 *
 * ```js
 * console.log(
 *   util.styleText(['red', 'green'], 'text'), // green
 * );
 * ```
 *
 * The full list of formats can be found in [modifiers](https://nodejs.org/docs/latest-v22.x/api/util.html#modifiers).
 * @param format A text format or an Array of text formats defined in `util.inspect.colors`.
 * @param text The text to to be formatted.
 * @since v20.12.0
 */
external fun styleText(format: Modifiers, text: String): String

/**
 * This function returns a formatted text considering the `format` passed.
 *
 * ```js
 * import { styleText } from 'node:util';
 * const errorMessage = styleText('red', 'Error! Error!');
 * console.log(errorMessage);
 * ```
 *
 * `util.inspect.colors` also provides text formats such as `italic`, and `underline` and you can combine both:
 *
 * ```js
 * console.log(
 *   util.styleText(['underline', 'italic'], 'My italic underlined message'),
 * );
 * ```
 *
 * When passing an array of formats, the order of the format applied is left to right so the following style
 * might overwrite the previous one.
 *
 * ```js
 * console.log(
 *   util.styleText(['red', 'green'], 'text'), // green
 * );
 * ```
 *
 * The full list of formats can be found in [modifiers](https://nodejs.org/docs/latest-v22.x/api/util.html#modifiers).
 * @param format A text format or an Array of text formats defined in `util.inspect.colors`.
 * @param text The text to to be formatted.
 * @since v20.12.0
 */
external fun styleText(format: Array<Any /* ForegroundColors | BackgroundColors | Modifiers */>, text: String): String
