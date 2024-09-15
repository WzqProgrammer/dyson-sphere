package com.interstellar.entity;

import lombok.Data;

/**
 * Description: 坐标
 *
 * @author w
 * @version 1.0
 * @date 2024/9/15 22:44
 */
@Data
public class Coordinate {

    private double x; // X坐标
    private double y; // Y坐标
    private double z; // Z坐标

    public Coordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
