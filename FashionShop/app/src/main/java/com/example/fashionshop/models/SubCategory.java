package com.example.fashionshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SubCategory extends BaseRecord {

    @JsonProperty("sub_category_id")
    public int sub_category_id;

    @JsonProperty("category_id")
    public int category_id;

    @JsonProperty("sub_category_name")
    public String sub_category_name;

    @JsonProperty("sub_category_desc")
    public String sub_category_desc;

    @JsonProperty("sequence")
    public int sequence;

    @JsonProperty("image_url")
    public String image_url;

    @Override
    public void setAllNonNull() {

        sub_category_name = getNonNull(sub_category_name);
        sub_category_desc = getNonNull(sub_category_desc);
        image_url = getNonNull(image_url);

    }

}