package com.dan.demo_crud.service;

import java.util.List;
import java.util.Optional;

public interface IManager<E> {
    void save(E e);
    void delete(Long id);
    List<E> findAll();
    Optional<E> findById(Long id);
//    List<E> findByAgeStudent(int age);
//    List<E> findByNameContaining(String name);
//    E findStudent(String name, int age);
}
