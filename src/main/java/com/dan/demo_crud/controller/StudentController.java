package com.dan.demo_crud.controller;

import com.dan.demo_crud.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/student")
public class StudentController {
    @GetMapping("/home")
    public ModelAndView showHome() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Dân", 14));
        list.add(new Student(2, "Linh", 18));
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView showAdd() {
        ModelAndView modelAndView = new ModelAndView("add");
        Student student = new Student();
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/add")

}
