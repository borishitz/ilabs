package com.tracker.recordSearch.repository;

import com.tracker.recordSearch.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
