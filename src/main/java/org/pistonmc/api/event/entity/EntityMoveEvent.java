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

package org.pistonmc.api.event.entity;

import manifold.ext.props.rt.api.val;
import org.pistonmc.api.entity.Entity;
import org.pistonmc.api.location.Position;

/**
 * 玩家实体移动不会通知到该事件
 */
public class EntityMoveEvent extends EntityEvent {
    /**
     * 实体从哪个位置移动
     */
    @val Position from;

    /**
     * 实体移动到哪个位置
     */
    @val Position to;

    public EntityMoveEvent(Entity entity, Position from, Position to) {
        super(entity);
        this.from = from;
        this.to = to;
    }
}