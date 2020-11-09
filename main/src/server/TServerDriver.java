package server;

import common.Defaults;

import java.io.IOException;

public class TServerDriver {

    public static void main(String[] args) throws IOException {
        TServer myServer = new TServer(Integer.parseInt(Defaults.DEFAULT_PORT.getValue()));
        myServer.listen();
    }
}
