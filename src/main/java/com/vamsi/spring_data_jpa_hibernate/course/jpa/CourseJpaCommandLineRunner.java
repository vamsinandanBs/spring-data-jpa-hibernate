package com.vamsi.spring_data_jpa_hibernate.course.jpa;

import com.vamsi.spring_data_jpa_hibernate.course.Course;
import com.vamsi.spring_data_jpa_hibernate.course.SpringDataJpa.CourseSpringDataJpaRepository;
import com.vamsi.spring_data_jpa_hibernate.course.jpa.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJPARepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS","Vamsi"));
        repository.save(new Course(2, "Learn AWS2","Vamsi2"));
        repository.save(new Course(3, "Learn AWS3","Vamsi3"));
        repository.save(new Course(4, "Learn AWS4","Vamsi4"));
        repository.deleteById(2l);
        System.out.println( repository.findById(3l));
        System.out.println( repository.findById(4l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Vamsi3"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn AWS3"));
        System.out.println(repository.findByName("Learn DevOps Jpa!"));
    }
}
