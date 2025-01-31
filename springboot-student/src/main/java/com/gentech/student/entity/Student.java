package com.gentech.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "email_id")
    private String emailId;

    public Student(){

    }

    public Student(Integer studentId, String firstName, String courseName, String emailId) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
    }

    public Student(String firstName, String courseName, String emailId) {
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
