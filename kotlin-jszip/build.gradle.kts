plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinWeb)
    commonMainApi(npm(jspkg.jszip))
}
