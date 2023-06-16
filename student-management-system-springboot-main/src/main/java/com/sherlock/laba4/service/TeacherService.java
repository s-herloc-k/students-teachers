package com.sherlock.laba4.service;

import com.sherlock.laba4.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);

    Teacher updateTeacher(Teacher student);

    void deleteTeacherById(Long id);
}
