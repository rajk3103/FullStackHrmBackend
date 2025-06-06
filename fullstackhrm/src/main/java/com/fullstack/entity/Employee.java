package com.fullstack.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empID;

    @Size(min=2, message = "Name should be atleast 2 character")
    private String empName;

    @NotNull(message = "Employee address must be Not Null")
    private String empAddress;

    @Range(min = 1000000000, max = 9999999999L, message = "Employee contact Number should be 10 digit")
    private long empContactNumber;

    private Double empSalary;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Kolkata")
    private Date empDOB;

    @Email(message = "Email must be Valid")
    private String empEmailId;

    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%^&+=!]).{6,}$",
            message = "Password must contain at least one uppercase letter, one lowercase letter, one special character, and be at least 6 characters long"
    )
    private String empPassword;

}
