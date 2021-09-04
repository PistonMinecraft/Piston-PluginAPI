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

import org.pistonmc.api.effect.Effect;
import org.pistonmc.api.entity.player.PlayerEntity;

public class PlayerGetEffectEvent extends PlayerEvent {
    private final Effect effect;

    public PlayerGetEffectEvent(PlayerEntity player, Effect effect) {
        super(player);
        this.effect = effect;
    }

    /**
     * 返回获得的药水效果
     * @return 获得的药水效果
     */
    public Effect getEffect() {
        return effect;
    }
}