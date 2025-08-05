package com.example.Course_Registration_.Project.Repository;

import com.example.Course_Registration_.Project.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,String> {
}

