package com.springCourse.hibernateAdvancedMappings;

import com.springCourse.hibernateAdvancedMappings.dao.AppDAO;
import com.springCourse.hibernateAdvancedMappings.entity.Instructor;
import com.springCourse.hibernateAdvancedMappings.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateAdvancedMappingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateAdvancedMappingsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
//            createInstructor(appDAO);
//            findInstructor(appDAO);
//            deleteInstructor(appDAO);
            findInstructorDetail(appDAO);
        };
    }

    private void findInstructorDetail(AppDAO appDAO) {
        int theId = 1;
        System.out.println("Finding instructor detail id: " + theId);
        InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);
        System.out.println("tempInstructorDetail: " + tempInstructorDetail);
        System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
    }

    private void deleteInstructor(AppDAO appDAO) {
        int theId = 2;
        appDAO.deleteInstructorById(theId);

    }

    private void findInstructor(AppDAO appDAO) {
        int theId = 2;
        System.out.println("Finding instructor id: " + theId);

        Instructor tempInstructor = appDAO.findInstructorById(theId);
        System.out.println("TempInstructor: " + tempInstructor);
        System.out.println("The associate instructor Detail only: " + tempInstructor.getInstructorDetail());
    }

    private void createInstructor(AppDAO appDAO) {
        // create the instructor
        Instructor tempInstructor = new Instructor("Arath", "Mitrao", "arath@luv2code.com");

        // create the instructor email
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Piano");

        // associate the object
        tempInstructor.setInstructorDetail(tempInstructorDetail);

        // save the instructor - this will also save the details object because of cascadeType.ALL
        System.out.println("Saving instructor: " + tempInstructor);
        appDAO.save(tempInstructor);

    }

}
