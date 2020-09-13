package com.example.app.rest;

import com.example.app.entity.Student;
import com.example.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/updateStudent")
    public Student update(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getById(@PathVariable(value = "id") Long id){
        return studentService.find(id);
    }

    @GetMapping("/findAll")
    public List<Student> getAll(){
        return studentService.findAll();
    }

    @DeleteMapping("/removeStudent/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        studentService.delete(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll(){
        studentService.deleteAll();
    }

    @GetMapping("/student/count")
    public long count(){
        return studentService.count();
    }
}