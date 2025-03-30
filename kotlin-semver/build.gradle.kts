plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(npm(libs.npm.semver))
    jsMainImplementation(devNpm(libs.npm.types.semver))
}
