import java.util.HashMap;
public class Main {
    public static void main(String[] args) throws Exception{
        int n=42;
        Wsysara moj_tekst=new Wsysara();
        moj_tekst.wessijPlik("dane");
        HashMap<String, Integer> slowa= new HashMap<>();
        slowa = moj_tekst.getWords();
        System.out.println("Wejściowe słowa:");
        for(HashMap.Entry<String, Integer> word: slowa.entrySet()){
            System.out.println(word.getKey());
        }
        CipherCaesar cezar=new CipherCaesar(n);
        CipherMorse mors=new CipherMorse();
        System.out.println("Słowa zaszyfrowane szyfrem Cezara o kluczu " +n+ ":");
        HashMap<String, String> words= new HashMap<>();
        words=moj_tekst.getEncodedWords(cezar);
        for(HashMap.Entry<String, String> word: words.entrySet()){
            System.out.println(word.getValue());
        }
        System.out.println("Słowa zaszyfrowane alfabetem morsa:");
        words=moj_tekst.getEncodedWords(mors);
        for(HashMap.Entry<String, String> word: words.entrySet()){
            System.out.println(word.getValue());
        }
    }
}