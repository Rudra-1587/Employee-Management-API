package com.example.employee_management_API.Service;

import com.example.employee_management_API.DTO.EmployeeDTO;
import com.example.employee_management_API.DTO.addNewEmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface EmployeeService {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO createNewEmployee(addNewEmployeeDTO addNewEmployeeDto);

    EmployeeDTO getEmployeeById(Long id);

    EmployeeDTO updateEmployee(Long id, addNewEmployeeDTO dto);

    EmployeeDTO updatePartialEmployee(Long id, Map<String, Object> data);
}
