package com.dan.demo_crud.controller;

import com.dan.demo_crud.model.Student;
import com.dan.demo_crud.service.IManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IManager<Student> studentService;
    @GetMapping("/home")
    public ModelAndView showHome() {
        List<Student> list = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView showFormAdd() {
        ModelAndView modelAndView = new ModelAndView("add");
        Student student = new Student();
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/student/home";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id) {
        Student student = studentService.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/student/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        studentService.delete(id);
        return "redirect:/student/home";
    }

//    @GetMapping("/search")
//    public ModelAndView showSearch(@RequestParam String name) {
//        List<Student> students = studentIManager.searchByName(name);
//        ModelAndView modelAndView = new ModelAndView("home");
//        modelAndView.addObject("list" ,students);
//        return modelAndView;
//    }
}
