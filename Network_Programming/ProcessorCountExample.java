import java.io.*;

public class ProcessorCountExample {

    public static void main(String[] args) {

        int count300 = 0;
        int count400 = 0;

        try {
            InputStream input = new FileInputStream("log.txt");

            InputStreamReader reader = new InputStreamReader(input);

            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(" ");

                int statusCode = Integer.parseInt(data[4]);

                if (statusCode >= 300 && statusCode < 400) {
                    count300++;
                }

                if (statusCode >= 400 && statusCode < 500) {
                    count400++;
                }
            }

            br.close();

            System.out.println("300 series: " + count300);
            System.out.println("400 series: " + count400);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}