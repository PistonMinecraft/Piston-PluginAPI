package org.pistonmc.api.entity;

import org.pistonmc.api.entity.player.PlayerEntity;

public interface ExpEntity extends Entity {
    PlayerEntity getTargetPlayer();
    double getExpCount();
}