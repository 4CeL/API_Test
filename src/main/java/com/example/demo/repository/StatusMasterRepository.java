package com.example.demo.repository;

import com.example.demo.entity.StatusMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusMasterRepository extends JpaRepository<StatusMaster, Integer> {
}