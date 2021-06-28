package org.pistonmc.api.entity;

import manifold.ext.props.rt.api.val;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.pistonmc.api.NamespacedResource;
import org.pistonmc.api.ResourceHolder;
import org.pistonmc.api.util.Util;

public interface EntityType<T extends Entity> extends ResourceHolder {
    /**
     * The id of this type of entity
     */
    @val NamespacedResource id;

    /**
     * Gets whether this type of entity can be summoned by /summon command or a spawner
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
//    @val(annos = @NonNull) String descriptionId = Util.makeDescriptionId("entity", id); FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default @NotNull String getDescriptionId() { return Util.makeDescriptionId("entity", id); }

    /**
     * Translated name component of this type of entity
     */
//    @val(annos = @NonNull) Component description = Component.translatable(descriptionId); FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default @NotNull Component getDescription() { return Component.translatable(getDescriptionId()); }

    /**
     * The default loot table resource
     */
//    @val(annos = @NonNull) NamespacedResource defaultLootTable = new NamespacedResource(id.namespace, "entities/" + id.path); FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default @NotNull NamespacedResource getDefaultLootTable() { return new NamespacedResource(id.namespace, "entities/" + id.path); }

    /**
     * Gets whether this type of entity should send delta movement(aka Motion) to client
     * @return if this type of entity can be affected by Motion NBT tag
     */
    default boolean trackDeltas() {
        return this != EntityTypes.PLAYER && this != EntityTypes.LLAMA_SPIT && this != EntityTypes.WITHER
                && this != EntityTypes.BAT && this != EntityTypes.ITEM_FRAME && this != EntityTypes.LEASH_KNOT
                && this != EntityTypes.PAINTING && this != EntityTypes.END_CRYSTAL && this != EntityTypes.EVOKER_FANGS;
    }

//    @override @val NamespacedResource resource = id; FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    @Override default NamespacedResource getResource() { return id; }
}