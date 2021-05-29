package org.pistonmc.api.entity;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.pistonmc.api.NamespacedResource;
import org.pistonmc.api.Piston;

import java.util.Optional;

public class EntityTypes {
    static {
        if(Piston.registryUtil == null) throw new IllegalStateException("PistonInternalRegistryUtil hasn't been initialized yet");
    }

    @SuppressWarnings("nullness")
    public static final EntityType<?> AREA_EFFECT_CLOUD = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("area_effect_cloud"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ARMOR_STAND = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("armor_stand"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ARROW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("arrow"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> BAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("bat"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> BEE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("bee"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> BLAZE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("blaze"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> BOAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("boat"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> CAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cat"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> CAVE_SPIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cave_spider"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> CHICKEN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("chicken"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> COD = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cod"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> COW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cow"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> CREEPER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("creeper"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> DOLPHIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("dolphin"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> DONKEY = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("donkey"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> DRAGON_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("dragon_fireball"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> DROWNED = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("drowned"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ELDER_GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("elder_guardian"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> END_CRYSTAL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("end_crystal"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ENDER_DRAGON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ender_dragon"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ENDERMAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("enderman"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ENDERMITE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("endermite"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> EVOKER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("evoker"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> EVOKER_FANGS = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("evoker_fangs"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> EXPERIENCE_ORB = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("experience_orb"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> EYE_OF_ENDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("eye_of_ender"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> FALLING_BLOCK = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("falling_block"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> FIREWORK_ROCKET = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("firework_rocket"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> FOX = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fox"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> GHAST = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ghast"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> GIANT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("giant"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("guardian"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> HOGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("hoglin"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> HORSE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("horse"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> HUSK = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("husk"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ILLUSIONER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("illusioner"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> IRON_GOLEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("iron_golem"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ITEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("item"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ITEM_FRAME = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("item_frame"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> FIREBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fireball"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> LEASH_KNOT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("leash_knot"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> LIGHTNING_BOLT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("lightning_bolt"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> LLAMA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("llama"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> LLAMA_SPIT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("llama_spit"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> MAGMA_CUBE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("magma_cube"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("minecart"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> CHEST_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("chest_minecart"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> COMMAND_BLOCK_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("command_block_minecart"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> FURNACE_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("furnace_minecart"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> HOPPER_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("hopper_minecart"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SPAWNER_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("spawner_minecart"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> TNT_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("tnt_minecart"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> MULE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("mule"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> MOOSHROOM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("mooshroom"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> OCELOT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ocelot"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PAINTING = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("painting"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PANDA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("panda"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PARROT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("parrot"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PHANTOM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("phantom"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PIG = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pig"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PIGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("piglin"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PIGLIN_BRUTE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("piglin_brute"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pillager"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> POLAR_BEAR = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("polar_bear"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> TNT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("tnt"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PUFFERFISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pufferfish"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> RABBIT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("rabbit"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> RAVAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ravager"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SALMON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("salmon"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SHEEP = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("sheep"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SHULKER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("shulker"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SHULKER_BULLET = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("shulker_bullet"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SILVERFISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("silverfish"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SKELETON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("skeleton"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SKELETON_HORSE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("skeleton_horse"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SLIME = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("slime"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SMALL_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("small_fireball"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SNOW_GOLEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("snow_golem"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SNOWBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("snowball"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SPECTRAL_ARROW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("spectral_arrow"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SPIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("spider"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> SQUID = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("squid"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> STRAY = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("stray"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> STRIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("strider"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> EGG = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("egg"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ENDER_PEARL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ender_pearl"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> EXPERIENCE_BOTTLE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("experience_bottle"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> POTION = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("potion"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> TRIDENT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("trident"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> TRADER_LLAMA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("trader_llama"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> TROPICAL_FISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("tropical_fish"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> TURTLE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("turtle"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> VEX = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("vex"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> VILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("villager"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> VINDICATOR = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("vindicator"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> WANDERING_TRADER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wandering_trader"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> WITCH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("witch"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> WITHER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wither"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> WITHER_SKELETON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wither_skeleton"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> WITHER_SKULL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wither_skull"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> WOLF = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wolf"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ZOGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zoglin"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ZOMBIE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombie"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ZOMBIE_HORSE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombie_horse"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ZOMBIE_VILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombie_villager"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> ZOMBIFIED_PIGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombified_piglin"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> PLAYER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("player"));
    @SuppressWarnings("nullness")
    public static final EntityType<?> FISHING_BOBBER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fishing_bobber"));

    @RequiresNonNull("org.pistonmc.api.Piston.registryUtil")
    public static NamespacedResource getKey(EntityType<?> type) {
        return Piston.registryUtil.entityUtil.getRegisterKeyByEntityType(type);
    }

    @RequiresNonNull("org.pistonmc.api.Piston.registryUtil")
    public static Optional<EntityType<?>> byString(String registryName) {
        return Piston.registryUtil.entityUtil.getEntityTypeByString(registryName);
    }
}