package org.pistonmc.api.event.entity.player;

import manifold.ext.props.rt.api.val;
import org.pistonmc.api.entity.player.PlayerEntity;
import org.pistonmc.api.location.Position;

public class PlayerMoveEvent extends PlayerEvent {
    /**
     * 玩家从哪个位置移动
     */
    @val Position from;

    /**
     * 玩家移动到哪个位置
     */
    @val Position to;

    public PlayerMoveEvent(PlayerEntity player, Position from, Position to) {
        super(player);
        this.from = from;
        this.to = to;
    }
}