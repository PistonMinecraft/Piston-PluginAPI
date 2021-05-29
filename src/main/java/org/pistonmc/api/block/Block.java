package org.pistonmc.api.block;

import org.pistonmc.api.DyeColor;
import org.pistonmc.api.location.Position;

public interface Block {
    BlockType getBlockType();
    Position getBlockLocation();
    boolean hasColor();
    DyeColor getColor();
}