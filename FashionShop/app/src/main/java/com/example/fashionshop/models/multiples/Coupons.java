package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.Coupon;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Coupons extends BaseRecord {

    @JsonProperty("resource")
    public List<Coupon> coupons = new ArrayList<>();

}