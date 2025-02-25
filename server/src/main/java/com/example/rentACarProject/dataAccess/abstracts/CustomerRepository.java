package com.example.rentACarProject.dataAccess.abstracts;

import com.example.rentACarProject.entities.concrates.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
