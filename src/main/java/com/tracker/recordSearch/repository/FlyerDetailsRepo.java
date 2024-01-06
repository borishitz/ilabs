package com.tracker.recordSearch.repository;

import com.tracker.recordSearch.domain.FlyerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlyerDetailsRepo extends JpaRepository<FlyerDetails,Long> {
}
