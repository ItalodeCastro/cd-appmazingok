package com.campusdual.appmazing.model.dao;

import com.campusdual.appmazing.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}