package com.example.demo.testTaxiAggregator.DTO;

public class CarsConnectorRequest {
    private String startsAddr;
    private String endAddr;

    public CarsConnectorRequest() {
    }

    public CarsConnectorRequest(String startsAddr, String endAddr) {
        this.startsAddr = startsAddr;
        this.endAddr = endAddr;
    }

    public String getStartsAddr() {
        return startsAddr;
    }

    public void setStartsAddr(String startsAddr) {
        this.startsAddr = startsAddr;
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr;
    }
}
