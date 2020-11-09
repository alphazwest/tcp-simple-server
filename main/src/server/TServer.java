package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TServer {

    private ServerSocket serverSocket;

    // Constructor
    public TServer(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }

    // Listens for client input
    public void listen() throws IOException {

        // Start accepting connections
        Socket socket = serverSocket.accept();
        String input;

        // Open socket to listen for client input.
        while(socket.isConnected()){

            // Define data streams
            Scanner in = new Scanner(socket.getInputStream());
            PrintStream out = new PrintStream(socket.getOutputStream(), true);

            // Listen for client request
            while((input = in.nextLine()) != null){

                // Streams client message to System.out
                System.out.println("New Message: " + input);

                // Send response
                out.println("Message Received.");
            }

            // Close streams
            in.close();
            out.close();
        }
    }
}
