package com.sapient.vaccinationdrive.vaccination_drive.service;

import com.sapient.vaccinationdrive.vaccination_drive.model.EmployeeDetails;
import java.util.List;

public interface IEmployeeService {
    

    List<EmployeeDetails> getAllEmployee();
    Object getEmployeeById(int id);
    EmployeeDetails addEmployee(EmployeeDetails emp);
    boolean deleteEmployee(int id);
    boolean updateEmployee(EmployeeDetails emp,int id);
    List<EmployeeDetails> getSingleDoseEmployeeDetails();
    List<EmployeeDetails> getDoubleDoseEmployeeDetails();

    
}
