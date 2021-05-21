package org.pistonmc.api.plugin.entity;

import manifold.ext.props.rt.api.val;
import manifold.ext.props.rt.api.var;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.event.HoverEventSource;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.common.value.qual.IntRange;
import org.pistonmc.api.plugin.CommandSource;
import org.pistonmc.api.plugin.Nameable;
import org.pistonmc.api.plugin.Sound;
import org.pistonmc.api.plugin.entity.data.EntityData;
import org.pistonmc.api.plugin.fluid.FluidType;

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
    @val(annos = @NonNull) IEntityType entityType;

    /**
     * Returns the unique id of this entity
     * @return the unique id of this entity
     */
    @val(annos = @IntRange(from = 1)) int entityId;

    /**
     * The tags that added by /tag command
     */
    @val(annos = @NonNull) Set<String> tags;

    /**
     * Adds the tag to this entity
     * @param tag the tag to be added
     * @return if the tag had been added successfully
     */
    boolean addTag(@NonNull String tag);

    /**
     * Removes the tag of this entity
     * @param tag the tag to be removed
     * @return if the tag had been removed successfully
     */
    boolean removeTag(@NonNull String tag);

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
    @var(/*param = @NonNull, annos = @NonNull*/) EntityPose entityPose;

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
    @var(/*param = @IntRange(from = 0), annos = @IntRange(from = 0)*/) int portalCooldownTime;

    /**
     * Whether this entity is on portal cooldown
     */
    @val boolean onPortalCooldown;

    /**
     * The ticks this entity will wait for before teleporting
     */
    @var(/*param = @IntRange(from = 0), annos = @IntRange(from = 0)*/) int portalWaitTime;

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
    void playSound(@NonNull Sound sound, float volume, float pitch);

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
    @val boolean fireImmune = entityType.fireImmune();

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
    @val boolean inWaterOrRain = inWater || inRain;

    /**
     * Whether this entity is in water or rain or bubble column
     */
    @val boolean inWaterRainOrBubble = inWater || inRain || inBubbleColumn;

    /**
     * Whether this entity is in water or bubble column
     */
    @val boolean inWaterOrBubble = inWater || inBubbleColumn;

    /**
     * Returns whether this entity's eye is in the type of the fluid or not
     * @param fluid the type of the fluid to be detected
     * @return if this entity's eye is in the type of the fluid
     */
    boolean isEyeInFluid(@NonNull FluidType fluid);

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
    boolean hurt(@NonNull EntityDamageSource damageSource, float hurtDamage);
}