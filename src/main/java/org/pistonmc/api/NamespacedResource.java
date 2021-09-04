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
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class NamespacedResource implements Key {
    public static final String DEFAULT_NAMESPACE = "minecraft";
    final @val String namespace;
    final @val String path;

    public NamespacedResource(String namespace, String path) {
        this.namespace = namespace;
        this.path = path;
    }

    public NamespacedResource(@NotNull String fullNameOrName) {
        if(fullNameOrName.contains(":")) { // If it is a full name
            String[] s = fullNameOrName.split(":");
            this.namespace = s[0];
            this.path = s[1];
        } else { // If it is name only
            this.namespace = DEFAULT_NAMESPACE;
            this.path = fullNameOrName;
        }
    }

    public static @NotNull NamespacedResource minecraft(String name) {
        return new NamespacedResource(DEFAULT_NAMESPACE, name);
    }

    @Override
    public @NotNull String toString() {
        return namespace + ':' + path;
    }

    @Override
    public @NotNull String namespace() {
        return namespace;
    }

    @Override
    public @NotNull String value() {
        return path;
    }

    @Override
    public @NotNull String asString() {
        return toString();
    }

    @Override
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof NamespacedResource)) return false;
        NamespacedResource that = (NamespacedResource) o;
        return namespace.equals(that.namespace) && path.equals(that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, path);
    }
}