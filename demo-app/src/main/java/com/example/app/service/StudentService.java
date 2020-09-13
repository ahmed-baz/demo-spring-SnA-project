package com.example.app.service;

import com.example.app.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student save(Student student);

    Student update(Student student);

    Optional<Student> find(Long id);

    List<Student> findAll();

    List<Student> findAll(Sort sort);

    Page<Student> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Student student);

    void deleteAll();

    long count();

}