package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TServer {

    private ServerSocket serverSocket;
    private Scanner in;
    private PrintStream out;

    // Constructor
    public TServer(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }

    // Listens for client input
    public void listen() throws IOException {

        Socket socket = serverSocket.accept();
        String input;

        // Open socket to listen for client input.
        while(socket.isConnected()){

            // Define data streams
            this.in = new Scanner(socket.getInputStream());
            this.out = new PrintStream(socket.getOutputStream(), true);

            // Listen for client request
            while((input = this.in.nextLine()) != null){
                System.out.println("Message Received: " + input);

                // Send response
                this.out.println("My response is yes!");
            }
        }
    }
}
