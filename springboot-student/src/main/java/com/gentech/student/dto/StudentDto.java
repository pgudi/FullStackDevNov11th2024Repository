package com.gentech.student.dto;

public class StudentDto {
    private Integer studentId;
    private String firstName;
    private String courseName;
    private String emailId;

    public StudentDto(){

    }

    public StudentDto(Integer studentId, String firstName, String courseName, String emailId) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
    }

    public StudentDto(String firstName, String courseName, String emailId) {
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
