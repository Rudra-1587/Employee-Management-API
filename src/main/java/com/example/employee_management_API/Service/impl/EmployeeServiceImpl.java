package com.example.employee_management_API.Service.impl;

import com.example.employee_management_API.DTO.EmployeeDTO;
import com.example.employee_management_API.DTO.addNewEmployeeDTO;
import com.example.employee_management_API.Entity.Employee;
import com.example.employee_management_API.Repository.EmployeeRepository;
import com.example.employee_management_API.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee -> modelMapper.map(employee, EmployeeDTO.class)).toList();
    }

    @Override
    public EmployeeDTO createNewEmployee(addNewEmployeeDTO addNewEmployeeDto) {
        Employee employee = modelMapper.map(addNewEmployeeDto, Employee.class);
        Employee newEmployee = employeeRepository.save(employee);
        return modelMapper.map(newEmployee, EmployeeDTO.class);
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee =
                employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee does " +
                "not found by id: "+id));
        return modelMapper.map(employee, EmployeeDTO.class);
    }

}
