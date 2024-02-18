package com.naveed.petstoreapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

class Student{
    private int id;
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;
}

@RestController
public class demoController {
    @ResponseBody
    @RequestMapping("/name")
    public String getName(){
        return "it vadant";
    }

    @RequestMapping("/student")
    public Student getStudent(){
        Student s = new Student();
        s.setId(1);
        s.setName("neha");
        s.setAge(9);
        return s;
    }


    @RequestMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("neha");
        s1.setAge(9);
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("rahul");
        s2.setAge(11);
        students.add(s1);
        students.add(s2);
        return students;
    }


    @RequestMapping("/marks")
    public double getmarks(){
        return 78.13;
    }
    
}
