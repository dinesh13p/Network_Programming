import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

// Lab-3: Program to test address reachability and object methods equals, hashCode, toString, and isReachable.

public class AddressReachabilityExample {
    private static final int TIMEOUT_MILLISECONDS = 2000;

    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";

        try {
            InetAddress address = InetAddress.getByName(host);
            InetAddress sameAddress = InetAddress.getByName(address.getHostAddress());

            System.out.println("Address: " + address);
            System.out.println("Host name: " + address.getHostName());
            System.out.println("Host address: " + address.getHostAddress());
            System.out.println("Equals same address: " + address.equals(sameAddress));
            System.out.println("Hash code: " + address.hashCode());
            System.out.println("To string: " + address.toString());

            try {
                System.out.println("Reachable: " + address.isReachable(TIMEOUT_MILLISECONDS));
            } catch (IOException e) {
                System.out.println("Reachability check failed: " + e.getMessage());
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + host);
        }
    }
}