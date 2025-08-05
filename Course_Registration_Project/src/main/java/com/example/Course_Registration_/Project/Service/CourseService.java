package com.example.Course_Registration_.Project.Service;

import com.example.Course_Registration_.Project.Model.Course;
import com.example.Course_Registration_.Project.Model.CourseRegistry;
import com.example.Course_Registration_.Project.Repository.CourseRegistryRepo;
import com.example.Course_Registration_.Project.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courserepository;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourse() {
        return courserepository.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void studentsRegistration(String name, String email, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,email,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
