package com.example.fashionshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserRecord extends BaseRecord {

    @JsonProperty("id")
    public int id;

    @JsonProperty("first_name")
    public String first_name;

    @JsonProperty("last_name")
    public String last_name;

    @JsonProperty("image_url")
    public String image_url;

    @JsonProperty("twitter")
    public String twitter;

    @JsonProperty("skype")
    public String skype;

    @JsonProperty("facebook")
    public String facebook;

    @JsonProperty("notes")
    public String notes;

    @Override
    public void setAllNonNull() {

        first_name = getNonNull(first_name);
        last_name = getNonNull(last_name);
        image_url = getNonNull(image_url);
        twitter = getNonNull(twitter);
        skype = getNonNull(skype);
        facebook = getNonNull(facebook);
        notes = getNonNull(notes);
    }
}