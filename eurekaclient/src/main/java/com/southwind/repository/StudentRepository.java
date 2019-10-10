package com.southwind.repository;

import com.southwind.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 *
 *  @Author:jiaruiying
 *  @Date: 2019-09-28
 */
public interface StudentRepository {

    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}

