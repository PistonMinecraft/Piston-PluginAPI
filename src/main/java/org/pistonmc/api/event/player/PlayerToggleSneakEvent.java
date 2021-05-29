package org.pistonmc.api.event.player;

import org.pistonmc.api.entity.player.PlayerEntity;

/**
 * TODO
 */
public class PlayerToggleSneakEvent extends PlayerEvent {
    public PlayerToggleSneakEvent(PlayerEntity triggerPlayer) {
        super(triggerPlayer);
    }
}