package com.example.fashionshop.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDetails extends BaseRecord {

    @JsonProperty("order_detail_id")
    public int order_detail_id;

    @JsonProperty("order_id")
    public int order_id;

    @JsonProperty("product_id")
    public int product_id;

    @JsonProperty("quantity")
    public int quantity;

    @JsonProperty("variant")
    public String variant;

}
