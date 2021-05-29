package org.pistonmc.api.event.player;

import net.minecraftforge.eventbus.api.Event;
import org.pistonmc.api.entity.player.PlayerEntity;

public abstract class PlayerEvent extends Event {
    private final PlayerEntity player;

    public PlayerEvent(PlayerEntity player) {
        super();
        this.player = player;
    }

    /**
     * 返回触发该事件的玩家实体
     * @return 触发该事件的玩家实体
     */
    public PlayerEntity getPlayer() {
        return player;
    }
}