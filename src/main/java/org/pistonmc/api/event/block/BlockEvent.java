package org.pistonmc.api.event.block;

import net.minecraftforge.eventbus.api.Event;
import org.pistonmc.api.block.Block;

public abstract class BlockEvent extends Event {
    private final Block block;

    public BlockEvent(Block block) {
        this.block = block;
    }

    /**
     * 返回触发事件的方块
     * @return  触发事件的方块
     */
    public Block getBlock() {
        return block;
    }
}