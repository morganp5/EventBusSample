package com.example.peter.eventbussample;

/**
 * Created by Peter on 23/02/2015.
 */
public class ChargingEvent {
    private String data;

    public ChargingEvent(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }
}
