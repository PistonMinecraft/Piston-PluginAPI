package org.pistonmc.api.plugin.event.player;

import org.pistonmc.api.plugin.block.Block;
import org.pistonmc.api.plugin.entity.player.PlayerEntity;

public class PlayerUseBoneMealEvent extends PlayerEvent {
    private final Block target;

    public PlayerUseBoneMealEvent(Block target, PlayerEntity player) {
        super(player);
        this.target = target;
    }

    /**
     * 返回被使用骨粉的方块
     * @return 被使用骨粉的方块
     */
    public Block getTargetBlock() {
        return target;
    }
}