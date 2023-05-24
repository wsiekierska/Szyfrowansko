//import javax.crypto.Cipher;
//import javax.crypto.CipherSpi;
//import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

public class CipherMorse extends Cipher {
    private static final Map<Character, String> morseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
    }

    public CipherMorse() {
    }

    public String encode(String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toUpperCase().toCharArray()) {
            if (Character.isWhitespace(c)) {
                // Dodaj spację pomiędzy słowami
                encryptedMessage.append(" / ");
            } else if (morseCodeMap.containsKey(c)) {
                // Pobierz kod Morse'a dla danego znaku
                encryptedMessage.append(morseCodeMap.get(c)).append(" ");
            } else {
                // Zignoruj znaki, które nie mają odpowiednika w kodzie Morse'a
            }
        }

        return encryptedMessage.toString();
    }
}
