import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
    public static void main(String[] args) {

        String address = "192.168.10.1";

        if (isSpam(address)) {
            System.out.println(address + " is a Spam Address");
        } else {
            System.out.println(address + " is a valid Address");
        }
    }

    private static boolean isSpam(String address) {
        String DNSBL = "sbl.spamhaus.org";
        try {
            InetAddress addr = InetAddress.getByName(address);
            byte[] quad = addr.getAddress();

            String query = DNSBL;
            for (byte octet : quad) {
                int unsignedByte = octet < 0 ? octet + 256 : octet;
                query = unsignedByte + "." + query;
            }

            InetAddress.getByName(query); 
            return true; 

        } catch (UnknownHostException e) {
            return false; 
        }
    }
}


/*
ASSIGNMENT-3

Explain file input stream, imput stream, buffer reader, input stream readern with its usage

FileInputStream
InputStream
BufferStream
InputStreamReader
*/