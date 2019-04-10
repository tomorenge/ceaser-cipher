public class CeaserCipher {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, int key) {
        String encryptedText ="";

        for(int i=0; i<text.length(); i++){
           int position=alphabet.indexOf(text.charAt(i));
           int value=(key+position)%26;
           char replaceValue=alphabet.charAt(value);
           encryptedText+=replaceValue;
        }
        return encryptedText;
    }
}

