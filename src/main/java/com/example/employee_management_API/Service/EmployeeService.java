package com.example.employee_management_API.Service;

import com.example.employee_management_API.DTO.EmployeeDTO;
import com.example.employee_management_API.DTO.addNewEmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO createNewEmployee(addNewEmployeeDTO addNewEmployeeDto);
}
