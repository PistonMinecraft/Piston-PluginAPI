/*
 * Piston's Lite Modding (to Minecraft) API. Also known as Piston Plugin API.
 * Copyright (C) 2021 PistonMC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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