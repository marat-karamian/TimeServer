package com.demo;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Server server = new Server();

        server.register(new Client());


        for(int i = 1; i < 10; i++) {
            server.process();
            Thread.sleep(2000);
    }
    }
}
