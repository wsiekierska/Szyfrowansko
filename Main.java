import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Wsysara wsys = new Wsysara();
        wsys.wessijPlik("./dane");
        HashMap<String,Integer> slowa = wsys.getWords();
        for(HashMap.Entry<String, Integer> slowo : slowa.entrySet()) {
            System.out.println(slowo.getKey() + " : " + slowo.getValue());
        }
    }
}