package com.example.fashionshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Customer extends BaseRecord {

    @JsonProperty("customer_id")
    public int customer_id;

    @JsonProperty("customer_dev_id")
    public String customer_dev_id;

    @JsonProperty("first_name")
    public String first_name;

    @JsonProperty("last_name")
    public String last_name;

    @JsonProperty("mobile")
    public String mobile;

    @JsonProperty("email")
    public String email;

    @JsonProperty("address")
    public String address;

    @JsonProperty("city")
    public String city;

    @JsonProperty("country")
    public String country;

    @JsonProperty("wallet_value")
    public double wallet_value;

    @JsonProperty("zipcode")
    public String zipcode;

    @Override
    public void setAllNonNull() {

        first_name = getNonNull(last_name);
        last_name = getNonNull(last_name);
        mobile = getNonNull(mobile);
        address = getNonNull(address);
        city = getNonNull(city);
        country = getNonNull(country);
    }
}
