package com.example.fashionshop.models.multiples;

import com.example.fashionshop.models.BaseRecord;
import com.example.fashionshop.models.UserRecord;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class UserRecords extends BaseRecord {
    @JsonProperty("resource")
    public List<UserRecord> userRecord = new ArrayList<>();
}