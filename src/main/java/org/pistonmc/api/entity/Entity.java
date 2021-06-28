package org.pistonmc.api.entity;

import manifold.ext.props.rt.api.get;
import manifold.ext.props.rt.api.val;
import manifold.ext.props.rt.api.var;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.event.HoverEventSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;
import org.pistonmc.api.CommandSource;
import org.pistonmc.api.Nameable;
import org.pistonmc.api.Sound;
import org.pistonmc.api.entity.data.EntityData;
import org.pistonmc.api.fluid.FluidType;

import java.util.Set;

/**
 * 表示一个{@code 实体}。
 * <br><br>
 * Represents an {@code Entity}.
 */
public interface Entity extends Nameable, CommandSource, HoverEventSource<HoverEvent.ShowEntity> {
    /**
     * Whether this entity is in spectator mode.
     */
    @val boolean spectator;

    /**
     * Eject all passengers if this entity is a vehicle.<br>
     * Stop riding if this entity is a passenger.
     */
    void unRide();

    /**
     * The type of this entity
     */
    @val(annos = @NotNull) EntityType entityType;

    /**
     * Returns the unique id of this entity
     */
    @val(annos = @Range(from = 1, to = Integer.MAX_VALUE)) int entityId;

    /**
     * The tags that added by /tag command
     */
    @val(annos = @NotNull) Set<String> tags;

    /**
     * Adds the tag to this entity
     * @param tag the tag to be added
     * @return if the tag had been added successfully
     */
    boolean addTag(@NotNull String tag);

    /**
     * Removes the tag of this entity
     * @param tag the tag to be removed
     * @return if the tag had been removed successfully
     */
    boolean removeTag(@NotNull String tag);

    /**
     * Kills this entity. Default delegates to {@link Entity#remove()}
     */
    default void kill() {
        remove();
    }

    /**
     * The data of this entity
     */
    @val EntityData entityData;

    /**
     * Mark this entity as removed
     */
    void remove();

    /**
     * The pose of this entity
     */
    @var(param = @NotNull) @get(annos = @NotNull) EntityPose entityPose;

    /**
     * Sets the position of this entity
     * @param x X pos
     * @param y Y pos
     * @param z Z pos
     */
    void setPos(double x, double y, double z);

    /**
     * The portal cooldown time of this entity.
     */
    @var(param = @Range(from = 0, to = Integer.MAX_VALUE)) @get(annos = @Range(from = 0, to = Integer.MAX_VALUE)) int portalCooldownTime;

    /**
     * Whether this entity is on portal cooldown
     */
    @val boolean onPortalCooldown;

    /**
     * The ticks this entity will wait for before teleporting
     */
    @var(param = @Range(from = 0, to = Integer.MAX_VALUE)) @get(annos = @Range(from = 0, to = Integer.MAX_VALUE)) int portalWaitTime;

    /**
     * The remaining ticks of this entity on fire
     */
    @var int remainingFireTicks;

    /**
     * Clear the fire of this entity.
     */
    default void clearFire() {
        remainingFireTicks = 0;
    }

    /**
     * Whether this entity is on ground
     */
    @val boolean onGround;

    /**
     * Plays the sound from this entity if this entity is not silent.({@link Entity#isSilent()} returns false)
     * @param sound the sound to play
     * @param volume volume of the sound
     * @param pitch pitch of the sound
     */
    void playSound(@NotNull Sound sound, float volume, float pitch);

    /**
     * Whether this entity is silent
     */
    @var boolean silent;

    /**
     * Whether this entity is no gravity
     */
    @var boolean noGravity;

    /**
     * Whether this entity is immune to fire
     */
//    @val boolean fireImmune = entityType.fireImmune(); FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default boolean isFireImmune() { return entityType.fireImmune(); }

    /**
     * Whether this entity is in water
     */
    @val boolean inWater;

    /**
     * Whether this entity is in rain
     */
    @val boolean inRain;

    /**
     * Whether this entity is in bubble column
     */
    @val boolean inBubbleColumn;

    /**
     * Whether this entity is in water or rain
     */
//    @val boolean inWaterOrRain = inWater || inRain; FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default boolean isInWaterOrRain() { return isInWater() || isInRain(); }

    /**
     * Whether this entity is in water or rain or bubble column
     */
//    @val boolean inWaterRainOrBubble = inWater || inRain || inBubbleColumn; FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default boolean isInWaterRainOrBubble() { return isInWater() || isInRain() || isInBubbleColumn(); }

    /**
     * Whether this entity is in water or bubble column
     */
//    @val boolean inWaterOrBubble = inWater || inBubbleColumn; FIXME: Manifold bug. Cannot invoke methods/get properties in the initializer of a val property in an interface
    default boolean isInWaterOrBubble() { return isInWater() || isInBubbleColumn(); }

    /**
     * Returns whether this entity's eye is in the type of the fluid or not
     * @param fluid the type of the fluid to be detected
     * @return if this entity's eye is in the type of the fluid
     */
    boolean isEyeInFluid(@NotNull FluidType fluid);

    /**
     * Whether this entity is in lava
     */
    @val boolean inLava;

    /**
     * Try hurting this entity with specific damage source and damage.
     * @param damageSource Source of the damage
     * @param hurtDamage Damage to hurt
     * @return if entity have been hurt successfully
     */
    boolean hurt(@NotNull EntityDamageSource damageSource, float hurtDamage);
}