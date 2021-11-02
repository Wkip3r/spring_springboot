package com.ivanryabov.spring.springboot.spring_course_springboot.dao;


import com.ivanryabov.spring.springboot.spring_course_springboot.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);

        List<Employee> allEmployees = session.createQuery("FROM Employee", Employee.class)
                                            .getResultList();
        return allEmployees;
    }

//    @Override
//    public void addEmployee(Employee employee) {
//        Session session = sessionFactory.getCurrentSession();
//
//        if(employee.getId() == 0){
//            session.save(employee);
//        } else {
//            session.update(employee);
//        }
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//
//        Employee employee = session.get(Employee.class,id);
//
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//
//        Employee employee = session.get(Employee.class,id);
//
//        session.delete(employee);
//    }
}
