package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.Category;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Categories extends BaseRecord {
    @JsonProperty("resource")
    public List<Category> categories = new ArrayList<>();
}
