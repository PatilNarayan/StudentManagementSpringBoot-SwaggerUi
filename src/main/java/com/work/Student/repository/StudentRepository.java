package com.work.Student.repository;

import com.work.Student.entity.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentModel,Long> {
}
