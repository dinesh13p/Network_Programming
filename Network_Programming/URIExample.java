import java.net.URI;

public class URIExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI(
                    "https://admin:password123@example.com/shop/products/item.html?category=electronics&id=9876");

            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Scheme Specific Part: " + uri.getSchemeSpecificPart());
            // System.out.println("Raw Scheme Spec Part: " +
            // uri.getRawSchemeSpecificPart());
            System.out.println("Authority: " + uri.getAuthority());
            // System.out.println("Raw Authority: " + uri.getRawAuthority());
            System.out.println("User Info: " + uri.getUserInfo());
            // System.out.println("Raw User Info: " + uri.getRawUserInfo());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            // System.out.println("Raw Path : " + uri.getRawPath());
            System.out.println("Query: " + uri.getQuery());
            // System.out.println("Raw Query: " + uri.getRawQuery());
            System.out.println("Fragment: " + uri.getFragment());
            System.out.println("Raw Fragment: " + uri.getRawFragment());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//LAB: Program to extract part of URI