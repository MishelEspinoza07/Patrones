public class StrategyContext {
    private EncryptionStrategy strategy;

    public void encryptText(String text) {
        String encryptedText = strategy.encrypt(text);
        System.out.println("Texto cifrado: " + encryptedText);
    }

    public void decryptText(String ciphertext) {
        String decryptedText = strategy.decrypt(ciphertext);
        System.out.println("Texto descifrado: " + decryptedText);
    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }
}

