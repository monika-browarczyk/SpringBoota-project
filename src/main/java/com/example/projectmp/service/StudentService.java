package com.example.projectmp.service;

import com.example.projectmp.data.Student;
import com.example.projectmp.data.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent (Student student) {
        studentRepository.saveStudent(student);
    }

    public Student getStudentById(UUID id) {
        return studentRepository.getStudentById(id);
    }
}
