package com.work.Student.service;

import com.work.Student.entity.StudentModel;

import java.util.List;

public interface StudentServiceBase {

    public List<StudentModel> retrieveStudent();

    public StudentModel getStudent(Long StudentId);

    public void saveStudent(StudentModel studentModel);

    public void deleteStudent(Long StudentId);

    public void updateStudent(StudentModel studentModel);
}
