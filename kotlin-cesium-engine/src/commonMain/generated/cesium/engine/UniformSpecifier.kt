// Automatically generated - do not modify!

package cesium.engine

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * An object describing a uniform, its type, and an initial value
 * @property [type] The Glsl type of the uniform.
 * @property [value] The initial value of the uniform
 */
@JsPlainObject
external interface UniformSpecifier {
    val type: UniformType
    val value: JsAny /* boolean | number | Cartesian2 | Cartesian3 | Cartesian4 | Matrix2 | Matrix3 | Matrix4 | TextureUniform */
}
