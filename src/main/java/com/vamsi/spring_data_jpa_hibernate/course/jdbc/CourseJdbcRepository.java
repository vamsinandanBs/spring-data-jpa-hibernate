package com.vamsi.spring_data_jpa_hibernate.course.jdbc;

import com.vamsi.spring_data_jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

   @Autowired
   private JdbcTemplate springJdbcTemplate;

   private static String Insert_Query=
           """
                   insert into course (id, name, author)
                   values(?,?,?);
                   
           """;
   private static String Delete=
           """
                   delete from course where id=?;
                   
           """;
   private static String Select_Query=
           """
                   select * from course where id=?;
                   
           """;

   public void insert(Course course) {

      springJdbcTemplate.update(Insert_Query, course.getId(), course.getName(), course.getAuthor());
   }

   public void delete(int id) {

      springJdbcTemplate.update(Delete, id);
   }

   public Course Select(int id) {

      return springJdbcTemplate.queryForObject(Select_Query,
              new BeanPropertyRowMapper<>(Course.class),id);
   }
}