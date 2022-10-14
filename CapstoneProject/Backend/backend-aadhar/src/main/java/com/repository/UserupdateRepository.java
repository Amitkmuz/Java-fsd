package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Userupdate;

@Repository
public interface UserupdateRepository extends JpaRepository<Userupdate,Integer>{

}
