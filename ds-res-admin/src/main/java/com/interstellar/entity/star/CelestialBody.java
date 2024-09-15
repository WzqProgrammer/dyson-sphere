package com.interstellar.entity.star;

import com.interstellar.entity.Coordinate;
import com.interstellar.enums.CelestialBodyTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 天体
 */
@Data
@AllArgsConstructor
public class CelestialBody {

    /**
     * 天体编码，唯一标识
     */
    private String bodyUniqueCode;

    /**
     * 天体名称
     */
    private String name;

    /**
     * 天体类型
     */
    private CelestialBodyTypeEnum celestialBodyType;

    /**
     * 三维坐标，x轴
     */
    private Coordinate coordinate;
}
