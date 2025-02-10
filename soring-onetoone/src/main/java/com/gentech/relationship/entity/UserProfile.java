package com.gentech.relationship.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_userprofiles")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_profile_id")
    private Long id;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "city_name")
    private String cityName;
    @Column(name="userprofile_address")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public UserProfile(){

    }
    public UserProfile(String emailId, Long phoneNumber, String cityName, String address, User user) {
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.cityName = cityName;
        this.address = address;
        this.user = user;
    }

    public UserProfile(Long id, String emailId, Long phoneNumber, String cityName, String address, User user) {
        this.id = id;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.cityName = cityName;
        this.address = address;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
