import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetaddressexample {

        public static void main(String[] args) {

                String[] addresses = {
                                "127.0.0.1",
                                "0.0.0.0",
                                "192.168.1.1",
                                "169.254.1.1",
                                "224.0.0.1",
                                "239.255.255.250",
                                "10.0.0.1",
                                "172.16.0.1",
                                "8.8.8.8",
                                "1.1.1.1"
                };

                for (String ip : addresses) {

                        try {
                                InetAddress address = InetAddress.getByName(ip);
                                System.out.println("\nAddress: " + ip);
                                System.out.println("Host Name: " + address.getHostName());
                                System.out.println("Host Address: " + address.getHostAddress());
                                System.out.println("Any Local: " + address.isAnyLocalAddress());
                                System.out.println("Loopback: " + address.isLoopbackAddress());
                                System.out.println("Link Local: " + address.isLinkLocalAddress());
                                System.out.println("Site Local: " + address.isSiteLocalAddress());
                                System.out.println("Multicast: " + address.isMulticastAddress());
                        } catch (UnknownHostException e) {
                                System.out.println("Invalid address: " + ip);
                        }
                }
        }
}