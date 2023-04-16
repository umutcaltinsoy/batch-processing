package com.altinsoy.spring.batch.repository;

import com.altinsoy.spring.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
