package com.example.demo.testTaxiAggregator.connectors;

import com.example.demo.testTaxiAggregator.DTO.BookingResponse;
import com.example.demo.testTaxiAggregator.DTO.Car;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IConnector {
    CompletableFuture<List<Car>> getCars(String startAddr, String endAddr);
    CompletableFuture<BookingResponse> book(long idCar, String userPhone, String startAddr, String EndAddr);
    CompletableFuture<BookingResponse> refuseBooking(long idCar, String userPhone, String startAddr, String EndAddr);
    String getAggregatorName();
}
