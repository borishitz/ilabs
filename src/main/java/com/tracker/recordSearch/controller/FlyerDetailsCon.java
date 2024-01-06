package com.tracker.recordSearch.controller;

import com.tracker.recordSearch.domain.FlyerDetails;
import com.tracker.recordSearch.dto.FlyerDetailsDTO;
import com.tracker.recordSearch.service.FlyerDetailsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FlyerDetailsCon {
    public static String  uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/assest/flyerDocs";

    @Autowired
    private FlyerDetailsSer flyerDetailsSer;

//    @GetMapping("/flyer/details/new")
//    public String newflyerDetails(Model model){
//        model.addAttribute("flyerDetailsDTO", new FlyerDetailsDTO());
//        return "flyer-form.html";
//    }

    @GetMapping("/checkout")
    public String checkoutPage(Model model) {
        FlyerDetailsDTO flyerDetails = new FlyerDetailsDTO();
        model.addAttribute("flyer_details", flyerDetails);
        return "checkout";
    }

    @PostMapping("/flyer/details/save")
    public String savePost(@ModelAttribute("FlyerDetailsDTO") FlyerDetailsDTO flyerDetailsDTO,
                           @RequestParam("uploadDoc") MultipartFile file,
                           @RequestParam("docName") String docName) throws IOException
    {
        FlyerDetails flyerDetails = new FlyerDetails();
        flyerDetails.setId(flyerDetailsDTO.getId());
        flyerDetails.setTopic(flyerDetailsDTO.getTopic());
        flyerDetails.setDetails(flyerDetailsDTO.getDetails());
        String documentUUID;

        if(!file.isEmpty()) {
            documentUUID = file.getOriginalFilename();
            Path fileNameAndPath = Paths.get(uploadDir, documentUUID);
            Files.write(fileNameAndPath, file.getBytes());
        } else {
            documentUUID = docName;
        }
        flyerDetails.setDocumentUpload(documentUUID);
        flyerDetailsSer.saveFlyerDetails(flyerDetails);
        return "redirect:/checkout";
    }
}
