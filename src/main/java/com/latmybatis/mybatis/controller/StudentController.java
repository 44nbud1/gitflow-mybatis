package com.latmybatis.mybatis.controller;

import com.latmybatis.mybatis.model.Student;
import com.latmybatis.mybatis.service.StudentService;
import com.latmybatis.mybatis.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @Autowired
    StudentService studentService;

    @PostMapping("/mybatis")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        Student student1 = new Student();
        student1.setIdStudent(student.getIdStudent());
        student1.setAlamat(student.getAlamat());
        student1.setNama(student.getNama());
        student1.setUmur(student.getUmur());
        return ResponseEntity.ok(student1);
    }
}
