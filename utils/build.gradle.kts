plugins {
    id("commons.android-library")
    id(PluginDependencies.ANDROID_MAVEN)
}

group = "com.github.softcomoss"

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(AndroidXDependencies.appCompat)
    implementation(AndroidXDependencies.coreKtx)
    implementation(AndroidXDependencies.lifecycle)
    implementation(AndroidXDependencies.navigationFragmentKtx)
    implementation(AndroidXDependencies.navigationUiKtx)
    kapt(AndroidXDependencies.lifecycleCompiler)

    implementation(NetworkDependencies.retrofit)

    implementation(ViewDependencies.materialComponent)

    testImplementation(TestingDependencies.androidTest)
    testImplementation(TestingDependencies.jUnit)
    testImplementation(TestingDependencies.mockitoCore)
    testImplementation(TestingDependencies.roboelectric)

    androidTestImplementation(TestingDependencies.androidJUnit)
    androidTestImplementation(TestingDependencies.androidTestRunner)
}
