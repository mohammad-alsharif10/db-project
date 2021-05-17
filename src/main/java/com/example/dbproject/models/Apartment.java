package com.example.dbproject.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Apartment extends BaseAuditModel<Integer> {

    private Float area;

    private Integer maximumRentersNumber;

    private Integer monthlyRent;

    private Integer status;

    @OneToMany(
            mappedBy = "apartment",
            cascade = CascadeType.ALL,
            targetEntity = Image.class
    )
    private List<Image> imageList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "broker_id", referencedColumnName = "id")
    private Broker broker;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "id", unique = true)
    private Location location;

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getMaximumRentersNumber() {
        return maximumRentersNumber;
    }

    public void setMaximumRentersNumber(Integer maximumRentersNumber) {
        this.maximumRentersNumber = maximumRentersNumber;
    }

    public Integer getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Integer monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
