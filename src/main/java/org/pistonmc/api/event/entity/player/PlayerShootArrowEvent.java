package org.pistonmc.api.event.entity.player;

import org.pistonmc.api.entity.player.PlayerEntity;
import org.pistonmc.api.entity.projectile.ArrowEntity;

/**
 * 箭被射出
 */
public class PlayerShootArrowEvent extends PlayerEvent {
    private final ArrowEntity arrow;

    public PlayerShootArrowEvent(PlayerEntity player, ArrowEntity arrow) {
        super(player);
        this.arrow = arrow;
    }

    /**
     * 被射出的箭的实体
     * @return 射出的箭的实体
     */
    public ArrowEntity getArrow() {
        return arrow;
    }
}