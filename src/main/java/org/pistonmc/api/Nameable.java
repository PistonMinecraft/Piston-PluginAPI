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
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * 表示某个有name, custom name并且可能有display name的东西
 * <br><br>
 * Represents something that have a name and a custom name, and may have a display name
 */
public interface Nameable {
    /**
     * The name of this {@link Nameable}
     */
    @val(annos = @NotNull) Component name;

    /**
     * Gets whether this {@link Nameable} has a custom name
     *
     * @return if this {@link Nameable} has a custom name
     * @see #customName
     */
    default boolean hasCustomName() {
        return customName != null;
    }

    /**
     * Gets the display name of this {@link Nameable}. Default implementation delegates to {@link Nameable#getName()}
     * @return the name of this {@link Nameable}, if any. Defaults to {@link Nameable#getName()}
     */
    default @NotNull Component getDisplayName() {
        return name;
    }

    /**
     * The custom name of this {@link Nameable}. Can be null.
     *
     * @see #hasCustomName() Check whether custom name is null
     */
    @val(annos = { @Nullable, @org.jetbrains.annotations.Nullable }) Component customName;
}