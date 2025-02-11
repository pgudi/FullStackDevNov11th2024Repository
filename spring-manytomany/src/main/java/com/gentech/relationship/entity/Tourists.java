package com.gentech.relationship.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_tourists")
public class Tourists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourist_id")
    private Long id;
    @Column(name = "tourist_name")
    private String touristName;
    @Column(name = "tourist_emailid")
    private String emailId;
    @Column(name = "tourist_country_name")
    private String countryName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tourists_places",
    joinColumns = {@JoinColumn(name = "tourist_tourist_id")},
            inverseJoinColumns = {@JoinColumn(name = "place_place_id")}
    )
    private Set<Places> places=new HashSet<>();

    public Tourists(){

    }
    public Tourists(String touristName, String emailId, String countryName) {
        this.touristName = touristName;
        this.emailId = emailId;
        this.countryName = countryName;
    }

    public Tourists(Long id, String touristName, String emailId, String countryName, Set<Places> places) {
        this.id = id;
        this.touristName = touristName;
        this.emailId = emailId;
        this.countryName = countryName;
        this.places = places;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set<Places> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Places> places) {
        this.places = places;
    }
}
