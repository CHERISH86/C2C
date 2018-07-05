package com.example.c2c.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Cherish 2018/7/5
 */
@Entity
public class Building {
    @Id
    @GeneratedValue
    private Integer buildingId;
    private Integer buildingStatuesId;
    private Integer userId;
    private Integer typeId;
    private String address;
    private Float area;
    private Float price;

    public Building() {
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public Integer getBuildingStatuesId() {
        return buildingStatuesId;
    }

    public void setBuildingStatuesId(Integer buildingStatuesId) {
        this.buildingStatuesId = buildingStatuesId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
