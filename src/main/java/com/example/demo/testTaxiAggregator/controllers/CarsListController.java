package com.example.demo.testTaxiAggregator.controllers;

import com.example.demo.testTaxiAggregator.AggregatorService;
import com.example.demo.testTaxiAggregator.DTO.Car;
import com.example.demo.testTaxiAggregator.DTO.CarsListRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarsListController {

    @Autowired
    private AggregatorService aggregatorService;

    @PostMapping("/findCars")
    public List<Car> getCars(@RequestBody CarsListRequest request){
        return aggregatorService.getCars(request.getStartAddr(), request.getEndAddr());
    }
}