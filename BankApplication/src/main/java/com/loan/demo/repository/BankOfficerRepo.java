package com.loan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.demo.entity.BankOfficer;

@Repository
public interface BankOfficerRepo extends JpaRepository<BankOfficer, Long> {

}
