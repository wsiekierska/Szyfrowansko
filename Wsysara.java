import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
public class Wsysara {
    private HashMap<String, Integer> words;
    private HashMap<String, String> encodedWords;

    Wsysara() {
        words = new HashMap<String,Integer>();
        encodedWords = new HashMap<String, String>();
    }

    public void wessijPlik(String path) {
        File plik = new File(path);
        Scanner wsysara = new Scanner(plik);

        while(wsysara.hasNext()) {
            String word = wsysara.next();
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
    }
    public HashMap<String,Integer> getWords() {
        return words;
    }
    public HashMap<String,String> getEncodedWords(Cipher c) {
        encodedWords.clear();
        for(HashMap.Entry<String,Integer> word: words.entrySet()) {
            encodedWords.put(word.getKey(), c.encode(word.getKey()));
        }
        return encodedWords;
    }
}