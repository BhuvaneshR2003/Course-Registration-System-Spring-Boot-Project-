package com.example.Course_Registration_.Project.Controller;

import com.example.Course_Registration_.Project.Model.Course;
import com.example.Course_Registration_.Project.Model.CourseRegistry;
import com.example.Course_Registration_.Project.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5500" , "http://127.0.0.1:5500"})
public class CourseController {

    @Autowired
    CourseService courseservice;

    @GetMapping("course")
    public List<Course> availableCourses(){
        return courseservice.availableCourse();
    }

    @GetMapping("course/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseservice.enrolledStudents();
    }

    @PostMapping("course/registration")
    public String studentsRegistration(@RequestParam("name") String name,
                                     @RequestParam("email") String email,
                                     @RequestParam("courseName") String courseName){
        courseservice.studentsRegistration(name,email,courseName);
        return "Congratulation! " +name+ " you are enrolled for"+courseName;
    }

}
