plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinReactDom)

    commonMainApi(npm(libs.npm.reactBeautifulDnd))
}
