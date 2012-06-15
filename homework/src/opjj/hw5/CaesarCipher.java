package opjj.hw5;

public class CaesarCipher {

    public String encode(String input, int shift) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String decode(String input, int shift) {
        return encode(input, 26 - shift);
    }

}
