public class CeaserCipher {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, int move) {
        String encryptedText ="";

        for(int i=0; i<text.length(); i++){
           int position=alphabet.indexOf(text.charAt(i));
           int value=(move+position)%26;
           char replaceValue=alphabet.charAt(value);
           encryptedText+=replaceValue;
        }
        return encryptedText;
    }
}

