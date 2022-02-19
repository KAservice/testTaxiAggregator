package com.example.demo.testTaxiAggregator.connectors;

import com.example.demo.testTaxiAggregator.Car;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IConnector {
    CompletableFuture<List<Car>> getCars(String startAddr, String endAddr);
    CompletableFuture<Boolean> book(long idCar, String userPhone);
    CompletableFuture<Boolean> refuseBooking(long idCar, String userPhone);
    String getAggregatorName();
}
