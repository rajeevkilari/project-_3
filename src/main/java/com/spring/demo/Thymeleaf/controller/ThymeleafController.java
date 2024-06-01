package com.spring.demo.Thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThymeleafController {

    @GetMapping("/input")
    public String viewPage(Model theModel){
      theModel.addAttribute("time", java.time.LocalTime.now());
      return "DisplayForm";
    }

    @RequestMapping("/output")
    public String outputPage(){
        return "DisplayOutput";
    }

    @PostMapping("/outputVersionTwo")
    public String modifiedOutputpage(HttpServletRequest request, Model model){
        String civilianName = request.getParameter("Name");
        civilianName = civilianName.toUpperCase();
        model.addAttribute("modifiedName", civilianName);
       return "DisplayOutput";
    }

    @PostMapping("/outputVersionThree")
    public String remodifiedOutputPage(@RequestParam String Name, Model model){
        Name = Name.toUpperCase();
        model.addAttribute("modifiedName", Name);
        return "DisplayOutput";
    }
}
