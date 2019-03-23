package com.company.jsondeserializer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "list"
})
public class Lister {

    @JsonProperty("list")
    private ArrayList<Serializer> list;

    public Lister(ArrayList<Serializer> list) {
        this.list = list;
    }

    public Lister(){}
    @JsonProperty("list")
    public ArrayList<Serializer> getList() {
        return list;
    }
    @JsonProperty("list")
    public void setList(ArrayList<Serializer> list) {
        this.list = list;
    }
}
