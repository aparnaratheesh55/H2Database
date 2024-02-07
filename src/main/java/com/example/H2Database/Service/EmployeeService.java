package com.example.H2Database.Service;

import com.example.H2Database.Model.EmployeeModel;
import com.example.H2Database.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;


    public List<EmployeeModel> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public List<EmployeeModel> getEmployeeByCity(List<String> city) {
        return employeeRepository.findByCityIn(city);

    }

}
