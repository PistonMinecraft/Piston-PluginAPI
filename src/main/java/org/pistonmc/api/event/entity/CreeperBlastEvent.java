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

import org.pistonmc.api.entity.CreeperEntity;

public class CreeperBlastEvent extends EntityEvent {
    private final CreeperBlastReason reason;
    private boolean damageOnly;

    public CreeperBlastEvent(CreeperEntity creeper, CreeperBlastReason reason) {
        super(creeper);
        this.reason = reason;
    }

    /**
     * 返回爆炸原因
     * @return 爆炸原因
     */
    public CreeperBlastReason getReason() {
        return reason;
    }

    /**
     * 设置是否只造成伤害不造成破坏
     * @param damageOnly
     */
    public void setDamageOnly(boolean damageOnly) {
        this.damageOnly = damageOnly;
    }

    /**
     * 返回是否只造成伤害不造成破坏
     * @return  是否只造成伤害不造成破坏
     */
    public boolean isDamageOnly() {
        return damageOnly;
    }

    public enum CreeperBlastReason {
        FLINT,
        PLAYER
    }
}