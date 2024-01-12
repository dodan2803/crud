package com.dan.demo_crud.service;

import com.dan.demo_crud.model.Student;
import com.dan.demo_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IManager<Student> {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
//    @Override
//    public List<Student> findByAgeStudent(int age) {
//        return studentRepository.findByAge(age);
//    }
//
//    @Override
//    public List<Student> findByNameContaining(String name) {
//        return studentRepository.findByNameContaining(name);
//    }
//
//    @Override
//    public Student findStudent(String name, int age) {
//        return studentRepository.findStudent(name, age);
//    }
}
