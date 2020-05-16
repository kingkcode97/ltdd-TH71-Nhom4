package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.Variant;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Variants extends BaseRecord {
    @JsonProperty("resource")
    public List<Variant> variants = new ArrayList<>();
}
