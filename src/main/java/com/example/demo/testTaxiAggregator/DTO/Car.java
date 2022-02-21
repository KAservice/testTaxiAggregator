package com.example.demo.testTaxiAggregator.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Car {

    private long idCar;
    private String model;
    private String phoneNumber;
    private String licensePlate;
    private String aggregatorName;

    public Car() {
    }

    public Car(long id, String model, String phoneNumber, String licensePlate, String aggregatorName) {
        this.idCar = id;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.licensePlate = licensePlate;
        this.aggregatorName = aggregatorName;
    }

    public long getId() {
        return idCar;
    }

    public void setId(long id) {
        this.idCar = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getAggregatorName() {
        return aggregatorName;
    }

    public void setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + idCar +
                ", model='" + model + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", aggregatorName='" + aggregatorName + '\'' +
                '}';
    }
}
