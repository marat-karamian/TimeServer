package com.demo;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Date time = ((ServerImpl) o).getTime();
        System.out.println("Current time is " + ((ServerImpl) o).getTime());
    }
}