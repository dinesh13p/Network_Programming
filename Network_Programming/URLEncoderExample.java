import java.net.URLEncoder;

public class URLEncoderExample {
    public static void main(String[] args) throws Exception {
        String text = "Dinesh Poudel & Co";
        String encoded = URLEncoder.encode(text, "UTF-8");

        System.out.println("Original: " + text);
        System.out.println("Encoded : " + encoded);
    }
}