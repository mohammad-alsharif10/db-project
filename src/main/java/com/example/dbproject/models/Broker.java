package com.example.dbproject.models;


import com.example.dbproject.models.security.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Broker extends BaseAuditModel<Integer> {

    private String firstName;

    private String lastName;

    private String middleName;

    private String phoneNumber;

    private String userName;

    private String passWord;


    @OneToMany(
            mappedBy = "broker",
            cascade = CascadeType.ALL,
            targetEntity = Image.class
    )
    private List<Image> imageList = new ArrayList<>();

    @OneToMany(
            mappedBy = "broker",
            cascade = CascadeType.ALL,
            targetEntity = Apartment.class
    )
    private List<Apartment> apartmentList = new ArrayList<>();

    @OneToMany(
            mappedBy = "broker",
            cascade = CascadeType.ALL,
            targetEntity = Location.class
    )
    private List<Location> locationList = new ArrayList<>();

    @OneToOne(
            mappedBy = "broker",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            targetEntity = User.class
    )
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id", referencedColumnName = "id")
    private College college;

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
