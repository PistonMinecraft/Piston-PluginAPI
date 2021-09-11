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

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jetbrains.annotations.NotNull;
import org.pistonmc.api.NamespacedResource;
import org.pistonmc.api.Piston;

import java.util.Optional;

public class EntityTypes {
    static {
        if (Piston.registryUtil == null) { // Don't use Objects.requireNonNull because checkerframework thinks it can only pass a non-null value
            throw new NullPointerException("PistonInternalRegistryUtil hasn't been initialized yet");
        }
    }

    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> AREA_EFFECT_CLOUD = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("area_effect_cloud"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ARMOR_STAND = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("armor_stand"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ARROW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("arrow"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("bat"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BEE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("bee"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BLAZE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("blaze"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BOAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("boat"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cat"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CAVE_SPIDER = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("cave_spider"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CHICKEN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("chicken"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> COD = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cod"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> COW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cow"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CREEPER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("creeper"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DOLPHIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("dolphin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DONKEY = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("donkey"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DRAGON_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("dragon_fireball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DROWNED = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("drowned"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ELDER_GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("elder_guardian"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> END_CRYSTAL = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("end_crystal"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDER_DRAGON = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("ender_dragon"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDERMAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("enderman"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDERMITE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("endermite"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EVOKER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("evoker"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EVOKER_FANGS = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("evoker_fangs"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EXPERIENCE_ORB = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("experience_orb"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EYE_OF_ENDER = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("eye_of_ender"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FALLING_BLOCK = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("falling_block"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FIREWORK_ROCKET = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("firework_rocket"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FOX = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fox"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> GHAST = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ghast"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> GIANT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("giant"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("guardian"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HOGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("hoglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HORSE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("horse"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HUSK = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("husk"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ILLUSIONER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("illusioner"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> IRON_GOLEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("iron_golem"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ITEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("item"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ITEM_FRAME = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("item_frame"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FIREBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fireball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LEASH_KNOT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("leash_knot"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LIGHTNING_BOLT = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("lightning_bolt"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LLAMA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("llama"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LLAMA_SPIT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("llama_spit"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MAGMA_CUBE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("magma_cube"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CHEST_MINECART = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("chest_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> COMMAND_BLOCK_MINECART = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("command_block_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FURNACE_MINECART = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("furnace_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HOPPER_MINECART = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("hopper_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SPAWNER_MINECART = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("spawner_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TNT_MINECART = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("tnt_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MULE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("mule"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MOOSHROOM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("mooshroom"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> OCELOT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ocelot"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PAINTING = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("painting"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PANDA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("panda"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PARROT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("parrot"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PHANTOM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("phantom"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PIG = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pig"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PIGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("piglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PIGLIN_BRUTE = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("piglin_brute"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pillager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> POLAR_BEAR = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("polar_bear"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TNT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("tnt"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PUFFERFISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pufferfish"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> RABBIT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("rabbit"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> RAVAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ravager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SALMON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("salmon"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SHEEP = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("sheep"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SHULKER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("shulker"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SHULKER_BULLET = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("shulker_bullet"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SILVERFISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("silverfish"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SKELETON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("skeleton"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SKELETON_HORSE = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("skeleton_horse"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SLIME = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("slime"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SMALL_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("small_fireball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SNOW_GOLEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("snow_golem"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SNOWBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("snowball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SPECTRAL_ARROW = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("spectral_arrow"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SPIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("spider"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SQUID = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("squid"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> STRAY = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("stray"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> STRIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("strider"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EGG = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("egg"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDER_PEARL = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("ender_pearl"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EXPERIENCE_BOTTLE = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("experience_bottle"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> POTION = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("potion"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TRIDENT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("trident"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TRADER_LLAMA = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("trader_llama"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TROPICAL_FISH = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("tropical_fish"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TURTLE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("turtle"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> VEX = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("vex"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> VILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("villager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> VINDICATOR = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("vindicator"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WANDERING_TRADER = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("wandering_trader"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITCH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("witch"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITHER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wither"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITHER_SKELETON = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("wither_skeleton"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITHER_SKULL = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("wither_skull"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WOLF = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wolf"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zoglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombie"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIE_HORSE = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("zombie_horse"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIE_VILLAGER = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("zombie_villager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIFIED_PIGLIN = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("zombified_piglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PLAYER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("player"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FISHING_BOBBER = Piston.registryUtil.entityUtil.getEntityType(
            NamespacedResource.minecraft("fishing_bobber"));

    @RequiresNonNull("org.pistonmc.api.Piston.registryUtil")
    @SuppressWarnings("nullness")
    public static NamespacedResource getKey(@NotNull EntityType<?> type) {
        return Piston.registryUtil.entityUtil.getRegisterKeyByEntityType(type);
    }

    @RequiresNonNull("org.pistonmc.api.Piston.registryUtil")
    @SuppressWarnings("nullness")
    public static <T extends Entity> Optional<EntityType<T>> byString(@NotNull String registryName) {
        return Piston.registryUtil.entityUtil.getEntityTypeByString(registryName);
    }
}