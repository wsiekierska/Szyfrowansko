import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int n;
        Wysysara moj_tekst=new Wysysara();
        moj_tekst.wessijPlik(dane);
        new HashMap<String String> slowa;
        slowa = moj_tekst.get_words();
        System.out.println("Wejściowe słowa:");
        for(HashMap<String String> word: slowa){
            System.out.println(word.getValue());
        }
        Caesar cezar=new Caesar(n);
        CipherMors mors=new CipherMorse();
        System.out.println("Słowa zaszyfrowane szyfrem Cezara o kluczu " +n ":");
        words=moj_tekst.getEncodedWords(Caesar cezar);
        for(HashMap<String String> word: slowa){
            System.out.println(word.getValue());
        }
        System.out.println("Słowa zaszyfrowane alfabetem morsa:");
        words=moj_tekst.getEncodedWords(Caesar cezar);
        for(HashMap<String String> word: slowa){
            System.out.println(word.getValue());
        }
    }
}