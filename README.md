# zcash-android-wallet-plugins
[![license](https://img.shields.io/github/license/zcash/kotlin-bip39.svg?maxAge=2592000&style=plastic)](https://github.com/zcash/kotlin-bip39/blob/master/LICENSE)
[![@gmale](https://img.shields.io/badge/contact-android@z.cash-5AA9E7.svg?style=plastic)](https://github.com/gmale)
![Bintray](https://img.shields.io/bintray/v/ecc-mobile/android/zcash-android-wallet-plugins?color=success&style=plastic)



Generic interfaces for plugging functionality into Zcash Anrdroid wallets. Adhering to these interfaces creates a common ground for wallets to use for adding behavior. Then, if any particular 3rd party implementation needs to be changed, it will have a minor impact on the wallets, as a whole.

## Gradle
Add dependency

```groovy
dependencies {
    implementation "cash.z.ecc.android:zcash-android-wallet-plugins:1.0.0"
}

repository {
    jcenter()
}
```

## Usage

Create implementations of the provided interfaces, plugging in your favorite libraries that get the job done. Then use them to create the seed needed for initializing the [Android SDK](https://github.com/zcash/zcash-android-wallet-sdk).

```kotlin
/** class for storing seeds */
class LockBox @Inject constructor(private val appContext: Context) : LockBoxPlugin {
    // add implementation
}
/** class for generating mnemonic phrases */
class Mnemonics @Inject constructor(): MnemonicPlugin {
    // add implementation
}
```
