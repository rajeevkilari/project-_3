package com.spring.demo.Thymeleaf.Student_Data;


import java.util.List;

public class Student {

    public String firstName;
    public String lastName;
    public String country;
    public String language;

    public List<String> operationSystem;

    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(List<String> operationSystem) {
        this.operationSystem = operationSystem;
    }
}
