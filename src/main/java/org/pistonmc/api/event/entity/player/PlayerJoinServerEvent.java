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

import org.pistonmc.api.entity.player.PlayerEntity;

public class PlayerJoinServerEvent extends PlayerEvent {
    private String joinMessage;

    public PlayerJoinServerEvent(PlayerEntity player, String joinMessage) {
        super(player);
        this.joinMessage = joinMessage;
    }

    /**
     * 设置进入服务器的广播消息
     * @param joinMessage 进入服务器的广播消息
     */
    public void setJoinMessage(String joinMessage) {
        this.joinMessage = joinMessage;
    }

    /**
     * 获取进入服务器的广播消息
     * @return 进入服务器的广播消息
     */
    public String getJoinMessage() {
        return joinMessage;
    }
}