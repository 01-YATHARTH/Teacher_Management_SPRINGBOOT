package com.example.teachermanagement.service;

import com.example.teachermanagement.entity.Teacher;
import com.example.teachermanagement.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository repo;

    public TeacherService(TeacherRepository repo) {
        this.repo = repo;
    }

    public List<Teacher> getAllTeachers() {
        return repo.findAll();
    }

    public void saveTeacher(Teacher teacher) {
        repo.save(teacher);
    }

    public void deleteTeacher(Long id) {
        repo.deleteById(id);
    }

    public Teacher getTeacherById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
