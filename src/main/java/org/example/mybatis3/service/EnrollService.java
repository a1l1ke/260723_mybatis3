package org.example.mybatis3.service;

import lombok.RequiredArgsConstructor;
import org.example.mybatis3.entity.Course;
import org.example.mybatis3.entity.Student;
import org.example.mybatis3.mapper.EnrollMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnrollService {
    private final EnrollMapper enrollMapper;

    public void createStudent(Student student) {
        enrollMapper.insertStudent(student);
    }

    public void createCourse(Course course) {
        enrollMapper.insertCourse(course);
    }

    public void findAllStudents() {
        enrollMapper.findAllStudents();
    }

    public void findAllCourses() {
        enrollMapper.findAllCourses();
    }
}
