package com.adekunle.spring_thymeleaf.controller;

import com.adekunle.spring_thymeleaf.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/if-unless")
    public String users(Model model) {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Adekunle", "adegokeadekunle2@gmail.com", "ADMIN"));
        users.add(new User(2L, "James", "tj@gmail.com", "MANAGER"));
        users.add(new User(3L, "Abefe", "ab@gmail.com", "USER"));
        users.add(new User(4L, "Tolu", "ta@gmail.com", "USER"));
        users.add(new User(5L, "Adegoke", "aj@gmail.com", "ADMIN"));

        model.addAttribute("users", users);
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User user = new User(1L, "Adekunle", "adegokeadekunle2@gmail.com", "ADMIN");
        model.addAttribute("user", user);
        return "/switch-case";
    }

}
