public class Decrypt {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt(String text, int key) {
        String decryptedText = "";

        for (int i = 0; i < text.length(); i++) {
            int position = alphabet.indexOf(text.charAt(i));
            int value = (key - position) % 26;
            char replaceValue = alphabet.charAt(value);
            decryptedText += replaceValue;
        }
        return decryptedText;
    }
}


