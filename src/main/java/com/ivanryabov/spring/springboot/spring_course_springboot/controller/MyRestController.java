package com.ivanryabov.spring.springboot.spring_course_springboot.controller;


import com.ivanryabov.spring.springboot.spring_course_springboot.entity.Employee;
import com.ivanryabov.spring.springboot.spring_course_springboot.service.EmployeeService;
import com.ivanryabov.spring.springboot.spring_course_springboot.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private GradeService gradeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

//    @GetMapping("/employee/{employeeId}")
//    public Employee getEmployee(@PathVariable int employeeId){
//        Employee employee = employeeService.getEmployee(employeeId);
//
//
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee){
//
//        employeeService.addEmployee(employee);
//
//        return employee;
//    }
//
//    @PostMapping("/grades")
//    public Grade addNewGrade(@RequestBody Grade grade){
//
//        gradeService.addGrade(grade);
//
//        return grade;
//    }
//
//    @DeleteMapping("/employee/{id}")
//    public String deleteEmployee(@PathVariable int id){
//
//        employeeService.deleteEmployee(id);
//
//        return "Employee with ID = " + id + "was deleted";
//    }

}
