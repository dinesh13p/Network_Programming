import java.net.MalformedURLException;
import java.net.URL;

public class URLConstructors {
    public static void main(String[] args) throws MalformedURLException {

        // 1. URL(String spec)
        URL url1 = new URL(
                " https://www.linkedin.com/in/dineshpoudel004/");
                System.out.println(url1);

        // 2. URL(String protocol, String host, String file)
        URL url2 = new URL(
                "https",
                "www.linkedin.com",
                "/in/dineshpoudel004");
                System.out.println(url2);

        // 3. URL(String protocol, String host, int port, String file)
        URL url3 = new URL(
                "https",
                "www.linkedin.com",
                443,
                "/in/dineshpoudel004");
                System.out.println(url3);

        // 4. URL(URL context, String spec)
        URL base = new URL("https://www.linkedin.com/");
        URL url4 = new URL(base, "/in/dineshpoudel004");
        System.out.println(url4);
    }
}


/*
ASSIGNMENT-4
List out different methods provided by java url class with its usage.
*/