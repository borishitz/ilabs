package com.tracker.recordSearch.controller;

import com.tracker.recordSearch.domain.Course;
import com.tracker.recordSearch.service.CourseSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CourseCon {

    @Autowired
    private  CourseSer courseSer;

    @GetMapping("/courses/all")
    public String getAllStudents(Model model){
        List<Course> courseList = courseSer.getAllCourses();
//        courseList = keyword == null? courseSer.getAllCourses(): courseSer.findByKeyword(keyword);
        model.addAttribute("courseList",  courseList);
        return "course";
    }

    @PostMapping("/course/save")
    public String saveCourse(Course course) {
        courseSer.saveCourse(course);
        return "redirect:/courseS/all";
    }

}
