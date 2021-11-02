package com.ivanryabov.spring.springboot.spring_course_springboot.dao;




import com.ivanryabov.spring.springboot.spring_course_springboot.entity.Grade;

import java.util.List;

public interface GradeDAO {

    public List<Grade> getAllGrades();

    public void addGrade(Grade grade);

    public void updateGrade(Grade grade);

    public void deleteGrade(int id);
}
