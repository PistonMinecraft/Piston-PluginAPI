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

import org.pistonmc.api.block.Block;
import org.pistonmc.api.entity.Entity;

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