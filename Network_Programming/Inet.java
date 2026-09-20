import java.net.*;

public class Inet {
    public static void main(String[] args) {
        try {
            InetAddress address1 = InetAddress.getLocalHost();
            System.out.println("InetAddress of local host:" + address1);

            InetAddress address2 = InetAddress.getByName("dinesh-poudel.com.np");
            System.out.println("InetAddress of Named Host : " + address2);


            InetAddress address4 = InetAddress.getByName("172.19.25.29");
            System.out.println("InetAddress of Named Host : " + address4);

            System.out.println(address2.equals(address4));

            InetAddress address3[] = InetAddress.getAllByName("172.19.25.29");
            for (int i = 0; i < address3.length; i++) {
                System.out.println("All the InetAddress of Named Host:" + address3[i]);
            }

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}