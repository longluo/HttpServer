package me.longluo.client;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("client start...");

        try (Socket socket = new Socket("localhost", 8080)) {
            // noop
        }
    }
}
