
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
    "id",
    "status",
    "darstatus",
    "vejkode",
    "vejnavn",
    "adresseringsvejnavn",
    "husnr",
    "etage",
    "d\u00f8r",
    "supplerendebynavn",
    "postnr",
    "postnrnavn",
    "stormodtagerpostnr",
    "stormodtagerpostnrnavn",
    "kommunekode",
    "adgangsadresseid",
    "x",
    "y",
    "href"
})
public class Data {

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("darstatus")
    private Integer darstatus;
    @JsonProperty("vejkode")
    private String vejkode;
    @JsonProperty("vejnavn")
    private String vejnavn;
    @JsonProperty("adresseringsvejnavn")
    private String adresseringsvejnavn;
    @JsonProperty("husnr")
    private String husnr;
    @JsonProperty("etage")
    private Object etage;
    @JsonProperty("d\u00f8r")
    private Object dR;
    @JsonProperty("supplerendebynavn")
    private Object supplerendebynavn;
    @JsonProperty("postnr")
    private String postnr;
    @JsonProperty("postnrnavn")
    private String postnrnavn;
    @JsonProperty("stormodtagerpostnr")
    private Object stormodtagerpostnr;
    @JsonProperty("stormodtagerpostnrnavn")
    private Object stormodtagerpostnrnavn;
    @JsonProperty("kommunekode")
    private String kommunekode;
    @JsonProperty("adgangsadresseid")
    private String adgangsadresseid;
    @JsonProperty("x")
    private Double x;
    @JsonProperty("y")
    private Double y;
    @JsonProperty("href")
    private String href;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("darstatus")
    public Integer getDarstatus() {
        return darstatus;
    }

    @JsonProperty("darstatus")
    public void setDarstatus(Integer darstatus) {
        this.darstatus = darstatus;
    }

    @JsonProperty("vejkode")
    public String getVejkode() {
        return vejkode;
    }

    @JsonProperty("vejkode")
    public void setVejkode(String vejkode) {
        this.vejkode = vejkode;
    }

    @JsonProperty("vejnavn")
    public String getVejnavn() {
        return vejnavn;
    }

    @JsonProperty("vejnavn")
    public void setVejnavn(String vejnavn) {
        this.vejnavn = vejnavn;
    }

    @JsonProperty("adresseringsvejnavn")
    public String getAdresseringsvejnavn() {
        return adresseringsvejnavn;
    }

    @JsonProperty("adresseringsvejnavn")
    public void setAdresseringsvejnavn(String adresseringsvejnavn) {
        this.adresseringsvejnavn = adresseringsvejnavn;
    }

    @JsonProperty("husnr")
    public String getHusnr() {
        return husnr;
    }

    @JsonProperty("husnr")
    public void setHusnr(String husnr) {
        this.husnr = husnr;
    }

    @JsonProperty("etage")
    public Object getEtage() {
        return etage;
    }

    @JsonProperty("etage")
    public void setEtage(Object etage) {
        this.etage = etage;
    }

    @JsonProperty("d\u00f8r")
    public Object getDR() {
        return dR;
    }

    @JsonProperty("d\u00f8r")
    public void setDR(Object dR) {
        this.dR = dR;
    }

    @JsonProperty("supplerendebynavn")
    public Object getSupplerendebynavn() {
        return supplerendebynavn;
    }

    @JsonProperty("supplerendebynavn")
    public void setSupplerendebynavn(Object supplerendebynavn) {
        this.supplerendebynavn = supplerendebynavn;
    }

    @JsonProperty("postnr")
    public String getPostnr() {
        return postnr;
    }

    @JsonProperty("postnr")
    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    @JsonProperty("postnrnavn")
    public String getPostnrnavn() {
        return postnrnavn;
    }

    @JsonProperty("postnrnavn")
    public void setPostnrnavn(String postnrnavn) {
        this.postnrnavn = postnrnavn;
    }

    @JsonProperty("stormodtagerpostnr")
    public Object getStormodtagerpostnr() {
        return stormodtagerpostnr;
    }

    @JsonProperty("stormodtagerpostnr")
    public void setStormodtagerpostnr(Object stormodtagerpostnr) {
        this.stormodtagerpostnr = stormodtagerpostnr;
    }

    @JsonProperty("stormodtagerpostnrnavn")
    public Object getStormodtagerpostnrnavn() {
        return stormodtagerpostnrnavn;
    }

    @JsonProperty("stormodtagerpostnrnavn")
    public void setStormodtagerpostnrnavn(Object stormodtagerpostnrnavn) {
        this.stormodtagerpostnrnavn = stormodtagerpostnrnavn;
    }

    @JsonProperty("kommunekode")
    public String getKommunekode() {
        return kommunekode;
    }

    @JsonProperty("kommunekode")
    public void setKommunekode(String kommunekode) {
        this.kommunekode = kommunekode;
    }

    @JsonProperty("adgangsadresseid")
    public String getAdgangsadresseid() {
        return adgangsadresseid;
    }

    @JsonProperty("adgangsadresseid")
    public void setAdgangsadresseid(String adgangsadresseid) {
        this.adgangsadresseid = adgangsadresseid;
    }

    @JsonProperty("x")
    public Double getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(Double x) {
        this.x = x;
    }

    @JsonProperty("y")
    public Double getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Double y) {
        this.y = y;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
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
