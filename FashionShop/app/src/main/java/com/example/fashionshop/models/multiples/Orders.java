package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.Order;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Orders extends BaseRecord {

    @JsonProperty("resource")
    public List<Order> orders = new ArrayList<>();

}

