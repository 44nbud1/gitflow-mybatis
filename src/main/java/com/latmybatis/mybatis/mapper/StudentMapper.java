package com.latmybatis.mybatis.mapper;

import com.latmybatis.mybatis.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper
{
    /*
        query to database
     */

    final String addStudent = "insert into student(id_student,nama,umur,alamat) values (#{idStudent},#{nama},#{umur},#{alamat})";
    final String showAllStudent = "SELECT * FROM student";
    final String showByIdStudent = "SELECT * FROM student WHERE id_student = #{idStudent}";

    /*

     */

    @Insert(addStudent)
    void addStudent(Student student);

    @Select(showAllStudent)
    List<Student> showAllStudent();
}
