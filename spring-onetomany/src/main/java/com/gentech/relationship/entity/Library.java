package com.gentech.relationship.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "library_id")
    private  Long id;
    @Column(name = "library_name")
    private String libraryName;
    @Column(name = "library_type")
    private String libraryType;
    @Column(name = "library_location")
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_library_id",referencedColumnName = "library_id")
    private List<Books> books=new ArrayList<>();

    public Library(){

    }

    public Library(Long id, String libraryName, String libraryType, String location, List<Books> books) {
        this.id = id;
        this.libraryName = libraryName;
        this.libraryType = libraryType;
        this.location = location;
        this.books = books;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(String libraryType) {
        this.libraryType = libraryType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}

