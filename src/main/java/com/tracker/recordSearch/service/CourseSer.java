package com.tracker.recordSearch.service;

import com.tracker.recordSearch.domain.Course;
import com.tracker.recordSearch.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseSer {
    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }


}
