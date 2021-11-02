package com.ivanryabov.spring.springboot.spring_course_springboot.dao;


import com.ivanryabov.spring.springboot.spring_course_springboot.entity.Grade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GradeDAOImpl implements GradeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Grade> getAllGrades() {
        return null;
    }

    @Override
    public void addGrade(Grade grade) {

    }

    @Override
    public void updateGrade(Grade grade) {

    }

    @Override
    public void deleteGrade(int id) {

    }
//    @Override
//    public List<Grade> getAllGrades() {
//        Session session = sessionFactory.getCurrentSession();
//
//        List<Grade> grades = session.createQuery("FROM Grade",Grade.class).getResultList();
//
//        return grades;
//    }

//    @Override
//    public void addGrade(Grade grade) {
//        Session session = sessionFactory.getCurrentSession();
//
//        session.saveOrUpdate(grade);
//    }
//
//    @Override
//    public void updateGrade(Grade grade) {
//
//    }
//
//    @Override
//    public void deleteGrade(int id) {
//
//    }
}
