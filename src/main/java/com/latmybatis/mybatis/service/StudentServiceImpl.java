package com.latmybatis.mybatis.service;

import com.latmybatis.mybatis.mapper.StudentMapper;
import com.latmybatis.mybatis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    StudentMapper studentMapper;

    @Override
    public void addStudent(Student student)
    {
        studentMapper.addStudent(student);
    }
}
