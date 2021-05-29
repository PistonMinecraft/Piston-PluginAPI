package org.pistonmc.api.event.player;

import org.pistonmc.api.entity.SheepEntity;
import org.pistonmc.api.entity.player.PlayerEntity;

public class PlayerShearWoolEvent extends PlayerEvent {
    private final SheepEntity target;
    private boolean cancelled;

    public PlayerShearWoolEvent(PlayerEntity triggerPlayer, SheepEntity target) {
        super(triggerPlayer);
        this.target = target;
    }

    /**
     * 返回被剪掉羊毛的羊的实体
     * @return 被剪掉羊毛的羊实体
     */
    public SheepEntity getSheep() {
        return target;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}