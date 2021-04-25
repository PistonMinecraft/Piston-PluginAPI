package org.pistonmc.api.plugin.event.block;

import org.pistonmc.api.plugin.block.Block;
import org.pistonmc.api.plugin.entity.Entity;

public class BlockBreakEvent extends BlockEvent {
    private final Entity who;

    public BlockBreakEvent(Block block, Entity who) {
        super(block);
        this.who = who;
    }

    /**
     * 返回破坏方块的实体
     * @return  破坏方块的实体
     */
    public Entity getBreaker() {
        return who;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}