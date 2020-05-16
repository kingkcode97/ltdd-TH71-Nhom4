package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.SubCategory;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class SubCategories extends BaseRecord {

    @JsonProperty("resource")
    public List<SubCategory> subCategories = new ArrayList<>();
}