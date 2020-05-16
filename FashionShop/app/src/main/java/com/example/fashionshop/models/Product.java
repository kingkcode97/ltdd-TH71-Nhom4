package com.example.fashionshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Product extends BaseRecord {

    @JsonProperty("product_id")
    public int product_id;

    @JsonProperty("sub_category_id")
    public int sub_category_id;

    @JsonProperty("product_name")
    public String product_name;

    @JsonProperty("product_desc")
    public String product_desc;

    @JsonProperty("image_url")
    public String image_url;

    @JsonProperty("unit_mrp")
    public float unit_mrp;

    @JsonProperty("unit_offerprice")
    public float unit_offerprice;

    @JsonProperty("unit_shipping")
    public float unit_shipping;

    @Override
    public void setAllNonNull() {

        product_name = getNonNull(product_name);
        product_desc = getNonNull(product_desc);
        image_url = getNonNull(image_url);

    }

}
