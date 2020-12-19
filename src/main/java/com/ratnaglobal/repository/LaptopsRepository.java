package com.ratnaglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ratnaglobal.model.Laptops;

@Repository
public interface LaptopsRepository extends JpaRepository<Laptops, Integer> {

}
