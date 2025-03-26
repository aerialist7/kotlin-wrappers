import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin

plugins.withType<NodeJsPlugin> {
    the<NodeJsEnvSpec>().version.set("22.14.0")
}
