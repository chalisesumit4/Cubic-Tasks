package com.cubic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    //EmployeeList
    List<Employee> empList = new ArrayList<>();

    //addEmployee
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        empList.add(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    //getAllEmployee
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(empList, HttpStatus.OK);
    }

    //filter -> Male
    @RequestMapping(value = "/getMaleEmp", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> maleEmp(){
        List<Employee> maleList = new ArrayList<>();
        for (Employee emp:
            empList ) {
            if (emp.gender.equalsIgnoreCase("male")){
                maleList.add(emp);
            }
        }
        return new ResponseEntity<>(maleList, HttpStatus.OK);
    }

    //filter -> Female
    @RequestMapping(value = "/getFemaleEmp", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> femaleEmp(){
        List<Employee> femaleList = new ArrayList<>();
        for (Employee emp:
                empList ) {
            if (emp.gender.equalsIgnoreCase("female")){
                femaleList.add(emp);
            }
        }
        return new ResponseEntity<>(femaleList, HttpStatus.OK);
    }
}
