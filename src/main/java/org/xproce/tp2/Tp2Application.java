package org.xproce.tp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.tp2.dao.entities.Course;
import org.xproce.tp2.dao.entities.Session;
import org.xproce.tp2.dao.entities.Student;
import org.xproce.tp2.dao.repositories.RepositoriesCourse;
import org.xproce.tp2.dao.repositories.RepositoriesSession;
import org.xproce.tp2.dao.repositories.RepositoriesStudent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication

public class Tp2Application implements CommandLineRunner {
    @Autowired
    private RepositoriesSession repositoriesSession;
    @Autowired
    private RepositoriesStudent repositoriesStudent;
    @Autowired
    private RepositoriesCourse repositoriesCourse;

    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
       List<Student> students = new ArrayList<>();
       Student student=new Student();
        student.setName("fati");
        student.setR_number("r123");
        students.add(student);
        repositoriesStudent.save(student);
        List<Session> sessions = new ArrayList<>();
        Session session = new Session();
        session.setDate(new Date());
        session.setH_debut(new Date());
        session.setH_fin(new Date());
        session.setStudents(students);

       repositoriesSession.save(session);
       List<Course>courses=new ArrayList<>();
       Course course =new Course();
       course.setDescription("IT");
       course.setTitle("JEE");
       repositoriesCourse.save(course);
    }

}