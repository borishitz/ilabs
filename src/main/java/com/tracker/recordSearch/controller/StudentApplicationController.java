package com.tracker.recordSearch.controller;

import com.tracker.recordSearch.domain.StudentApplication;
import com.tracker.recordSearch.service.StudentApplicationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentApplicationController {

    @Autowired
    private StudentApplicationSer studentApplicationSer;

    @GetMapping("/student/applications")
    public String studentApplications(Model model){
        List<StudentApplication> studentApplications = studentApplicationSer.getStudentApply();
        model.addAttribute("studentApplications", studentApplications);
        return "dashboard/student-apply";
    }

    @GetMapping("/application")
    public String cartPage(Model model) {
        StudentApplication studentApplication = new StudentApplication();
        model.addAttribute("studentApply", studentApplication);
        return "cart";
    }

    @PostMapping("/student/application/save")
    public String saveStudentApplication(StudentApplication studentApplication){
        studentApplicationSer.saveStudentApplication(studentApplication);
        return "redirect:/application";
    }
}
