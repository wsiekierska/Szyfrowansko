public class Main {
    public static void main(String[] args) {
        Wysysara moj_tekst=new Wysysara();
        moj_tekst.wessijPlik(dupsko);
        new HashMap<String String> slowa;
        slowa = moj_tekst.get_words();
        for(HashMap<String String> word: slowa){
            System.out.print(word);
            System.out.print(" ");
        }
        Cipher cezar=new Cipher(2);
        Cipher mors=new Cipher(2);

        moj_tekst.getEncodedWords(Cipher cezar);
    }
}