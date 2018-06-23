package com.demo;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Server server = new ServerImpl();
        Client client = new Client();

        ((ServerImpl) server).addObserver(client);

        for(int i = 1; i < 10; i++) {
            server.getTime();
            Thread.sleep(2000);
            ((ServerImpl) server).notifyObservers();
        }
    }
}