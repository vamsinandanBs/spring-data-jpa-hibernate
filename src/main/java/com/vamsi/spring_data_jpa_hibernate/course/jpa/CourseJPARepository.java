package com.vamsi.spring_data_jpa_hibernate.course.jpa;

import com.vamsi.spring_data_jpa_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {

    //@Autowired instead
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
   }

    public Course Select(long id) {

        return entityManager.find(Course.class,id);
    }

    public void delete(long id) {
    Course course = entityManager.find(Course.class,id);
    entityManager.remove(course);
    }

}
