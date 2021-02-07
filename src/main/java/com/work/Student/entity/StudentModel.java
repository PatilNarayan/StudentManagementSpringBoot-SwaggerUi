package com.work.Student.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Student")
public class StudentModel {
    @Id
    private Long StudentId;
    private String StudentName;
}
