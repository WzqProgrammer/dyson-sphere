package com.interstellar.enums;

import lombok.Getter;

@Getter
public enum CelestialBodyTypeEnum {

    UN_KNOW(0, "未知"),
    STAR(1, "恒星"),
    GIANT(2, "巨星"),
    GAS_GIANT(3, "巨行星"),
    STELLAR_REMNANT(4, "恒星残骸"),
    TERRESTRIAL_PLANET(5, "岩质行星");

    private final Integer code;

    private final String desc;

    CelestialBodyTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static CelestialBodyTypeEnum getEnumByCode(Integer code) {
        for (CelestialBodyTypeEnum e : CelestialBodyTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }
}
