package com.example.dbproject.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Image extends BaseAuditModel<Integer> {

    private String path;

    private Boolean isCurrentProfileImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "broker_id", referencedColumnName = "id")
    private Broker broker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id", referencedColumnName = "id")
    private Apartment apartment;

    public Image(String path, Boolean isCurrentProfileImage, Broker broker, Apartment apartment) {
        this.path = path;
        this.isCurrentProfileImage = isCurrentProfileImage;
        this.broker = broker;
        this.apartment = apartment;
    }

    public Image() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getCurrentProfileImage() {
        return isCurrentProfileImage;
    }

    public void setCurrentProfileImage(Boolean currentProfileImage) {
        isCurrentProfileImage = currentProfileImage;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}
