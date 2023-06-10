package com.adekunle.spring_thymeleaf.controller;

import com.adekunle.spring_thymeleaf.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String bootstrap(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"Adekunle","Adegoke","adegokeadekunle2@gmail.com"));
        employees.add(new Employee(2L,"James","Toluwa","tj@gmail.com"));
        employees.add(new Employee(3L,"Abefe","Ade","ab@gmail.com"));
        employees.add(new Employee(4L,"Tolu","Adegoke","ta@gmail.com"));
        employees.add(new Employee(5L,"Adegoke","James","aj@gmail.com"));

        model.addAttribute("employees",employees);

        return "iteration";
    }
}
