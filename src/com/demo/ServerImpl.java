package com.demo;

import java.util.Date;
import java.util.Observable;

public class ServerImpl extends Observable implements Server {

    @Override
    public Date getTime() {
        Date currentDate = new Date();
        super.setChanged();
        return currentDate;
    }

}
