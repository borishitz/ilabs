package com.tracker.recordSearch.service;

import com.tracker.recordSearch.domain.Contact;
import com.tracker.recordSearch.domain.FlyerDetails;
import com.tracker.recordSearch.repository.FlyerDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlyerDetailsSer {
    @Autowired
    private FlyerDetailsRepo flyerDetailsRepo;

    public FlyerDetails saveFlyerDetails(FlyerDetails flyerDetails){
        return flyerDetailsRepo.save(flyerDetails);
    }
}
