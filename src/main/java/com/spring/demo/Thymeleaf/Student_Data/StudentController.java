package com.spring.demo.Thymeleaf.Student_Data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/displayForm")
    public String studentForm(Model theModel){
        theModel.addAttribute("student", new Student());
        return "DisplayStudentForm";
    }

    @PostMapping("/processData")
    public String studentConfirmation(@ModelAttribute("student") Student theStudent){
        System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName() +
                " " + theStudent.getCountry() + " " + theStudent.getLanguage());
        return "ConfirmationData";
    }
}
