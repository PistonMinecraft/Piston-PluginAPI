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

import manifold.ext.props.rt.api.var;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;
import org.pistonmc.api.util.RegistryUtil;

import java.util.Objects;

public class Piston {
    static @var
    @MonotonicNonNull Server server;

    static @var
    @MonotonicNonNull RegistryUtil registryUtil;

    @EnsuresNonNull("Piston.server")
    public static void setServer(@NotNull @NonNull Server server) {
        if (Piston.server != null) {
            throw new IllegalStateException("Server already set");
        }
        Piston.server = Objects.requireNonNull(server);
    }

    @EnsuresNonNull("Piston.registryUtil")
    public static void setRegistryUtil(@NotNull @NonNull RegistryUtil registryUtil) {
        if (Piston.registryUtil != null) {
            throw new IllegalStateException("Registry Util already set");
        }
        Piston.registryUtil = Objects.requireNonNull(registryUtil);
    }
}