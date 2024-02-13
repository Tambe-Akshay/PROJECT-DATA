package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
	// List<Area> findByCityId(int city_id);
}
