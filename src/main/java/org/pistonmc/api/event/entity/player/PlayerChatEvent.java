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

public class PlayerChatEvent extends PlayerEvent {
    private String message;

    public PlayerChatEvent(String message, PlayerEntity player) {
        super(player);
        this.message = message;
    }

    /**
     * 返回玩家发出的消息
     * @return 玩家发出的消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置玩家发出的消息
     * @param message 玩家发出的消息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}