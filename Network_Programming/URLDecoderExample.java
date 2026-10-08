import java.net.URLDecoder;

public class URLDecoderExample {
    public static void main(String[] args) throws Exception {
        String encoded = "Dinesh+Poudel+%26+Co";
        String decoded = URLDecoder.decode(encoded, "UTF-8");

        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}