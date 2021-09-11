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

package org.pistonmc.api.util;

import manifold.ext.props.rt.api.val;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.pistonmc.api.NamespacedResource;
import org.pistonmc.api.entity.Entity;
import org.pistonmc.api.entity.EntityType;

import java.util.Optional;

@ApiStatus.Internal
public interface RegistryUtil {
    @ApiStatus.Internal
    interface EntityUtil {
        <T extends Entity> EntityType<T> getEntityType(NamespacedResource registryName);

        NamespacedResource getRegisterKeyByEntityType(EntityType<?> type);

        <T extends Entity> Optional<EntityType<T>> getEntityTypeByString(String name);
    }

    @val(annos = @NotNull) EntityUtil entityUtil;
}