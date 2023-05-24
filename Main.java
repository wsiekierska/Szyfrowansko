import java.util.HashMap;
public class Main {
    public static void main(String[] args) throws Exception{
        int n;
        Wsysara moj_tekst=new Wsysara();
        moj_tekst.wessijPlik("dane");
        HashMap<String, Integer> slowa= new HashMap<String, Integer>;
        slowa = moj_tekst.getWords();
        System.out.println("Wejściowe słowa:");
        for(HashMap<String, Integer> word: slowa){
            System.out.println(word.getValue());
        }
        Caesar cezar=new Caesar(n);
        CipherMorse mors=new CipherMorse();
        System.out.println("Słowa zaszyfrowane szyfrem Cezara o kluczu " +n ":");
        HashMap<String, Integer> words= new HashMap<String, Integer>;
        words=moj_tekst.getEncodedWords(Caesar cezar);
        for(HashMap<String, String> word: words){
            System.out.println(word.getValue());
        }
        System.out.println("Słowa zaszyfrowane alfabetem morsa:");
        words=moj_tekst.getEncodedWords(CipherMorse mors);
        for(HashMap<String, String> word: words){
            System.out.println(word.getValue());
        }
    }
}