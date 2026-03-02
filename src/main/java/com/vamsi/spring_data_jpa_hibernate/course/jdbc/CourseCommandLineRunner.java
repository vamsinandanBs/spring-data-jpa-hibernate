package com.vamsi.spring_data_jpa_hibernate.course.jdbc;

import com.vamsi.spring_data_jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS","Vamsi"));
//        repository.insert(new Course(2, "Learn AWS2","Vamsi2"));
//        repository.insert(new Course(3, "Learn AWS3","Vamsi3"));
//        repository.insert(new Course(4, "Learn AWS4","Vamsi4"));
//        repository.delete(2);
//        System.out.println( repository.Select(3));
//        System.out.println( repository.Select(4));
    }
}
