package org.pistonmc.api.event.entity.player;

import org.pistonmc.api.entity.player.PlayerEntity;

/**
 * TODO
 */
public class PlayerExpChangeEvent extends PlayerEvent {
    public PlayerExpChangeEvent(PlayerEntity triggerPlayer) {
        super(triggerPlayer);
    }
}