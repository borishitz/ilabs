package com.tracker.recordSearch.controller;

import com.tracker.recordSearch.domain.User;
import com.tracker.recordSearch.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    public static String  uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/userImages";
    @Autowired
    public UserSer userSer;

        @GetMapping("/user/register")
        public String registerNewUser(Model trans){
            User newUser = new User();
            trans.addAttribute("newUser", newUser);
            return "userRegistration";
        }

        @PostMapping("/user/registration")
        public String showUserRegistrationPage(User user) {
            userSer.saveUser(user);
            return "redirect:/login";
        }

}
