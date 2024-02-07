package com.example.H2Database.Controller;


import com.example.H2Database.Model.EmployeeModel;
import com.example.H2Database.Repository.EmployeeRepository;
import com.example.H2Database.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/find")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/all")

    public List<EmployeeModel> getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/byCity")
    public List<EmployeeModel> getAllEmployeeByCity(@RequestParam List<String> city) {
        return employeeService.getEmployeeByCity(city);
    }
}
