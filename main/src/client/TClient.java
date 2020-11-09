package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TClient {

    // Define fields
    private Socket socket;

    // Basic constructor
    public TClient(String host, int port) throws IOException {
        this.socket = new Socket(InetAddress.getByName(host), port);
    }

    // Listen for user input
    public void listen() throws IOException {
        String input;
        while(this.socket.isConnected()){

            // Define Streams
            PrintStream out = new PrintStream(socket.getOutputStream(), true);
            Scanner in = new Scanner(socket.getInputStream());

            // Get input from user
            Scanner userInput = new Scanner(System.in);
            input = userInput.nextLine();
            out.println(input);

            // Accept Server Response
            System.out.println("Server Response: " + in.nextLine());

            // Close things out
            out.close();
            in.close();
            userInput.close();
        }
    }
}
