// Generated by Karakum - do not modify it manually!

@file:JsModule("node:events")

package node.events

import js.disposable.Disposable
import js.iterable.AsyncIterableIterator
import js.promise.Promise
import web.abort.AbortSignal
import web.events.Event


/**
 * The `EventEmitter` class is defined and exposed by the `node:events` module:
 *
 * ```js
 * import { EventEmitter } from 'node:events';
 * ```
 *
 * All `EventEmitter`s emit the event `'newListener'` when new listeners are
 * added and `'removeListener'` when existing listeners are removed.
 *
 * It supports the following option:
 * @since v0.1.26
 */

open external class EventEmitter {
    constructor (options: EventEmitterOptions = definedExternally)
    /* [EventEmitter.captureRejectionSymbol]?(error: Error, event: string, ...args: any[]): void; */
    /* [EventEmitter.captureRejectionSymbol]?(error: Error, event: string, ...args: any[]): void; */
    /**
     * Alias for `emitter.on(eventName, listener)`.
     * @since v0.1.26
     */
    open fun addListener(
        eventName: LegacyEventType,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    /**
     * Adds the `listener` function to the end of the listeners array for the
     * event named `eventName`. No checks are made to see if the `listener` has
     * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
     * times.
     *
     * ```js
     * server.on('connection', (stream) => {
     *   console.log('someone connected!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     *
     * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
     * event listener to the beginning of the listeners array.
     *
     * ```js
     * import { EventEmitter } from 'node:events';
     * const myEE = new EventEmitter();
     * myEE.on('foo', () => console.log('a'));
     * myEE.prependListener('foo', () => console.log('b'));
     * myEE.emit('foo');
     * // Prints:
     * //   b
     * //   a
     * ```
     * @since v0.1.101
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    open fun on(eventName: LegacyEventType, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    /**
     * Adds a **one-time**`listener` function for the event named `eventName`. The
     * next time `eventName` is triggered, this listener is removed and then invoked.
     *
     * ```js
     * server.once('connection', (stream) => {
     *   console.log('Ah, we have our first user!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     *
     * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
     * event listener to the beginning of the listeners array.
     *
     * ```js
     * import { EventEmitter } from 'node:events';
     * const myEE = new EventEmitter();
     * myEE.once('foo', () => console.log('a'));
     * myEE.prependOnceListener('foo', () => console.log('b'));
     * myEE.emit('foo');
     * // Prints:
     * //   b
     * //   a
     * ```
     * @since v0.3.0
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    open fun once(eventName: LegacyEventType, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    /**
     * Removes the specified `listener` from the listener array for the event named`eventName`.
     *
     * ```js
     * const callback = (stream) => {
     *   console.log('someone connected!');
     * };
     * server.on('connection', callback);
     * // ...
     * server.removeListener('connection', callback);
     * ```
     *
     * `removeListener()` will remove, at most, one instance of a listener from the
     * listener array. If any single listener has been added multiple times to the
     * listener array for the specified `eventName`, then `removeListener()` must be
     * called multiple times to remove each instance.
     *
     * Once an event is emitted, all listeners attached to it at the
     * time of emitting are called in order. This implies that any`removeListener()` or `removeAllListeners()` calls _after_ emitting and _before_ the last listener finishes execution
     * will not remove them from`emit()` in progress. Subsequent events behave as expected.
     *
     * ```js
     * import { EventEmitter } from 'node:events';
     * class MyEmitter extends EventEmitter {}
     * const myEmitter = new MyEmitter();
     *
     * const callbackA = () => {
     *   console.log('A');
     *   myEmitter.removeListener('event', callbackB);
     * };
     *
     * const callbackB = () => {
     *   console.log('B');
     * };
     *
     * myEmitter.on('event', callbackA);
     *
     * myEmitter.on('event', callbackB);
     *
     * // callbackA removes listener callbackB but it will still be called.
     * // Internal listener array at time of emit [callbackA, callbackB]
     * myEmitter.emit('event');
     * // Prints:
     * //   A
     * //   B
     *
     * // callbackB is now removed.
     * // Internal listener array [callbackA]
     * myEmitter.emit('event');
     * // Prints:
     * //   A
     * ```
     *
     * Because listeners are managed using an internal array, calling this will
     * change the position indices of any listener registered _after_ the listener
     * being removed. This will not impact the order in which listeners are called,
     * but it means that any copies of the listener array as returned by
     * the `emitter.listeners()` method will need to be recreated.
     *
     * When a single function has been added as a handler multiple times for a single
     * event (as in the example below), `removeListener()` will remove the most
     * recently added instance. In the example the `once('ping')`listener is removed:
     *
     * ```js
     * import { EventEmitter } from 'node:events';
     * const ee = new EventEmitter();
     *
     * function pong() {
     *   console.log('pong');
     * }
     *
     * ee.on('ping', pong);
     * ee.once('ping', pong);
     * ee.removeListener('ping', pong);
     *
     * ee.emit('ping');
     * ee.emit('ping');
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v0.1.26
     */
    open fun removeListener(
        eventName: LegacyEventType,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    /**
     * Alias for `emitter.removeListener()`.
     * @since v10.0.0
     */
    open fun off(eventName: LegacyEventType, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    /**
     * Removes all listeners, or those of the specified `eventName`.
     *
     * It is bad practice to remove listeners added elsewhere in the code,
     * particularly when the `EventEmitter` instance was created by some other
     * component or module (e.g. sockets or file streams).
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v0.1.26
     */
    open fun removeAllListeners(event: LegacyEventType = definedExternally): Unit /* this */


    /**
     * By default `EventEmitter`s will print a warning if more than `10` listeners are
     * added for a particular event. This is a useful default that helps finding
     * memory leaks. The `emitter.setMaxListeners()` method allows the limit to be
     * modified for this specific `EventEmitter` instance. The value can be set to`Infinity` (or `0`) to indicate an unlimited number of listeners.
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v0.3.5
     */
    open fun setMaxListeners(n: Number): Unit /* this */

    /**
     * Returns the current max listener value for the `EventEmitter` which is either
     * set by `emitter.setMaxListeners(n)` or defaults to {@link defaultMaxListeners}.
     * @since v1.0.0
     */
    open fun getMaxListeners(): Double

    /**
     * Returns a copy of the array of listeners for the event named `eventName`.
     *
     * ```js
     * server.on('connection', (stream) => {
     *   console.log('someone connected!');
     * });
     * console.log(util.inspect(server.listeners('connection')));
     * // Prints: [ [Function] ]
     * ```
     * @since v0.1.26
     */
    open fun listeners(eventName: LegacyEventType): js.array.ReadonlyArray<Function<*>>


    /**
     * Returns a copy of the array of listeners for the event named `eventName`,
     * including any wrappers (such as those created by `.once()`).
     *
     * ```js
     * import { EventEmitter } from 'node:events';
     * const emitter = new EventEmitter();
     * emitter.once('log', () => console.log('log once'));
     *
     * // Returns a new Array with a function `onceWrapper` which has a property
     * // `listener` which contains the original listener bound above
     * const listeners = emitter.rawListeners('log');
     * const logFnWrapper = listeners[0];
     *
     * // Logs "log once" to the console and does not unbind the `once` event
     * logFnWrapper.listener();
     *
     * // Logs "log once" to the console and removes the listener
     * logFnWrapper();
     *
     * emitter.on('log', () => console.log('log persistently'));
     * // Will return a new Array with a single function bound by `.on()` above
     * const newListeners = emitter.rawListeners('log');
     *
     * // Logs "log persistently" twice
     * newListeners[0]();
     * emitter.emit('log');
     * ```
     * @since v9.4.0
     */
    open fun rawListeners(eventName: LegacyEventType): js.array.ReadonlyArray<Function<*>>


    /**
     * Synchronously calls each of the listeners registered for the event named`eventName`, in the order they were registered, passing the supplied arguments
     * to each.
     *
     * Returns `true` if the event had listeners, `false` otherwise.
     *
     * ```js
     * import { EventEmitter } from 'node:events';
     * const myEmitter = new EventEmitter();
     *
     * // First listener
     * myEmitter.on('event', function firstListener() {
     *   console.log('Helloooo! first listener');
     * });
     * // Second listener
     * myEmitter.on('event', function secondListener(arg1, arg2) {
     *   console.log(`event with parameters ${arg1}, ${arg2} in second listener`);
     * });
     * // Third listener
     * myEmitter.on('event', function thirdListener(...args) {
     *   const parameters = args.join(', ');
     *   console.log(`event with parameters ${parameters} in third listener`);
     * });
     *
     * console.log(myEmitter.listeners('event'));
     *
     * myEmitter.emit('event', 1, 2, 3, 4, 5);
     *
     * // Prints:
     * // [
     * //   [Function: firstListener],
     * //   [Function: secondListener],
     * //   [Function: thirdListener]
     * // ]
     * // Helloooo! first listener
     * // event with parameters 1, 2 in second listener
     * // event with parameters 1, 2, 3, 4, 5 in third listener
     * ```
     * @since v0.1.26
     */
    open fun emit(eventName: LegacyEventType, vararg args: Any?): Boolean


    /**
     * Returns the number of listeners listening for the event named `eventName`.
     * If `listener` is provided, it will return how many times the listener is found
     * in the list of the listeners of the event.
     * @since v3.2.0
     * @param eventName The name of the event being listened for
     * @param listener The event handler function
     */
    open fun listenerCount(eventName: LegacyEventType, listener: Function<Unit> = definedExternally): Double


    /**
     * Adds the `listener` function to the _beginning_ of the listeners array for the
     * event named `eventName`. No checks are made to see if the `listener` has
     * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
     * times.
     *
     * ```js
     * server.prependListener('connection', (stream) => {
     *   console.log('someone connected!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v6.0.0
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    open fun prependListener(
        eventName: LegacyEventType,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    /**
     * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
     * listener is removed, and then invoked.
     *
     * ```js
     * server.prependOnceListener('connection', (stream) => {
     *   console.log('Ah, we have our first user!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v6.0.0
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    open fun prependOnceListener(
        eventName: LegacyEventType,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    /**
     * Returns an array listing the events for which the emitter has registered
     * listeners. The values in the array are strings or `Symbol`s.
     *
     * ```js
     * import { EventEmitter } from 'node:events';
     *
     * const myEE = new EventEmitter();
     * myEE.on('foo', () => {});
     * myEE.on('bar', () => {});
     *
     * const sym = Symbol('symbol');
     * myEE.on(sym, () => {});
     *
     * console.log(myEE.eventNames());
     * // Prints: [ 'foo', 'bar', Symbol(symbol) ]
     * ```
     * @since v6.0.0
     */
    open fun eventNames(): Array<Any /* string | symbol */>

    companion object {
        /**
         * Creates a `Promise` that is fulfilled when the `EventEmitter` emits the given
         * event or that is rejected if the `EventEmitter` emits `'error'` while waiting.
         * The `Promise` will resolve with an array of all the arguments emitted to the
         * given event.
         *
         * This method is intentionally generic and works with the web platform [EventTarget](https://dom.spec.whatwg.org/#interface-eventtarget) interface, which has no special`'error'` event
         * semantics and does not listen to the `'error'` event.
         *
         * ```js
         * import { once, EventEmitter } from 'node:events';
         * import process from 'node:process';
         *
         * const ee = new EventEmitter();
         *
         * process.nextTick(() => {
         *   ee.emit('myevent', 42);
         * });
         *
         * const [value] = await once(ee, 'myevent');
         * console.log(value);
         *
         * const err = new Error('kaboom');
         * process.nextTick(() => {
         *   ee.emit('error', err);
         * });
         *
         * try {
         *   await once(ee, 'myevent');
         * } catch (err) {
         *   console.error('error happened', err);
         * }
         * ```
         *
         * The special handling of the `'error'` event is only used when `events.once()`is used to wait for another event. If `events.once()` is used to wait for the
         * '`error'` event itself, then it is treated as any other kind of event without
         * special handling:
         *
         * ```js
         * import { EventEmitter, once } from 'node:events';
         *
         * const ee = new EventEmitter();
         *
         * once(ee, 'error')
         *   .then(([err]) => console.log('ok', err.message))
         *   .catch((err) => console.error('error', err.message));
         *
         * ee.emit('error', new Error('boom'));
         *
         * // Prints: ok boom
         * ```
         *
         * An `AbortSignal` can be used to cancel waiting for the event:
         *
         * ```js
         * import { EventEmitter, once } from 'node:events';
         *
         * const ee = new EventEmitter();
         * const ac = new AbortController();
         *
         * async function foo(emitter, event, signal) {
         *   try {
         *     await once(emitter, event, { signal });
         *     console.log('event emitted!');
         *   } catch (error) {
         *     if (error.name === 'AbortError') {
         *       console.error('Waiting for the event was canceled!');
         *     } else {
         *       console.error('There was an error', error.message);
         *     }
         *   }
         * }
         *
         * foo(ee, 'foo', ac.signal);
         * ac.abort(); // Abort waiting for the event
         * ee.emit('foo'); // Prints: Waiting for the event was canceled!
         * ```
         * @since v11.13.0, v10.16.0
         */
        fun once(
            emitter: _NodeEventTarget,
            eventName: LegacyEventType,
            options: StaticEventEmitterOptions = definedExternally,
        ): Promise<js.array.ReadonlyArray<Any?>>


        fun once(
            emitter: _DOMEventTarget,
            eventName: String,
            options: StaticEventEmitterOptions = definedExternally,
        ): Promise<js.array.ReadonlyArray<Any?>>

        /**
         * ```js
         * import { on, EventEmitter } from 'node:events';
         * import process from 'node:process';
         *
         * const ee = new EventEmitter();
         *
         * // Emit later on
         * process.nextTick(() => {
         *   ee.emit('foo', 'bar');
         *   ee.emit('foo', 42);
         * });
         *
         * for await (const event of on(ee, 'foo')) {
         *   // The execution of this inner block is synchronous and it
         *   // processes one event at a time (even with await). Do not use
         *   // if concurrent execution is required.
         *   console.log(event); // prints ['bar'] [42]
         * }
         * // Unreachable here
         * ```
         *
         * Returns an `AsyncIterator` that iterates `eventName` events. It will throw
         * if the `EventEmitter` emits `'error'`. It removes all listeners when
         * exiting the loop. The `value` returned by each iteration is an array
         * composed of the emitted event arguments.
         *
         * An `AbortSignal` can be used to cancel waiting on events:
         *
         * ```js
         * import { on, EventEmitter } from 'node:events';
         * import process from 'node:process';
         *
         * const ac = new AbortController();
         *
         * (async () => {
         *   const ee = new EventEmitter();
         *
         *   // Emit later on
         *   process.nextTick(() => {
         *     ee.emit('foo', 'bar');
         *     ee.emit('foo', 42);
         *   });
         *
         *   for await (const event of on(ee, 'foo', { signal: ac.signal })) {
         *     // The execution of this inner block is synchronous and it
         *     // processes one event at a time (even with await). Do not use
         *     // if concurrent execution is required.
         *     console.log(event); // prints ['bar'] [42]
         *   }
         *   // Unreachable here
         * })();
         *
         * process.nextTick(() => ac.abort());
         * ```
         * @since v13.6.0, v12.16.0
         * @param eventName The name of the event being listened for
         * @return that iterates `eventName` events emitted by the `emitter`
         */
        fun on(
            emitter: EventEmitter,
            eventName: String,
            options: StaticEventEmitterOptions = definedExternally,
        ): AsyncIterableIterator<Any?>

        /**
         * A class method that returns the number of listeners for the given `eventName`registered on the given `emitter`.
         *
         * ```js
         * import { EventEmitter, listenerCount } from 'node:events';
         *
         * const myEmitter = new EventEmitter();
         * myEmitter.on('event', () => {});
         * myEmitter.on('event', () => {});
         * console.log(listenerCount(myEmitter, 'event'));
         * // Prints: 2
         * ```
         * @since v0.9.12
         * @deprecated Since v3.2.0 - Use `listenerCount` instead.
         * @param emitter The emitter to query
         * @param eventName The event name
         */
        fun listenerCount(emitter: EventEmitter, eventName: LegacyEventType): Double


        /**
         * Returns a copy of the array of listeners for the event named `eventName`.
         *
         * For `EventEmitter`s this behaves exactly the same as calling `.listeners` on
         * the emitter.
         *
         * For `EventTarget`s this is the only way to get the event listeners for the
         * event target. This is useful for debugging and diagnostic purposes.
         *
         * ```js
         * import { getEventListeners, EventEmitter } from 'node:events';
         *
         * {
         *   const ee = new EventEmitter();
         *   const listener = () => console.log('Events are fun');
         *   ee.on('foo', listener);
         *   console.log(getEventListeners(ee, 'foo')); // [ [Function: listener] ]
         * }
         * {
         *   const et = new EventTarget();
         *   const listener = () => console.log('Events are fun');
         *   et.addEventListener('foo', listener);
         *   console.log(getEventListeners(et, 'foo')); // [ [Function: listener] ]
         * }
         * ```
         * @since v15.2.0, v14.17.0
         */
        fun getEventListeners(emitter: _DOMEventTarget, name: LegacyEventType): js.array.ReadonlyArray<Function<*>>


        fun getEventListeners(emitter: EventEmitter, name: LegacyEventType): js.array.ReadonlyArray<Function<*>>


        /**
         * Returns the currently set max amount of listeners.
         *
         * For `EventEmitter`s this behaves exactly the same as calling `.getMaxListeners` on
         * the emitter.
         *
         * For `EventTarget`s this is the only way to get the max event listeners for the
         * event target. If the number of event handlers on a single EventTarget exceeds
         * the max set, the EventTarget will print a warning.
         *
         * ```js
         * import { getMaxListeners, setMaxListeners, EventEmitter } from 'node:events';
         *
         * {
         *   const ee = new EventEmitter();
         *   console.log(getMaxListeners(ee)); // 10
         *   setMaxListeners(11, ee);
         *   console.log(getMaxListeners(ee)); // 11
         * }
         * {
         *   const et = new EventTarget();
         *   console.log(getMaxListeners(et)); // 10
         *   setMaxListeners(11, et);
         *   console.log(getMaxListeners(et)); // 11
         * }
         * ```
         * @since v19.9.0
         */
        fun getMaxListeners(emitter: _DOMEventTarget): Double

        fun getMaxListeners(emitter: EventEmitter): Double

        /**
         * ```js
         * import { setMaxListeners, EventEmitter } from 'node:events';
         *
         * const target = new EventTarget();
         * const emitter = new EventEmitter();
         *
         * setMaxListeners(5, target, emitter);
         * ```
         * @since v15.4.0
         * @param n A non-negative number. The maximum number of listeners per `EventTarget` event.
         * @param eventsTargets Zero or more {EventTarget} or {EventEmitter} instances. If none are specified, `n` is set as the default max for all newly created {EventTarget} and {EventEmitter}
         * objects.
         */
        fun setMaxListeners(
            n: Number = definedExternally,
            vararg eventTargets: Any, /* _DOMEventTarget | NodeJS.EventEmitter */
        ): Unit

        /**
         * Listens once to the `abort` event on the provided `signal`.
         *
         * Listening to the `abort` event on abort signals is unsafe and may
         * lead to resource leaks since another third party with the signal can
         * call `e.stopImmediatePropagation()`. Unfortunately Node.js cannot change
         * this since it would violate the web standard. Additionally, the original
         * API makes it easy to forget to remove listeners.
         *
         * This API allows safely using `AbortSignal`s in Node.js APIs by solving these
         * two issues by listening to the event such that `stopImmediatePropagation` does
         * not prevent the listener from running.
         *
         * Returns a disposable so that it may be unsubscribed from more easily.
         *
         * ```js
         * import { addAbortListener } from 'node:events';
         *
         * function example(signal) {
         *   let disposable;
         *   try {
         *     signal.addEventListener('abort', (e) => e.stopImmediatePropagation());
         *     disposable = addAbortListener(signal, (e) => {
         *       // Do something when signal is aborted.
         *     });
         *   } finally {
         *     disposable?.[Symbol.dispose]();
         *   }
         * }
         * ```
         * @since v20.5.0
         * @experimental
         * @return Disposable that removes the `abort` listener.
         */
        fun addAbortListener(signal: AbortSignal, resource: (event: Event<AbortSignal>) -> Unit): Disposable

        /**
         * This symbol shall be used to install a listener for only monitoring `'error'`events. Listeners installed using this symbol are called before the regular`'error'` listeners are called.
         *
         * Installing a listener using this symbol does not change the behavior once an`'error'` event is emitted. Therefore, the process will still crash if no
         * regular `'error'` listener is installed.
         * @since v13.6.0, v12.17.0
         */
        val errorMonitor: /* unique */ js.symbol.Symbol

        /**
         * Value: `Symbol.for('nodejs.rejection')`
         *
         * See how to write a custom `rejection handler`.
         * @since v13.4.0, v12.16.0
         */
        val captureRejectionSymbol: /* unique */ js.symbol.Symbol

        /**
         * Value: [boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type)
         *
         * Change the default `captureRejections` option on all new `EventEmitter` objects.
         * @since v13.4.0, v12.16.0
         */
        var captureRejections: Boolean

        /**
         * By default, a maximum of `10` listeners can be registered for any single
         * event. This limit can be changed for individual `EventEmitter` instances
         * using the `emitter.setMaxListeners(n)` method. To change the default
         * for _all_`EventEmitter` instances, the `events.defaultMaxListeners`property can be used. If this value is not a positive number, a `RangeError`is thrown.
         *
         * Take caution when setting the `events.defaultMaxListeners` because the
         * change affects _all_`EventEmitter` instances, including those created before
         * the change is made. However, calling `emitter.setMaxListeners(n)` still has
         * precedence over `events.defaultMaxListeners`.
         *
         * This is not a hard limit. The `EventEmitter` instance will allow
         * more listeners to be added but will output a trace warning to stderr indicating
         * that a "possible EventEmitter memory leak" has been detected. For any single`EventEmitter`, the `emitter.getMaxListeners()` and `emitter.setMaxListeners()`methods can be used to
         * temporarily avoid this warning:
         *
         * ```js
         * import { EventEmitter } from 'node:events';
         * const emitter = new EventEmitter();
         * emitter.setMaxListeners(emitter.getMaxListeners() + 1);
         * emitter.once('event', () => {
         *   // do stuff
         *   emitter.setMaxListeners(Math.max(emitter.getMaxListeners() - 1, 0));
         * });
         * ```
         *
         * The `--trace-warnings` command-line flag can be used to display the
         * stack trace for such warnings.
         *
         * The emitted warning can be inspected with `process.on('warning')` and will
         * have the additional `emitter`, `type`, and `count` properties, referring to
         * the event emitter instance, the event's name and the number of attached
         * listeners, respectively.
         * Its `name` property is set to `'MaxListenersExceededWarning'`.
         * @since v0.11.2
         */
        var defaultMaxListeners: Double
    }

}
