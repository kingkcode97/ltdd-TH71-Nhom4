package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.CartItem;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class CartItems extends BaseRecord {

    @JsonProperty("resource")
    public List<CartItem> cartItemList = new ArrayList<>();

}