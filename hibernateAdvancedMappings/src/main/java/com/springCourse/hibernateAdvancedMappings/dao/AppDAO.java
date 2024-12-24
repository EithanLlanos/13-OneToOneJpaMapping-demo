package com.springCourse.hibernateAdvancedMappings.dao;

import com.springCourse.hibernateAdvancedMappings.entity.Instructor;
import com.springCourse.hibernateAdvancedMappings.entity.InstructorDetail;
import org.springframework.stereotype.Service;

@Service
public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
