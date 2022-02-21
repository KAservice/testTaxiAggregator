package com.example.demo.testTaxiAggregator;

import com.example.demo.testTaxiAggregator.DTO.BookingResponse;
import com.example.demo.testTaxiAggregator.DTO.Car;
import com.example.demo.testTaxiAggregator.connectors.IConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class AggregatorService {

    @Autowired
    private IConnector[] connectorsArray;

    public List<Car> getCars(String startAddr, String endAddr){
        List<Car> cars = new ArrayList<>();
        List<CompletableFuture<List<Car>>> futureCars = new ArrayList<>();

        for (IConnector connector : connectorsArray){
            futureCars.add(connector.getCars(startAddr, endAddr));
        }
        CompletableFuture.allOf(futureCars.toArray(new CompletableFuture[0])).join();

        try {
            for (CompletableFuture<List<Car>> singleConnectorList : futureCars) {
                cars.addAll(singleConnectorList.get());
            }
        }
        catch (Exception ex){

        }

        return cars;
    }

    public BookingResponse book(String startAddr, String endAddr, String aggregatorName, String userPhone, long idCar){
        BookingResponse result = new BookingResponse(false, "");
        for (IConnector connector : connectorsArray){
            try {
                if (connector.getAggregatorName().equals(aggregatorName)) {
                    CompletableFuture<BookingResponse> futureResult = connector.book(idCar, userPhone, startAddr, endAddr);
                    result = futureResult.get();
                    return result;
                }
            }
            catch (Exception ex){

            }
        }
        return result;
    }

    public BookingResponse refuseBooking(String startAddr, String endAddr, String aggregatorName, String userPhone, long idCar){
        BookingResponse result = new BookingResponse(false, "");
        for (IConnector connector : connectorsArray){
            try {
                if (connector.getAggregatorName().equals(aggregatorName)) {
                    CompletableFuture<BookingResponse> futureResult = connector.refuseBooking(idCar, userPhone, startAddr, endAddr);
                    result = futureResult.get();
                    return result;
                }
            }
            catch (Exception ex){

            }
        }
        return result;
    }
}
