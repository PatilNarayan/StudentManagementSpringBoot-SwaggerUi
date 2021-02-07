package com.work.Student.controller;

import com.work.Student.entity.StudentModel;
import com.work.Student.repository.StudentRepository;
import com.work.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/api/student")
    public List<StudentModel> getStudents() {
        List<StudentModel> students = studentService.retrieveStudent();
        return students;
    }

    @GetMapping("/api/student/{StudentId}")
    public StudentModel getStudent(@PathVariable(name="StudentId")Long StudentId) {
        return studentService.getStudent(StudentId);
    }

    @PostMapping("/api/student")
    public void saveStudent(StudentModel studentModel){
        studentService.saveStudent(studentModel);
        System.out.println("Student Saved Successfully");
    }

    @DeleteMapping("/api/student/{StudentId}")
    public void deleteStudent(@PathVariable(name="StudentId")Long StudentId){
        studentService.deleteStudent(StudentId);
        System.out.println("Student Deleted Successfully");
    }

    @PutMapping("/api/student/{StudentId}")
    public void updateStudent(@RequestBody StudentModel studentModel,
                               @PathVariable(name="StudentId")Long StudentId){
        StudentModel student = studentService.getStudent(StudentId);
        if(student != null){
            studentService.updateStudent(studentModel);
        }

    }

}
