package com.example.c2c.Controller;

import com.example.c2c.Dao.BuildingMesDao;
import com.example.c2c.Dao.BuildingMesDaoImpl;
import com.example.c2c.Dao.BuildingRepository;
import com.example.c2c.Dao.UserRepository;
import com.example.c2c.Dto.BuildingMessage;
import com.example.c2c.Entity.Building;
import com.example.c2c.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cherish 2018/7/5
 */
@RestController
public class BuildingMesController {

    private BuildingMessage buildingMessage = new BuildingMessage();

    @Autowired
    BuildingRepository buildingRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/BuildingMessage/{id}")
    public BuildingMessage getBuildingMes(@PathVariable("id") Integer id){
        Building building = buildingRepository.findById(id).orElse(null);
        if(null == building){
            return null;
        }
        else{
            User user = userRepository.findById(building.getUserId()).orElse(null);
            buildingMessage.setAddress(building.getAddress());
            buildingMessage.setNameOfLessor(user.getName());
            buildingMessage.setPhoneNum(user.getPhoneNum());
            return buildingMessage;
        }
    }
}
