package com.emplolyeeMangementSystem.controller;

import com.emplolyeeMangementSystem.entity.Shift;
import com.emplolyeeMangementSystem.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShiftController {

    @Autowired
    private ShiftService shiftService;

    @GetMapping("/shifts")
    public String showShifts(Model model) {
        model.addAttribute("shifts", shiftService.getAllShifts());
        return "shifts";
    }


    @PostMapping("/shifts")
    public String addShift(Shift shift) {
        shiftService.saveShift(shift);
        return "redirect:/shifts";
    }
}
