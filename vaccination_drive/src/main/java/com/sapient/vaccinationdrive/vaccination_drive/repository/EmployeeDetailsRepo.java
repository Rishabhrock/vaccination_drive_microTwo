package com.sapient.vaccinationdrive.vaccination_drive.repository;

import com.sapient.vaccinationdrive.vaccination_drive.model.EmployeeDetails;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepo extends MongoRepository<EmployeeDetails,Integer> {

    public Optional<EmployeeDetails> findById(Integer id);
   

}
    

