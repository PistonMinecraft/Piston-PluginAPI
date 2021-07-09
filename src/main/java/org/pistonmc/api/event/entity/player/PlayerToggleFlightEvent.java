package org.pistonmc.api.event.entity.player;

import org.pistonmc.api.entity.player.PlayerEntity;

/**
 * TODO
 */
public class PlayerToggleFlightEvent extends PlayerEvent {
    public PlayerToggleFlightEvent(PlayerEntity triggerPlayer) {
        super(triggerPlayer);
    }
}