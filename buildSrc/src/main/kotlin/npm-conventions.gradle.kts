import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

val NON_STRICT_DEPENDENCIES = setOf(
    "typescript",
)

val NPM_CONFIGURATIONS = setOf(
    "jsMainApi",
    "jsMainImplementation",
)

val npmResolutions by tasks.registering {
    doLast {
        val npmExtension = rootProject.the<NpmExtension>()

        for (dependency in project.getNpmDependencies()) {
            if (dependency.name in NON_STRICT_DEPENDENCIES)
                continue

            val version = dependency.version
            if (version.startsWith("^")) {
                npmExtension.override(dependency.name, version.removePrefix("^"))
            }
        }
    }
}

// TODO: remove `afterEvaluate` usage
afterEvaluate {
    // TODO: find better task
    tasks.named("jsPackageJson") {
        dependsOn(npmResolutions)
    }
}

fun Project.getNpmDependencies(): Sequence<NpmDependency> =
    NPM_CONFIGURATIONS.asSequence()
        .map { configurations.getByName(it) }
        .flatMap { it.allDependencies }
        .filterIsInstance<NpmDependency>()
