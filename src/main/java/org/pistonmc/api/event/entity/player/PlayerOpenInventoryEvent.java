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
import org.pistonmc.api.inventory.Inventory;

public class PlayerOpenInventoryEvent extends PlayerEvent {
    private final Inventory inventory;
    private boolean cancelled;

    public PlayerOpenInventoryEvent(PlayerEntity player, Inventory open) {
        super(player);
        this.inventory = open;
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}