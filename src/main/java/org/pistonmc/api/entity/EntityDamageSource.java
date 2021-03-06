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

import org.jetbrains.annotations.NotNull;

public record EntityDamageSource(@NotNull String id) {
    public static final EntityDamageSource IN_FIRE = new EntityDamageSource("inFire");
    public static final EntityDamageSource LIGHTNING_BOLT = new EntityDamageSource("lightningBolt");
    public static final EntityDamageSource ON_FIRE = new EntityDamageSource("onFire");
    public static final EntityDamageSource LAVA = new EntityDamageSource("lava");
    public static final EntityDamageSource HOT_FLOOR = new EntityDamageSource("hotFloor");
    public static final EntityDamageSource IN_WALL = new EntityDamageSource("inWall");
    public static final EntityDamageSource CRAMMING = new EntityDamageSource("cramming");
    public static final EntityDamageSource DROWN = new EntityDamageSource("drown");
    public static final EntityDamageSource STARVE = new EntityDamageSource("starve");
    public static final EntityDamageSource CACTUS = new EntityDamageSource("cactus");
    public static final EntityDamageSource FALL = new EntityDamageSource("fall");
    public static final EntityDamageSource FLY_INTO_WALL = new EntityDamageSource("flyIntoWall");
    public static final EntityDamageSource OUT_OF_WORLD = new EntityDamageSource("outOfWorld");
    public static final EntityDamageSource GENERIC = new EntityDamageSource("generic");
    public static final EntityDamageSource MAGIC = new EntityDamageSource("magic");
    public static final EntityDamageSource WITHER = new EntityDamageSource("wither");
    public static final EntityDamageSource ANVIL = new EntityDamageSource("anvil");
    public static final EntityDamageSource FALLING_BLOCK = new EntityDamageSource("fallingBlock");
    public static final EntityDamageSource DRAGON_BREATH = new EntityDamageSource("dragonBreath");
    public static final EntityDamageSource DRY_OUT = new EntityDamageSource("dryout");
    public static final EntityDamageSource SWEET_BERRY_BUSH = new EntityDamageSource("sweetBerryBush");
}