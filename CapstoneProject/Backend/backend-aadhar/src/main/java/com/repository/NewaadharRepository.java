package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Newaadhar;

@Repository
public interface NewaadharRepository extends JpaRepository<Newaadhar, Integer>{

}
