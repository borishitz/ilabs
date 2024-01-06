package com.tracker.recordSearch.repository;

import com.tracker.recordSearch.domain.StudentApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentApplicationRepo extends JpaRepository<StudentApplication,Long> {
}
