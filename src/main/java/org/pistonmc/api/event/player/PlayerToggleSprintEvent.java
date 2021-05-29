package org.pistonmc.api.event.player;

import org.pistonmc.api.entity.player.PlayerEntity;

/**
 * TODO
 */
public class PlayerToggleSprintEvent extends PlayerEvent {
    public PlayerToggleSprintEvent(PlayerEntity triggerPlayer) {
        super(triggerPlayer);
    }
}