package com.gentech.student.mapper;
import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student)
    {

        StudentDto studentDto=new StudentDto(
                student.getFirstName(),
                student.getCourseName(),
                student.getEmailId()
        );
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto)
    {
        Student student=new Student(
                studentDto.getFirstName(),
                studentDto.getCourseName(),
                studentDto.getEmailId()
        );
        return student;
    }
}
