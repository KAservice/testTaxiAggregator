package com.example.demo.testTaxiAggregator.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class BookingResponse {

    private boolean result;
    private String comment;

    public BookingResponse() {
    }

    public BookingResponse(boolean result, String comment) {
        this.result = result;
        this.comment = comment;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
