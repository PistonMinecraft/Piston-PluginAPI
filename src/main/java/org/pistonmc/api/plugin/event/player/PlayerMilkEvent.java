package org.pistonmc.api.plugin.event.player;

import org.pistonmc.api.plugin.entity.Entity;
import org.pistonmc.api.plugin.entity.player.PlayerEntity;

/**
 *  Cow/Mushroom 被挤奶的事件
 */
public class PlayerMilkEvent extends PlayerEvent {
    private final Entity target;
    private boolean cancelled;
    public PlayerMilkEvent(PlayerEntity player, Entity target) {
        super(player);
        this.target = target;
    }

    /**
     * 返回被挤奶的Cow/Mushroom实体
     * @return  被挤奶的Cow/Mushroom实体
     */
    public Entity getTarget() {
        return target;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}