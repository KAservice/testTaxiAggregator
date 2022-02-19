package com.example.demo.testTaxiAggregator.connectors;

import com.example.demo.testTaxiAggregator.Car;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class FirstConnector implements IConnector {
    RestTemplate restTemplate = new RestTemplate();
    private String aggregatorName = "First";

    @Override
    @Async
    public CompletableFuture<List<Car>> getCars(String startAddr, String endAddr) {
        List<Car> cars = restTemplate.getForObject("getURL", ArrayList.class);
        return CompletableFuture.completedFuture(cars);
    }

    @Override
    @Async
    public CompletableFuture<Boolean> book(long idCar, String userPhone) {
        Boolean result = restTemplate.getForObject("bookURL", Boolean.class);
        return CompletableFuture.completedFuture(result);
    }

    @Override
    @Async
    public CompletableFuture<Boolean> refuseBooking(long idCar, String userPhone) {
        Boolean result = restTemplate.getForObject("refuseBookURL", Boolean.class);
        return CompletableFuture.completedFuture(result);
    }

    public String getAggregatorName() {
        return aggregatorName;
    }
}
