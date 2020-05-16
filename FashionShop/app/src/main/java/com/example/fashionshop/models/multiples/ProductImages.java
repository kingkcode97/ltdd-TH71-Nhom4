package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.ProductImage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductImages extends BaseRecord {

    @JsonProperty("resource")
    public List<ProductImage> productImages = new ArrayList<>();

}