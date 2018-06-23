package com.demo;

public class Demo {

    public static void main(String[] args){

        Server server = new Server();

        server.register(new Client());
        server.register1();
    }
}
