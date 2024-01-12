package com.dan.demo_crud.repository;

import com.dan.demo_crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
//    List<Student> findByAge(int age);
//    List<Student> findByNameContaining(String name);
//
//    @Query(value = "select * from student where name = :name and age = :age", nativeQuery = true)
//    Student findStudent(@Param("name")String name, @Param("age") int age);
}
