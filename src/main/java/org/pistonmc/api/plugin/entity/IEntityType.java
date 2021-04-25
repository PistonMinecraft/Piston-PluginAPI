package org.pistonmc.api.plugin.entity;

import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.val;
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.pistonmc.api.plugin.NamespacedResource;
import org.pistonmc.api.plugin.Piston;
import org.pistonmc.api.plugin.ResourceHolder;
import org.pistonmc.api.plugin.util.Util;

import java.util.Objects;

public interface IEntityType extends ResourceHolder {
    /**
     * The id of this type of entity
     */
    @val NamespacedResource id;

    /**
     * Gets whether this type of entity can be summoned by /summon command or a spawner
     * @return if this type of entity can be summoned by /summon command or a spawner
     */
    default boolean canSummon() {
        return Objects.requireNonNull(Piston.registryUtil).isEntityTypeCanSummon(id);
    }

    /**
     * Gets whether this type of entity is immune to fire
     * @return if this type of entity is immune to fire
     */
    default boolean fireImmune() {
        return Objects.requireNonNull(Piston.registryUtil).isEntityTypeFireImmune(id);
    }

    /**
     * Gets whether this type of entity can be spawned even if every player is outside the despawn distance
     * @return if this type of entity can be spawned even if every player is outside the despawn distance
     */
    default boolean canSpawnFarFromPlayer() {
        return Objects.requireNonNull(Piston.registryUtil).isEntityTypeCanSpawnFarFromPlayer(id);
    }

    /**
     * The category of this type of entity
     */
    @val(annos = @NonNull) MobCategory category;

    /**
     * Translatable name id of this type of entity(format: entity.namespace.path.separated.with.dots)
     */
    @val(annos = @NonNull) String descriptionId = Util.makeDescriptionId("entity", id);

    /**
     * Translated name component of this type of entity
     */
    @val(annos = @NonNull) Component description = Component.translatable(descriptionId);

    /**
     * The default loot table resource
     */
    @val(annos = @NonNull) NamespacedResource defaultLootTable = new NamespacedResource(id.namespace, "entities/" + id.path);

    /**
     * Gets whether this type of entity should send delta movement(aka Motion) to client
     * @return if this type of entity can be affected by Motion NBT tag
     */
    default boolean trackDeltas() {
        return this != EntityType.PLAYER && this != EntityType.LLAMA_SPIT && this != EntityType.WITHER
                && this != EntityType.BAT && this != EntityType.ITEM_FRAME && this != EntityType.LEASH_KNOT
                && this != EntityType.PAINTING && this != EntityType.END_CRYSTAL && this != EntityType.EVOKER_FANGS;
    }

    @override @val NamespacedResource resource = id;
}