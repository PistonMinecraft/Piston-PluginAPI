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

import org.pistonmc.api.entity.Entity;

/**
 * 玩家死亡不会广播至此事件
 */
public class EntityDeathEvent extends EntityEvent {
    private final Entity killer;

    public EntityDeathEvent(Entity who, Entity killer) {
        super(who);
        this.killer = killer;
    }

    /**
     * 获取击杀实体的实体
     * @return 击杀实体的实体
     */
    public Entity getKiller() {
        return killer;
    }
}