import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ProxcyServerExample {

    public static void main(String[] args) {
        try {
            // Set the proxy server and port
            System.setProperty("http.proxyHost", "proxy.example.com");
            System.setProperty("http.proxyPort", "8080");

            // Create a URL object
            URL url = new URL("http://www.example.com");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Get the response code
            int responseCode = ((HttpURLConnection) connection).getResponseCode();
            System.out.println("Response Code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}