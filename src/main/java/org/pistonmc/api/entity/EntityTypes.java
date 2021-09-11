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

import net.kyori.adventure.key.Key;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jetbrains.annotations.NotNull;
import org.pistonmc.api.Piston;

import java.util.Optional;

public class EntityTypes {
    static {
        if (Piston.registryUtil == null) { // Don't use Objects.requireNonNull because checkerframework thinks it can only pass a non-null value
            throw new NullPointerException("PistonInternalRegistryUtil hasn't been initialized yet");
        }
    }

    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> AREA_EFFECT_CLOUD = Piston.registryUtil.entityUtil.getEntityType(Key.key("area_effect_cloud"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ARMOR_STAND = Piston.registryUtil.entityUtil.getEntityType(Key.key("armor_stand"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ARROW = Piston.registryUtil.entityUtil.getEntityType(Key.key("arrow"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BAT = Piston.registryUtil.entityUtil.getEntityType(Key.key("bat"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BEE = Piston.registryUtil.entityUtil.getEntityType(Key.key("bee"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BLAZE = Piston.registryUtil.entityUtil.getEntityType(Key.key("blaze"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> BOAT = Piston.registryUtil.entityUtil.getEntityType(Key.key("boat"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CAT = Piston.registryUtil.entityUtil.getEntityType(Key.key("cat"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CAVE_SPIDER = Piston.registryUtil.entityUtil.getEntityType(Key.key("cave_spider"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CHICKEN = Piston.registryUtil.entityUtil.getEntityType(Key.key("chicken"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> COD = Piston.registryUtil.entityUtil.getEntityType(Key.key("cod"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> COW = Piston.registryUtil.entityUtil.getEntityType(Key.key("cow"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CREEPER = Piston.registryUtil.entityUtil.getEntityType(Key.key("creeper"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DOLPHIN = Piston.registryUtil.entityUtil.getEntityType(Key.key("dolphin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DONKEY = Piston.registryUtil.entityUtil.getEntityType(Key.key("donkey"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DRAGON_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(Key.key("dragon_fireball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> DROWNED = Piston.registryUtil.entityUtil.getEntityType(Key.key("drowned"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ELDER_GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(Key.key("elder_guardian"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> END_CRYSTAL = Piston.registryUtil.entityUtil.getEntityType(Key.key("end_crystal"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDER_DRAGON = Piston.registryUtil.entityUtil.getEntityType(Key.key("ender_dragon"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDERMAN = Piston.registryUtil.entityUtil.getEntityType(Key.key("enderman"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDERMITE = Piston.registryUtil.entityUtil.getEntityType(Key.key("endermite"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EVOKER = Piston.registryUtil.entityUtil.getEntityType(Key.key("evoker"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EVOKER_FANGS = Piston.registryUtil.entityUtil.getEntityType(Key.key("evoker_fangs"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EXPERIENCE_ORB = Piston.registryUtil.entityUtil.getEntityType(Key.key("experience_orb"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EYE_OF_ENDER = Piston.registryUtil.entityUtil.getEntityType(Key.key("eye_of_ender"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FALLING_BLOCK = Piston.registryUtil.entityUtil.getEntityType(Key.key("falling_block"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FIREWORK_ROCKET = Piston.registryUtil.entityUtil.getEntityType(Key.key("firework_rocket"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FOX = Piston.registryUtil.entityUtil.getEntityType(Key.key("fox"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> GHAST = Piston.registryUtil.entityUtil.getEntityType(Key.key("ghast"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> GIANT = Piston.registryUtil.entityUtil.getEntityType(Key.key("giant"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(Key.key("guardian"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HOGLIN = Piston.registryUtil.entityUtil.getEntityType(Key.key("hoglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HORSE = Piston.registryUtil.entityUtil.getEntityType(Key.key("horse"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HUSK = Piston.registryUtil.entityUtil.getEntityType(Key.key("husk"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ILLUSIONER = Piston.registryUtil.entityUtil.getEntityType(Key.key("illusioner"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> IRON_GOLEM = Piston.registryUtil.entityUtil.getEntityType(Key.key("iron_golem"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ITEM = Piston.registryUtil.entityUtil.getEntityType(Key.key("item"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ITEM_FRAME = Piston.registryUtil.entityUtil.getEntityType(Key.key("item_frame"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FIREBALL = Piston.registryUtil.entityUtil.getEntityType(Key.key("fireball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LEASH_KNOT = Piston.registryUtil.entityUtil.getEntityType(Key.key("leash_knot"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LIGHTNING_BOLT = Piston.registryUtil.entityUtil.getEntityType(Key.key("lightning_bolt"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LLAMA = Piston.registryUtil.entityUtil.getEntityType(Key.key("llama"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> LLAMA_SPIT = Piston.registryUtil.entityUtil.getEntityType(Key.key("llama_spit"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MAGMA_CUBE = Piston.registryUtil.entityUtil.getEntityType(Key.key("magma_cube"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MINECART = Piston.registryUtil.entityUtil.getEntityType(Key.key("minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> CHEST_MINECART = Piston.registryUtil.entityUtil.getEntityType(Key.key("chest_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> COMMAND_BLOCK_MINECART = Piston.registryUtil.entityUtil.getEntityType(
            Key.key("command_block_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FURNACE_MINECART = Piston.registryUtil.entityUtil.getEntityType(Key.key("furnace_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> HOPPER_MINECART = Piston.registryUtil.entityUtil.getEntityType(Key.key("hopper_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SPAWNER_MINECART = Piston.registryUtil.entityUtil.getEntityType(Key.key("spawner_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TNT_MINECART = Piston.registryUtil.entityUtil.getEntityType(Key.key("tnt_minecart"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MULE = Piston.registryUtil.entityUtil.getEntityType(Key.key("mule"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> MOOSHROOM = Piston.registryUtil.entityUtil.getEntityType(Key.key("mooshroom"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> OCELOT = Piston.registryUtil.entityUtil.getEntityType(Key.key("ocelot"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PAINTING = Piston.registryUtil.entityUtil.getEntityType(Key.key("painting"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PANDA = Piston.registryUtil.entityUtil.getEntityType(Key.key("panda"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PARROT = Piston.registryUtil.entityUtil.getEntityType(Key.key("parrot"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PHANTOM = Piston.registryUtil.entityUtil.getEntityType(Key.key("phantom"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PIG = Piston.registryUtil.entityUtil.getEntityType(Key.key("pig"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PIGLIN = Piston.registryUtil.entityUtil.getEntityType(Key.key("piglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PIGLIN_BRUTE = Piston.registryUtil.entityUtil.getEntityType(Key.key("piglin_brute"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PILLAGER = Piston.registryUtil.entityUtil.getEntityType(Key.key("pillager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> POLAR_BEAR = Piston.registryUtil.entityUtil.getEntityType(Key.key("polar_bear"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TNT = Piston.registryUtil.entityUtil.getEntityType(Key.key("tnt"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PUFFERFISH = Piston.registryUtil.entityUtil.getEntityType(Key.key("pufferfish"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> RABBIT = Piston.registryUtil.entityUtil.getEntityType(Key.key("rabbit"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> RAVAGER = Piston.registryUtil.entityUtil.getEntityType(Key.key("ravager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SALMON = Piston.registryUtil.entityUtil.getEntityType(Key.key("salmon"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SHEEP = Piston.registryUtil.entityUtil.getEntityType(Key.key("sheep"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SHULKER = Piston.registryUtil.entityUtil.getEntityType(Key.key("shulker"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SHULKER_BULLET = Piston.registryUtil.entityUtil.getEntityType(Key.key("shulker_bullet"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SILVERFISH = Piston.registryUtil.entityUtil.getEntityType(Key.key("silverfish"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SKELETON = Piston.registryUtil.entityUtil.getEntityType(Key.key("skeleton"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SKELETON_HORSE = Piston.registryUtil.entityUtil.getEntityType(Key.key("skeleton_horse"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SLIME = Piston.registryUtil.entityUtil.getEntityType(Key.key("slime"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SMALL_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(Key.key("small_fireball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SNOW_GOLEM = Piston.registryUtil.entityUtil.getEntityType(Key.key("snow_golem"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SNOWBALL = Piston.registryUtil.entityUtil.getEntityType(Key.key("snowball"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SPECTRAL_ARROW = Piston.registryUtil.entityUtil.getEntityType(Key.key("spectral_arrow"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SPIDER = Piston.registryUtil.entityUtil.getEntityType(Key.key("spider"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> SQUID = Piston.registryUtil.entityUtil.getEntityType(Key.key("squid"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> STRAY = Piston.registryUtil.entityUtil.getEntityType(Key.key("stray"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> STRIDER = Piston.registryUtil.entityUtil.getEntityType(Key.key("strider"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EGG = Piston.registryUtil.entityUtil.getEntityType(Key.key("egg"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ENDER_PEARL = Piston.registryUtil.entityUtil.getEntityType(Key.key("ender_pearl"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> EXPERIENCE_BOTTLE = Piston.registryUtil.entityUtil.getEntityType(Key.key("experience_bottle"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> POTION = Piston.registryUtil.entityUtil.getEntityType(Key.key("potion"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TRIDENT = Piston.registryUtil.entityUtil.getEntityType(Key.key("trident"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TRADER_LLAMA = Piston.registryUtil.entityUtil.getEntityType(Key.key("trader_llama"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TROPICAL_FISH = Piston.registryUtil.entityUtil.getEntityType(Key.key("tropical_fish"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> TURTLE = Piston.registryUtil.entityUtil.getEntityType(Key.key("turtle"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> VEX = Piston.registryUtil.entityUtil.getEntityType(Key.key("vex"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> VILLAGER = Piston.registryUtil.entityUtil.getEntityType(Key.key("villager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> VINDICATOR = Piston.registryUtil.entityUtil.getEntityType(Key.key("vindicator"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WANDERING_TRADER = Piston.registryUtil.entityUtil.getEntityType(Key.key("wandering_trader"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITCH = Piston.registryUtil.entityUtil.getEntityType(Key.key("witch"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITHER = Piston.registryUtil.entityUtil.getEntityType(Key.key("wither"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITHER_SKELETON = Piston.registryUtil.entityUtil.getEntityType(Key.key("wither_skeleton"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WITHER_SKULL = Piston.registryUtil.entityUtil.getEntityType(Key.key("wither_skull"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> WOLF = Piston.registryUtil.entityUtil.getEntityType(Key.key("wolf"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOGLIN = Piston.registryUtil.entityUtil.getEntityType(Key.key("zoglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIE = Piston.registryUtil.entityUtil.getEntityType(Key.key("zombie"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIE_HORSE = Piston.registryUtil.entityUtil.getEntityType(Key.key("zombie_horse"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIE_VILLAGER = Piston.registryUtil.entityUtil.getEntityType(Key.key("zombie_villager"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> ZOMBIFIED_PIGLIN = Piston.registryUtil.entityUtil.getEntityType(Key.key("zombified_piglin"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> PLAYER = Piston.registryUtil.entityUtil.getEntityType(Key.key("player"));
    @SuppressWarnings("nullness")
    public static final @NotNull EntityType<?> FISHING_BOBBER = Piston.registryUtil.entityUtil.getEntityType(Key.key("fishing_bobber"));

    @RequiresNonNull("org.pistonmc.api.Piston.registryUtil")
    @SuppressWarnings("nullness")
    public static Key getKey(@NotNull EntityType<?> type) {
        return Piston.registryUtil.entityUtil.getRegisterKeyByEntityType(type);
    }

    @RequiresNonNull("org.pistonmc.api.Piston.registryUtil")
    @SuppressWarnings("nullness")
    public static <T extends Entity> Optional<EntityType<T>> byString(@NotNull String registryName) {
        return Piston.registryUtil.entityUtil.getEntityTypeByString(registryName);
    }
}