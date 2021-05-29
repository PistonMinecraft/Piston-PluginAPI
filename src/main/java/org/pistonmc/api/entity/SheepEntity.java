package org.pistonmc.api.entity;

import org.pistonmc.api.DyeColor;

public interface SheepEntity extends Entity {
    boolean isWooled();
    void setWooled(boolean wooled);
    DyeColor getColor();
    void setColor(DyeColor woolColor);
    boolean canShear();
}