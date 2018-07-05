package com.example.c2c.Dao;

/**
 * Cherish 2018/7/5
 */
import com.example.c2c.Dto.BuildingMessage;
import com.example.c2c.Entity.Building;
import com.example.c2c.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class BuildingMesDaoImpl implements BuildingMesDao{
    private Building building = new Building();
    private User user = new User();
    private BuildingMessage buildingMessage = new BuildingMessage();

    @Autowired
    private BuildingRepository buildingRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public BuildingMessage getBuildingMesById(Integer id) {

        building = buildingRepository.findById(id).orElse(null);
        if(null == building){
            return null;
        }
        else{
            user = userRepository.findById(building.getUserId()).orElse(null);
            buildingMessage.setAddress(building.getAddress());
            buildingMessage.setNameOfLessor(user != null ? user.getName() : null);
            buildingMessage.setPhoneNum(user != null ? user.getPhoneNum() : null);
            return buildingMessage;
        }
    }
}
