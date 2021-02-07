package com.work.Student.service;

import com.work.Student.entity.StudentModel;
import com.work.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentServiceBase {
    @Autowired
    private StudentRepository studentRepository;

    public void setStudentRepository(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }


    public List<StudentModel> retrieveStudent() {
        List<StudentModel> students = (List<StudentModel>) studentRepository.findAll();
        return students;
    }


    public StudentModel getStudent(Long StudentId) {
        Optional<StudentModel> student = studentRepository.findById(StudentId);
        return student.get();
    }


    public void saveStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }


    public void deleteStudent(Long StudentId) {
        studentRepository.deleteById(StudentId);
    }


    public void updateStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }
}
