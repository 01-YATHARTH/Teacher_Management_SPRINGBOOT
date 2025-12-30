package com.example.teachermanagement.controller;

import com.example.teachermanagement.entity.Teacher;
import com.example.teachermanagement.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    // =========================
    // UI (Thymeleaf) ENDPOINTS
    // =========================

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("teachers", service.getAllTeachers());
        model.addAttribute("teacher", new Teacher());
        return "index";
    }

    @PostMapping("/save")
    public String saveFromUI(@ModelAttribute Teacher teacher) {
        service.saveTeacher(teacher);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteFromUI(@PathVariable Long id) {
        service.deleteTeacher(id);
        return "redirect:/";
    }

    // =========================
    // REST (POSTMAN) ENDPOINTS
    // =========================

    @GetMapping("/api/teachers")
    @ResponseBody
    public List<Teacher> getAllTeachersApi() {
        return service.getAllTeachers();
    }

    @GetMapping("/api/teachers/{id}")
    @ResponseBody
    public Teacher getTeacherByIdApi(@PathVariable Long id) {
        return service.getTeacherById(id);
    }

    @PostMapping("/api/teachers")
    @ResponseBody
    public Teacher addTeacherApi(@RequestBody Teacher teacher) {
        service.saveTeacher(teacher);
        return teacher;
    }

    @PutMapping("/api/teachers/{id}")
    @ResponseBody
    public Teacher updateTeacherApi(@PathVariable Long id,
                                    @RequestBody Teacher teacher) {
        teacher.setId(id);
        service.saveTeacher(teacher);
        return teacher;
    }

    @DeleteMapping("/api/teachers/{id}")
    @ResponseBody
    public String deleteTeacherApi(@PathVariable Long id) {
        service.deleteTeacher(id);
        return "Teacher deleted successfully";
    }
}
