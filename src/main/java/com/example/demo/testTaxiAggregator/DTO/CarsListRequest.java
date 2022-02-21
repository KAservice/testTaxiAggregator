package com.example.demo.testTaxiAggregator.DTO;

public class CarsListRequest {

    private String startAddr;
    private String endAddr;

    public CarsListRequest() {
    }

    public CarsListRequest(String startAddr, String endAddr) {
        this.startAddr = startAddr;
        this.endAddr = endAddr;
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
