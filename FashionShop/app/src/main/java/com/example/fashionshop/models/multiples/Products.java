package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.Product;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Products extends BaseRecord {

    @JsonProperty("resource")
    public List<Product> products = new ArrayList<>();
}
