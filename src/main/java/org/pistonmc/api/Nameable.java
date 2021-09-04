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

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 表示某个有name, custom name并且可能有display name的东西
 * <br><br>
 * Represents something that have a name and a custom name, and may have a display name
 */
public interface Nameable {
    /**
     * Gets the name of this {@link Nameable}
     * @return the name of this {@link Nameable}
     */
    @NotNull Component getName();

    /**
     * Gets whether this {@link Nameable} has a custom name
     * @return if this {@link Nameable} has a custom name
     */
    default boolean hasCustomName() {
        return getCustomName() != null;
    }

    /**
     * Gets the display name of this {@link Nameable}. Default implementation delegates to {@link Nameable#getName()}
     * @return the name of this {@link Nameable}, if any. Defaults to {@link Nameable#getName()}
     */
    default @NotNull Component getDisplayName() {
        return getName();
    }

    /**
     * Gets the custom name of this {@link Nameable}
     * @return the custom name of this {@link Nameable}, if any
     */
    default @Nullable Component getCustomName() {
        return null;
    }
}