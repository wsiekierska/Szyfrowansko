public class CipherCaesar extends Cipher {

    private final int shift;

    public CipherCaesar(int shift){
        this.shift = shift;
    }

    @Override
    public String encode(String s) {
        String ret = "";
        char letter;
        for (int i = 0; i < s.length(); i++){
            letter = s.charAt(i);
            letter -= 'a';
            letter += shift;
            letter %= 26;
            letter += 'a';
            ret += letter;
        }
        return ret;
    }
}
