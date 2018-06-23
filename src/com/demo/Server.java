package com.demo;

public class Server {
    ServerImpl server;

    public void register(ServerImpl server) {
        this.server = server;
    }

    public void register1() {
        server.getTime();
    }
}
