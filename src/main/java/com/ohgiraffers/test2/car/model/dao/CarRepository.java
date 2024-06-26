package com.ohgiraffers.test2.car.model.dao;

import com.ohgiraffers.test2.car.entity.Car;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {



}
