package com.example.demo.testTaxiAggregator.controllers;

import com.example.demo.testTaxiAggregator.AggregatorService;
import com.example.demo.testTaxiAggregator.DTO.BookingRequest;
import com.example.demo.testTaxiAggregator.DTO.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    private AggregatorService aggregatorService;

    @PostMapping("/booking")
    public BookingResponse book(@RequestBody BookingRequest request){
        return aggregatorService.book(request.getStartAddr(), request.getEndAddr(), request.getAggregatorName(), request.getUserPhone(), request.getIdCar());
    }

    @PutMapping("/booking")
    public BookingResponse refuseBooking(@RequestBody BookingRequest request){
        return aggregatorService.refuseBooking(request.getStartAddr(), request.getEndAddr(), request.getAggregatorName(), request.getUserPhone(), request.getIdCar());
    }
}
