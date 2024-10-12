package com.emplolyeeMangementSystem.service;

import com.emplolyeeMangementSystem.entity.Shift;
import com.emplolyeeMangementSystem.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftService {
    @Autowired
    private ShiftRepository shiftRepository;

    public List<Shift> getAllShifts() {
        return shiftRepository.findAll();
    }

    public void saveShift(Shift shift) {
        shiftRepository.save(shift);
    }
}
