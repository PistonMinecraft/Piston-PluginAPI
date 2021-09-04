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

package org.pistonmc.api;

import manifold.ext.props.rt.api.val;
import org.pistonmc.api.entity.player.PlayerEntity;

import java.util.UUID;

public interface Server {
    /**
     * 返回此实现的服务端版本
     * @return Piston服务端版本
     */
    String getServerVersion();

    /**
     * 通过玩家名称获取玩家实体
     * @param playerName 玩家的名字
     * @return 玩家实体
     */
    PlayerEntity getPlayer(String playerName);

    /**
     * 通过玩家UUID获取玩家实体
     * @param playerUUID UUID
     * @return 玩家实体
     */
    PlayerEntity getPlayer(UUID playerUUID);

    /**
     * 服务器最大人数
     */
    @val int maxPlayer;
}