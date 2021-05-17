package com.example.dbproject.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location extends BaseAuditModel<Integer> {


    private String arabicFullName;

    private String regionName;

    private Integer floorNumber;

    private String streetName;

    private String blockName;

    private String neighborhoodName;

    private String englishFullName;

    private String arabicShortName;

    private String englishShortName;

    private Float latitude;

    private Float longitude;


    @OneToOne(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Apartment apartment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "broker_id", referencedColumnName = "id")
    private Broker broker;

    public String getArabicFullName() {
        return arabicFullName;
    }

    public void setArabicFullName(String arabicFullName) {
        this.arabicFullName = arabicFullName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    public String getEnglishFullName() {
        return englishFullName;
    }

    public void setEnglishFullName(String englishFullName) {
        this.englishFullName = englishFullName;
    }

    public String getArabicShortName() {
        return arabicShortName;
    }

    public void setArabicShortName(String arabicShortName) {
        this.arabicShortName = arabicShortName;
    }

    public String getEnglishShortName() {
        return englishShortName;
    }

    public void setEnglishShortName(String englishShortName) {
        this.englishShortName = englishShortName;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }
}
