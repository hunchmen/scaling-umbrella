/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.via.ems.model.Employee;

/**
 * 
 * 
 * @author 63999
 * 
 * 
 * May 16, 2022
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
