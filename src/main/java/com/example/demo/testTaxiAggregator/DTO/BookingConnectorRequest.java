package com.example.demo.testTaxiAggregator.DTO;

public class BookingConnectorRequest {

    private long idCAr;
    private String userPhone;
    private String startAddr;
    private String endAddr;


    public BookingConnectorRequest() {
    }

    public BookingConnectorRequest(long idCAr, String userPhone, String startAddr, String endAddr) {
        this.idCAr = idCAr;
        this.userPhone = userPhone;
        this.startAddr = startAddr;
        this.endAddr = endAddr;
    }

    public long getIdCAr() {
        return idCAr;
    }

    public void setIdCAr(long idCAr) {
        this.idCAr = idCAr;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getStartAddr() {
        return startAddr;
    }

    public void setStartAddr(String startAddr) {
        this.startAddr = startAddr;
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr;
    }
}
