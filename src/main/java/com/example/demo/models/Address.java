
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "stormodtagerpostnr",
    "type",
    "tekst",
    "forslagstekst",
    "caretpos"
})
public class Address {

    @JsonProperty("data")
    private Data data;
    @JsonProperty("stormodtagerpostnr")
    private Boolean stormodtagerpostnr;
    @JsonProperty("type")
    private String type;
    @JsonProperty("tekst")
    private String tekst;
    @JsonProperty("forslagstekst")
    private String forslagstekst;
    @JsonProperty("caretpos")
    private Integer caretpos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("stormodtagerpostnr")
    public Boolean getStormodtagerpostnr() {
        return stormodtagerpostnr;
    }

    @JsonProperty("stormodtagerpostnr")
    public void setStormodtagerpostnr(Boolean stormodtagerpostnr) {
        this.stormodtagerpostnr = stormodtagerpostnr;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("tekst")
    public String getTekst() {
        return tekst;
    }

    @JsonProperty("tekst")
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @JsonProperty("forslagstekst")
    public String getForslagstekst() {
        return forslagstekst;
    }

    @JsonProperty("forslagstekst")
    public void setForslagstekst(String forslagstekst) {
        this.forslagstekst = forslagstekst;
    }

    @JsonProperty("caretpos")
    public Integer getCaretpos() {
        return caretpos;
    }

    @JsonProperty("caretpos")
    public void setCaretpos(Integer caretpos) {
        this.caretpos = caretpos;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
