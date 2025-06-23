import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            // Create server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5100);
            System.out.println("Server started. Waiting for client...");

            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read message from client
            String message = in.readLine();
            System.out.println("Received from client: " + message);

            // Send response
            out.println("Hello from server!");

            // Close resources
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
