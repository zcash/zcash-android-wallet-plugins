package cash.z.android.plugin

/**
 * Generic interface for securely storing seeds, keys and flags. Useful for separating the
 * implementation from the code that interacts with it.
 */
interface LockBoxPlugin {
    fun setBytes(key: String, value: ByteArray)
    fun getBytes(key: String): ByteArray?

    fun setCharsUtf8(key: String, value: CharArray)
    fun getCharsUtf8(key: String): CharArray?

    fun setBoolean(key: String, value: Boolean)
    fun getBoolean(key: String): Boolean
}