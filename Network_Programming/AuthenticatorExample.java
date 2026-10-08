import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;

public class AuthenticatorExample {
    public static void main(String[] args) throws Exception {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("user", "passwd".toCharArray());
            }
        });

        URL url = new URL("https://httpbin.org/basic-auth/user/passwd");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        System.out.println("Response Code: " + con.getResponseCode());
    }
}