package cash.z.ecc.android

object Deps {
    // For use in the top-level build.gradle which gives an error when provided
    // `Deps.Kotlin.version` directly
    const val kotlinVersion =   "1.3.72"
    const val group =           "cash.z.ecc.android"
    const val artifactName =    "zcash-android-wallet-plugins"
    const val versionName =     "1.0.0"
    const val description =     "Lightweight dependency that makes it easier to plugin 3rd party implementations to the zcash Android SDK."
    const val githubUrl =       "https://github.com/zcash/zcash-android-wallet-plugins"

    object Kotlin : Version(kotlinVersion) {
        val STDLIB =            "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    }
}

open class Version(@JvmField val version: String)
