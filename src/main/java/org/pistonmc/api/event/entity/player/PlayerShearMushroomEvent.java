package org.pistonmc.api.event.entity.player;

import org.pistonmc.api.entity.MushroomEntity;
import org.pistonmc.api.entity.player.PlayerEntity;

public class PlayerShearMushroomEvent extends PlayerEvent {
    private MushroomEntity target;
    private boolean cancelled;

    public PlayerShearMushroomEvent(MushroomEntity target, PlayerEntity player) {
        super(player);
        this.target = target;
    }
    /**
     * 获取 将要被剪掉蘑菇的Mushroom实体
     * @return 将要被剪掉蘑菇的Mushroom实体
     */
    public MushroomEntity getMushroom() {
        return target;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}