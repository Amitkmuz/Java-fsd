package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Aadhar;

@Repository
public interface AadharRepository extends JpaRepository<Aadhar, Integer> {

}
