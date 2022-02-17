package com.example.solid.ocp;

public interface Notificationservice {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}
