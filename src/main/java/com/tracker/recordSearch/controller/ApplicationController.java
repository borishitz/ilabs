package com.tracker.recordSearch.controller;

import com.tracker.recordSearch.service.FlyerDetailsSer;
import com.tracker.recordSearch.service.StudentApplicationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class ApplicationController {

    @Autowired
    private StudentApplicationSer studentApplicationSer;

    @Autowired
    private FlyerDetailsSer flyerDetailsSer;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String mainHomePage(HttpServletRequest request) {

        Locale currentLocale= request.getLocale();
        String countryCode = currentLocale.getCountry();
        String countryName = currentLocale.getDisplayCountry();

        String langCode = currentLocale.getLanguage();
        String langName = currentLocale.getDisplayLanguage();

        System.out.println(countryCode + ": " + countryName );
        System.out.println(langCode + ": " + langName );

        System.out.println("=====================");
        String[] languages = Locale.getISOLanguages();

        for (String language : languages ) {
            Locale locale = new Locale(language);
            System.out.println(language + ": " + locale.getDisplayLanguage());
        }

        return "home";
    }

    @GetMapping("/logout")
    public String logout() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String homePage() {
        return "dashboard";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @GetMapping("/blog")
    public String blogPage() {
        return "blog";
    }

    @GetMapping("/blog/details")
    public String blogDetailsPage() {
        return "blog-details";
    }

    @GetMapping("/course")
    public String coursePage() {
        return "course";
    }

    @GetMapping("/course/details")
    public String courseDetailsPage() {
        return "courseDetails";
    }

    @GetMapping("/event")
    public String eventPage() {
        return "event";
    }

    @GetMapping("/event/details")
    public String eventDetailsPage() {
        return "event-details";
    }

    @GetMapping("/404")
    public String page404() {
        return "404-page";
    }

//    @GetMapping("/become/instructor")
//    public String becomeInstructor() {
//        return "become-instructor";
//    }


    @GetMapping("/faq/details")
    public String faqDetailsPage() {
        return "faq-details";
    }
    @GetMapping("/faq/page")
    public String faqPage() {
        return "faq-page";
    }

    @GetMapping("/instructor")
    public String instructorPage() {
        return "instructor";
    }

    @GetMapping("/instructor/profile")
    public String instructorProfilePage() {
        return "instructor-profile";
    }

    @GetMapping("/become/instructor")
    public String becomeInstructorPage() {
        return "become-instructor";
    }

    @GetMapping("/shop")
    public String shopPage() {
        return "shop";
    }

    @GetMapping("/shop/details")
    public String shopDetailsPage() {
        return "shop-details";
    }

    @GetMapping("/wishlist")
    public String wishlist() {
        return "wishlist";
    }

    @GetMapping("/contact-success")
    public String contactSentSuccess() {
        return "contact-sent-success";
    }

    @GetMapping("/flyer/details/success")
    public String flyerSentSuccess() {
        return "flyer-form";
    }

    @GetMapping("/student/application")
    public String studentApplication(){
        return "cart";
    }

    @GetMapping("/details/frontend")
    public String detailsFrontEnd() {
        return "details/frontend";
    }

    @GetMapping("/details/backend")
    public String detailsBackEnd() {
        return "details/backend";
    }

    @GetMapping("/details/sql")
    public String detailsSql() {
        return "details/sql";
    }

    @GetMapping("/details/software/testing")
    public String detailsSoftwareTesting() {
        return "details/softwareTesting";
    }

    @GetMapping("/details/aws")
    public String detailsAWS() {
        return "details/aws";
    }

    @GetMapping("/details/cyber/security")
    public String detailsCyberSecurity() {
        return "details/cyberSecurity";
    }

    @GetMapping("/details/linux")
    public String detailsLinux() {
        return "details/linux";
    }

    @GetMapping("/details/python")
    public String detailsPython() {
        return "details/python";
    }
}
