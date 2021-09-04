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

package org.pistonmc.api.event.entity.player;

import org.pistonmc.api.entity.Entity;
import org.pistonmc.api.entity.player.PlayerEntity;

public class PlayerDeathEvent extends PlayerEvent {
    private String deathMessage;
    private final Entity killer;

    public PlayerDeathEvent(PlayerEntity player, Entity killer, String deathMessage) {
        super(player);
        this.deathMessage = deathMessage;
        this.killer = killer;
    }

    /**
     * 设置死亡广播消息
     * @param deathMessage 死亡广播消息
     */
    public void setDeathMessage(String deathMessage){
        this.deathMessage = deathMessage;
    }

    /**
     * 获取死亡广播消息
     * @return 死亡广播消息
     */
    public String getDeathMessage(){
        return deathMessage;
    }

    /**
     * 获取击杀玩家的实体
     * @return 击杀玩家的实体
     */
    public Entity getKiller(){
        return killer;
    }
}