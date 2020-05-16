package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.OrderDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailsMulti extends BaseRecord {

    @JsonProperty("resource")
    public List<OrderDetails> orders = new ArrayList<>();

}