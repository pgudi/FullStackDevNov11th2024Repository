package com.gentech.student.serviceimpl;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.Student;
import com.gentech.student.mapper.StudentMapper;
import com.gentech.student.repository.StudentRepository;
import com.gentech.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepo;
    @Override
    public StudentDto createStudent(StudentDto studentdto) {
        Student student= StudentMapper.mapToStudent(studentdto);
        Student savedStudent=studentRepo.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }
}
