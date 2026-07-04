package com.example.employee_management_API.Controller;

import com.example.employee_management_API.DTO.EmployeeDTO;
import com.example.employee_management_API.DTO.addNewEmployeeDTO;
import com.example.employee_management_API.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeDTO> addNewEmployee(@RequestBody addNewEmployeeDTO addNewEmployeeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createNewEmployee(addNewEmployeeDto));
    }
}
