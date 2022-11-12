package com.example.service;

import java.util.List;

import com.example.entity.Department;



//Interface
public interface DepartmentService {

 // Save operation
 Department saveDepartment(Department department);

 // Read operation
    List<Department> fetchDepartmentList();
  // java.util.List<Department> fetDepartmentsList();
 // Update operation
 Department updateDepartment(Department department,
                             Long departmentId);

 // Delete operation
 void deleteDepartmentById(Long departmentId);
}
