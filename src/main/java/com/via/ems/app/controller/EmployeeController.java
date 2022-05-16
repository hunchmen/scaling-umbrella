/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.ems.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.via.ems.app.model.Employee;
import com.via.ems.app.repository.EmployeeRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * 
 * @author 63999
 * 
 * 
 *         May 16, 2022
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // api to get all employees
    @GetMapping("/employees")
    @ApiOperation(value = "Get all employees")
    @ApiResponses({@ApiResponse(code = 404,
            message = "API Get all employees not found")})
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
