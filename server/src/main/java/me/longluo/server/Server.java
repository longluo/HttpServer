package me.longluo.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;
import java.time.Instant;

public class Server {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server Started: " + Time.from(Instant.now()));
            Socket socket = serverSocket.accept();
            System.out.println("Connection Received: " + Time.from(Instant.now()));
        }
    }
}