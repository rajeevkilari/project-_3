package com.spring.demo.Thymeleaf.customer_info;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/Form")
    public String display(Model theModel){
        theModel.addAttribute("customer", new CustomerEntity());
        return "DisplayCustomerForm";
    }

    @PostMapping("/Confirmation")
    public String process(@Valid @ModelAttribute("customer") CustomerEntity theCustomer, BindingResult theBindingResult){
        if(theBindingResult.hasErrors()){
            return "DisplayCustomerForm";
        }else{
            return "CustomerConfirmation";
        }
    }

}
