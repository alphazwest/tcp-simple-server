package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TClient {

    // Define fields
    private Socket socket;
    private Scanner in;
    private PrintStream out;

    // Basic constructor
    public TClient(String host, int port) throws IOException {
        this.socket = new Socket(InetAddress.getByName(host), port);
    }

    // Listen for user input
    public void listen() throws IOException {
        String input;  // hold user input
        while(this.socket.isConnected()){

            // Define Steams
            this.out = new PrintStream(socket.getOutputStream(), true);
            this.in = new Scanner(socket.getInputStream());

            // Send user message to server
            // NOTE: Scanner + Keyboard in while scan.hasNext() results in infinite loop
            //       unless a specific series of terminating letters are used + handled..
            Scanner userInput = new Scanner(System.in);
            input = userInput.nextLine();
            this.out.println(input);

            // Accept Server Response
            System.out.println("Server Response: " + this.in.nextLine());

            // Close things out
            this.out.close();
            this.in.close();
            userInput.close();
        }
    }
}
