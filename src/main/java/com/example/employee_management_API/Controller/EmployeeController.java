package com.example.employee_management_API.Controller;

import com.example.employee_management_API.DTO.EmployeeDTO;
import com.example.employee_management_API.DTO.addNewEmployeeDTO;
import com.example.employee_management_API.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> addNewEmployee(@RequestBody addNewEmployeeDTO addNewEmployeeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createNewEmployee(addNewEmployeeDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id, @RequestBody addNewEmployeeDTO dto){
        return ResponseEntity.ok(employeeService.updateEmployee(id, dto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updatePartialEmployee(@PathVariable Long id,
                                                             @RequestBody Map<String, Object> data){
        return ResponseEntity.ok(employeeService.updatePartialEmployee(id, data));
    }

}
