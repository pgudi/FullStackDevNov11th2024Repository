package com.gentech.relationship.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_places")
public class Places {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Long id;
    @Column(name = "place_name")
    private String placeName;
    @Column(name = "place_type")
    private String placeType;
    @Column(name = "place_state")
    private String placeState;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "places")
    private Set<Tourists> tourists=new HashSet<>();
    public Places(){

    }

    public Places(String placeName, String placeType, String placeState) {
        this.placeName = placeName;
        this.placeType = placeType;
        this.placeState = placeState;
    }

    public Places(Long id, String placeName, String placeType, String placeState, Set<Tourists> tourists) {
        this.id = id;
        this.placeName = placeName;
        this.placeType = placeType;
        this.placeState = placeState;
        this.tourists = tourists;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getPlaceState() {
        return placeState;
    }

    public void setPlaceState(String placeState) {
        this.placeState = placeState;
    }

    public Set<Tourists> getTourists() {
        return tourists;
    }

    public void setTourists(Set<Tourists> tourists) {
        this.tourists = tourists;
    }
}
