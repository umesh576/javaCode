import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            // Connect to server running on localhost and port 5050
            Socket socket = new Socket("localhost", 5100);

            // Send message to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from client!");

            // Receive response from server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();
            System.out.println("Received from server: " + response);

            // Close everything
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
