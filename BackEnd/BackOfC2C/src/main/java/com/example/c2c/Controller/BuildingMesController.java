package com.example.c2c.Controller;

import com.example.c2c.Dao.BuildingRepository;
import com.example.c2c.Entity.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingMesController {
    @Autowired
    private BuildingRepository buildingRepository;

    @GetMapping(value = "/BuildingMessage/{id}")
    public Building getBuildingMes(@PathVariable("id") Integer id){
        return buildingRepository.findById(id).orElse(null);
    }
}
