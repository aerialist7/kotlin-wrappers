// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import cesium.engine.Cartesian3
import cesium.engine.Scene
import web.dom.Element

/**
 * The view model for [SelectionIndicator].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [scene] The scene instance to use for screen-space coordinate conversion.
 * @property [selectionIndicatorElement] The element containing all elements that make up the selection indicator.
 * @property [container] The DOM element that contains the widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html">Online Documentation</a>
 */
external class SelectionIndicatorViewModel(
    var scene: Scene,
    var selectionIndicatorElement: Element,
    var container: Element,
) {
    /**
     * Gets or sets the world position of the object for which to display the selection indicator.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * Gets or sets the visibility of the selection indicator.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html#showSelection">Online Documentation</a>
     */
    var showSelection: Boolean

    /**
     * Gets the visibility of the position indicator.  This can be false even if an
     * object is selected, when the selected object has no position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html#isVisible">Online Documentation</a>
     */
    var isVisible: Boolean

    /**
     * Gets or sets the function for converting the world position of the object to the screen space position.
     * ```
     * selectionIndicatorViewModel.computeScreenSpacePosition = function(position, result) {
     *     return SceneTransforms.worldToWindowCoordinates(scene, position, result);
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html#computeScreenSpacePosition">Online Documentation</a>
     */
    var computeScreenSpacePosition: ComputeScreenSpacePosition

    /**
     * Updates the view of the selection indicator to match the position and content properties of the view model.
     * This function should be called as part of the render loop.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Animate the indicator to draw attention to the selection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html#animateAppear">Online Documentation</a>
     */
    fun animateAppear()

    /**
     * Animate the indicator to release the selection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicatorViewModel.html#animateDepart">Online Documentation</a>
     */
    fun animateDepart()
}
