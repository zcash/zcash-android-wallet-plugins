package cash.z.android.plugin

/**
 * Generic interface for supplying mnemonic behavior used to separate specific implementations from
 * the code interacts with them.
 */
interface MnemonicPlugin {

    /**
     * Generate a random seed.
     */
    fun nextEntropy(): ByteArray

    /**
     * Generate a random 24-word mnemonic phrase.
     */
    fun nextMnemonic(): CharArray

    /**
     * Generate the 24-word mnemonic phrase corresponding to the given seed.
     */
    fun nextMnemonic(seed: ByteArray): CharArray

    /**
     * Generate a random 24-word mnemonic phrase, represented as a list of words.
     */
    fun nextMnemonicList(): List<CharArray>

    /**
     * Generate the 24-word mnemonic phrase corresponding to the given seed, represented as a list.
     */
    fun nextMnemonicList(seed: ByteArray): List<CharArray>

    /**
     * Generate a 64-byte seed from the 24-word mnemonic phrase.
     */
    fun toSeed(mnemonic: CharArray): ByteArray

    /**
     * Split the given mnemonic around spaces.
     */
    fun toWordList(mnemonic: CharArray): List<CharArray>

}
