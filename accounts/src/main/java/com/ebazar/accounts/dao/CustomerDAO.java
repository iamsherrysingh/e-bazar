package com.ebazar.accounts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebazar.accounts.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, String> {

}
