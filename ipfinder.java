import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class ipfinder {
    public static void main(String[] args) {
        
        try {
            InetAddress host = InetAddress.getByName("www.youtube.com");
            System.out.println("IP addressen er " + host.getHostAddress());
            System.out.println("IP addressen kommer fra " + host.getHostName());

        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}