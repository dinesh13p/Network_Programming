import java.net.NetworkInterface;
import java.util.Enumeration;

// Lab-4: Program to display the network interfaces of the device.

public class NetworkInterfaceExample {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> addresses = NetworkInterface.getNetworkInterfaces();
            while (addresses.hasMoreElements()) {
                NetworkInterface ni = addresses.nextElement();

                System.out.println(ni.getDisplayName());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}





/*
Program to list assigned IP addresses of network interface
*/

/*
Assignment1:
Explain inet address. Why inet address is used in networking? List out different methods provided by java inet address class
Assignemnt2:
Explain network interface. Why network interface is used in networking? List out different methods provided by java network interface class
*/

























// public class NetworkInterfaceExample {
//     public static void main(String[] args) {
//         try {
//             Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
//             if (interfaces == null) {
//                 System.out.println("No network interfaces found.");
//                 return;
//             }

//             while (interfaces.hasMoreElements()) {
//                 NetworkInterface networkInterface = interfaces.nextElement();
//                 System.out.println("Name: " + networkInterface.getName());
//                 System.out.println("Display name: " + networkInterface.getDisplayName());
//                 System.out.println("Index: " + networkInterface.getIndex());
//                 System.out.println();
//             }

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }