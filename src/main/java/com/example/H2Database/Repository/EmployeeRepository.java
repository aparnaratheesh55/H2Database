package com.example.H2Database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.H2Database.Model.EmployeeModel;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<EmployeeModel, String> {
    List<EmployeeModel> findByCityIn(List<String> city);
}
