package com.springCourse.hibernateAdvancedMappings.dao;

import com.springCourse.hibernateAdvancedMappings.entity.Instructor;
import org.springframework.stereotype.Service;

@Service
public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);
}
