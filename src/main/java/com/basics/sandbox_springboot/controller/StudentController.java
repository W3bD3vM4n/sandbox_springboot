package com.basics.sandbox_springboot.controller;

import com.basics.sandbox_springboot.model.Student;
import com.basics.sandbox_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> saveStudent (@RequestBody Student student) {
        return null; // arreglar esto
    }

    @GetMapping
    public ResponseEntity<Page<Student>> getAllStudent(Integer page, Integer size, Boolean enablePagination) {
        return ResponseEntity.ok(studentService.getAllStudent(page, size, enablePagination));
    }

    @PutMapping
    public ResponseEntity<Student> editStudent (@RequestBody Student student) {
        return null; // arreglar esto
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable ("id") Long id) {
        studentService.deleteStudent(id);
        ResponseEntity.ok(!studentService.existById(id));
        // falta agregar un return y regresar un ResponseEntity
    }
}
