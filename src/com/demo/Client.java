package com.demo;

import java.util.Date;

public class Client implements ServerImpl {

    @Override
    public void getTime() {
        Date currentDate = new Date();
        System.out.println("Current time is " + currentDate);
    }

}
