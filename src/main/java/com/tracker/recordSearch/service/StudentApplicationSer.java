package com.tracker.recordSearch.service;

import com.tracker.recordSearch.domain.Contact;
import com.tracker.recordSearch.domain.StudentApplication;
import com.tracker.recordSearch.repository.StudentApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentApplicationSer {

    @Autowired
    private StudentApplicationRepo studentApplicationRepo;

    public StudentApplication saveStudentApplication(StudentApplication studentApplication){
       return studentApplicationRepo.save(studentApplication);
    }

    public List<StudentApplication> getStudentApply() {
        return (List<StudentApplication>) studentApplicationRepo.findAll();
    }
}
