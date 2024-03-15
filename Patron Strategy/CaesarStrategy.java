public class CaesarStrategy implements EncryptionStrategy {
    private int shift;

    public CaesarStrategy(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                int originalAlphabetPosition = ch >= 'a' ? ch - 'a' : ch - 'A';
                int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                char newChar = (char) (ch >= 'a' ? 'a' + newAlphabetPosition : 'A' + newAlphabetPosition);
                encryptedText.append(newChar);
            } else {
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }

    @Override
    public String decrypt(String ciphertext) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);

            if (Character.isLetter(ch)) {
                int originalAlphabetPosition = ch >= 'a' ? ch - 'a' : ch - 'A';
                int newAlphabetPosition = (originalAlphabetPosition - shift + 26) % 26;
                char newChar = (char) (ch >= 'a' ? 'a' + newAlphabetPosition : 'A' + newAlphabetPosition);
                decryptedText.append(newChar);
            } else {
                decryptedText.append(ch);
            }
        }
        return decryptedText.toString();
    }
}

