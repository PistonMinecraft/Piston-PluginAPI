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

package org.pistonmc.api.entity;

import manifold.ext.props.rt.api.val;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.pistonmc.api.util.Util;

public interface EntityType<T extends Entity> extends Keyed {
    /**
     * The id of this type of entity
     */
    @val Key id;

    /**
     * Gets whether this type of entity can be summoned by /summon command or a spawner
     *
     * @return if this type of entity can be summoned by /summon command or a spawner
     */
    boolean canSummon();

    /**
     * Gets whether this type of entity is immune to fire
     * @return if this type of entity is immune to fire
     */
    boolean fireImmune();

    /**
     * Gets whether this type of entity can be spawned even if every player is outside the despawn distance
     * @return if this type of entity can be spawned even if every player is outside the despawn distance
     */
    boolean canSpawnFarFromPlayer();

    /**
     * The category of this type of entity
     */
    @val(annos = @NotNull) MobCategory category;

    /**
     * Translatable name id of this type of entity(format: entity.namespace.path.separated.with.dots)
     */
//    @val(annos = @NotNull) String descriptionId = Util.makeDescriptionId("entity", id); FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default @NotNull String getDescriptionId() { return Util.makeDescriptionId("entity", id); }

    /**
     * Translated name component of this type of entity
     */
    //    @val(annos = @NotNull) Component description = Component.translatable(descriptionId); FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default @NotNull Component getDescription() {
        return Component.translatable(getDescriptionId());
    }

    /**
     * The default loot table resource
     */
    //    @val(annos = @NotNull) Key defaultLootTable = Key.key(id.namespace(), "entities/" + id.value()); FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default @NotNull Key getDefaultLootTable() {
        return Key.key(id.namespace(), "entities/" + id.value());
    }

    /**
     * Gets whether this type of entity should send delta movement(aka Motion) to client
     *
     * @return if this type of entity can be affected by Motion NBT tag
     */
    default boolean trackDeltas() {
        return this != EntityTypes.PLAYER && this != EntityTypes.LLAMA_SPIT && this != EntityTypes.WITHER && this != EntityTypes.BAT &&
               this != EntityTypes.ITEM_FRAME && this != EntityTypes.LEASH_KNOT && this != EntityTypes.PAINTING && this != EntityTypes.END_CRYSTAL &&
               this != EntityTypes.EVOKER_FANGS;
    }

    @Override
    default @NotNull Key key() {
        return id;
    }
}