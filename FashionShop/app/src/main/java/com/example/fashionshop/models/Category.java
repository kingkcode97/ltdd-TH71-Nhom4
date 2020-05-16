package com.example.fashionshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Category extends BaseRecord {

    @JsonProperty("category_id")
    public int category_id;

    @JsonProperty("category_name")
    public String category_name;

    @JsonProperty("category_desc")
    public String category_desc;

    @JsonProperty("sequence")
    public int sequence;

    @JsonProperty("image_url")
    public String image_url;

    @Override
    public void setAllNonNull() {

        category_name = getNonNull(category_name);
        category_desc = getNonNull(category_desc);
        image_url = getNonNull(image_url);
    }
}
