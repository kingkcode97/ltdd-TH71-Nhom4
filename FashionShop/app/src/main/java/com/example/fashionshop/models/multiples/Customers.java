package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Customers extends BaseRecord {

    @JsonProperty("resource")
    public List<Customer> customers = new ArrayList<>();
}
