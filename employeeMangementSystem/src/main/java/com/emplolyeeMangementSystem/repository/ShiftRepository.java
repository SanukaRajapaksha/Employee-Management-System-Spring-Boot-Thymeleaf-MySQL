package com.emplolyeeMangementSystem.repository;

import com.emplolyeeMangementSystem.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift, Long> {
}