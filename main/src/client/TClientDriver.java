package client;

import common.Defaults;

import java.io.IOException;

public class TClientDriver {

    public static void main(String[] args) throws IOException {
        TClient myClient = new TClient(
                Defaults.DEFAULT_HOST.getValue(),
                Integer.parseInt(Defaults.DEFAULT_PORT.getValue()));
        myClient.listen();

    }
}
