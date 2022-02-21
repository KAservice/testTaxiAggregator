package com.example.demo.testTaxiAggregator.DTO;

public class BookingRequest {
    private String startAddr;
    private String endAddr;
    private String aggregatorName;
    private String userPhone;
    private long idCar;

    public BookingRequest() {
    }

    public BookingRequest(String startAddr, String endAddr, String aggregatorName, String userPhone, long idCar) {
        this.startAddr = startAddr;
        this.endAddr = endAddr;
        this.aggregatorName = aggregatorName;
        this.userPhone = userPhone;
        this.idCar = idCar;
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

    public String getAggregatorName() {
        return aggregatorName;
    }

    public void setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public long getIdCar() {
        return idCar;
    }

    public void setIdCar(long idCar) {
        this.idCar = idCar;
    }
}
