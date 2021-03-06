package com.sapient.vaccinationdrive.vaccination_drive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "EmployeeDetails")
public class EmployeeDetails {
    @Id
    private int id;
    private int number_of_dose;
}
