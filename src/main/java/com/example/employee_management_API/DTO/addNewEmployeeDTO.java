package com.example.employee_management_API.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class addNewEmployeeDTO {

    private String firstName;
    private String lastName;
    private String email;
    private Double salary;

}
