package org.pistonmc.api.entity;

import org.pistonmc.api.NamespacedResource;
import org.pistonmc.api.Piston;

import java.util.Objects;
import java.util.Optional;

public class EntityTypes {
    static {
        Objects.requireNonNull(Piston.registryUtil, "PistonInternalRegistryUtil hasn't been initialized yet");
    }
    public static final EntityType<?> AREA_EFFECT_CLOUD = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("area_effect_cloud"));
    public static final EntityType<?> ARMOR_STAND = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("armor_stand"));
    public static final EntityType<?> ARROW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("arrow"));
    public static final EntityType<?> BAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("bat"));
    public static final EntityType<?> BEE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("bee"));
    public static final EntityType<?> BLAZE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("blaze"));
    public static final EntityType<?> BOAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("boat"));
    public static final EntityType<?> CAT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cat"));
    public static final EntityType<?> CAVE_SPIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cave_spider"));
    public static final EntityType<?> CHICKEN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("chicken"));
    public static final EntityType<?> COD = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cod"));
    public static final EntityType<?> COW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("cow"));
    public static final EntityType<?> CREEPER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("creeper"));
    public static final EntityType<?> DOLPHIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("dolphin"));
    public static final EntityType<?> DONKEY = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("donkey"));
    public static final EntityType<?> DRAGON_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("dragon_fireball"));
    public static final EntityType<?> DROWNED = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("drowned"));
    public static final EntityType<?> ELDER_GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("elder_guardian"));
    public static final EntityType<?> END_CRYSTAL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("end_crystal"));
    public static final EntityType<?> ENDER_DRAGON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ender_dragon"));
    public static final EntityType<?> ENDERMAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("enderman"));
    public static final EntityType<?> ENDERMITE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("endermite"));
    public static final EntityType<?> EVOKER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("evoker"));
    public static final EntityType<?> EVOKER_FANGS = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("evoker_fangs"));
    public static final EntityType<?> EXPERIENCE_ORB = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("experience_orb"));
    public static final EntityType<?> EYE_OF_ENDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("eye_of_ender"));
    public static final EntityType<?> FALLING_BLOCK = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("falling_block"));
    public static final EntityType<?> FIREWORK_ROCKET = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("firework_rocket"));
    public static final EntityType<?> FOX = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fox"));
    public static final EntityType<?> GHAST = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ghast"));
    public static final EntityType<?> GIANT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("giant"));
    public static final EntityType<?> GUARDIAN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("guardian"));
    public static final EntityType<?> HOGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("hoglin"));
    public static final EntityType<?> HORSE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("horse"));
    public static final EntityType<?> HUSK = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("husk"));
    public static final EntityType<?> ILLUSIONER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("illusioner"));
    public static final EntityType<?> IRON_GOLEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("iron_golem"));
    public static final EntityType<?> ITEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("item"));
    public static final EntityType<?> ITEM_FRAME = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("item_frame"));
    public static final EntityType<?> FIREBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fireball"));
    public static final EntityType<?> LEASH_KNOT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("leash_knot"));
    public static final EntityType<?> LIGHTNING_BOLT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("lightning_bolt"));
    public static final EntityType<?> LLAMA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("llama"));
    public static final EntityType<?> LLAMA_SPIT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("llama_spit"));
    public static final EntityType<?> MAGMA_CUBE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("magma_cube"));
    public static final EntityType<?> MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("minecart"));
    public static final EntityType<?> CHEST_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("chest_minecart"));
    public static final EntityType<?> COMMAND_BLOCK_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("command_block_minecart"));
    public static final EntityType<?> FURNACE_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("furnace_minecart"));
    public static final EntityType<?> HOPPER_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("hopper_minecart"));
    public static final EntityType<?> SPAWNER_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("spawner_minecart"));
    public static final EntityType<?> TNT_MINECART = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("tnt_minecart"));
    public static final EntityType<?> MULE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("mule"));
    public static final EntityType<?> MOOSHROOM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("mooshroom"));
    public static final EntityType<?> OCELOT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ocelot"));
    public static final EntityType<?> PAINTING = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("painting"));
    public static final EntityType<?> PANDA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("panda"));
    public static final EntityType<?> PARROT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("parrot"));
    public static final EntityType<?> PHANTOM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("phantom"));
    public static final EntityType<?> PIG = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pig"));
    public static final EntityType<?> PIGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("piglin"));
    public static final EntityType<?> PIGLIN_BRUTE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("piglin_brute"));
    public static final EntityType<?> PILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pillager"));
    public static final EntityType<?> POLAR_BEAR = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("polar_bear"));
    public static final EntityType<?> TNT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("tnt"));
    public static final EntityType<?> PUFFERFISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("pufferfish"));
    public static final EntityType<?> RABBIT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("rabbit"));
    public static final EntityType<?> RAVAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ravager"));
    public static final EntityType<?> SALMON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("salmon"));
    public static final EntityType<?> SHEEP = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("sheep"));
    public static final EntityType<?> SHULKER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("shulker"));
    public static final EntityType<?> SHULKER_BULLET = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("shulker_bullet"));
    public static final EntityType<?> SILVERFISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("silverfish"));
    public static final EntityType<?> SKELETON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("skeleton"));
    public static final EntityType<?> SKELETON_HORSE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("skeleton_horse"));
    public static final EntityType<?> SLIME = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("slime"));
    public static final EntityType<?> SMALL_FIREBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("small_fireball"));
    public static final EntityType<?> SNOW_GOLEM = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("snow_golem"));
    public static final EntityType<?> SNOWBALL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("snowball"));
    public static final EntityType<?> SPECTRAL_ARROW = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("spectral_arrow"));
    public static final EntityType<?> SPIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("spider"));
    public static final EntityType<?> SQUID = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("squid"));
    public static final EntityType<?> STRAY = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("stray"));
    public static final EntityType<?> STRIDER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("strider"));
    public static final EntityType<?> EGG = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("egg"));
    public static final EntityType<?> ENDER_PEARL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("ender_pearl"));
    public static final EntityType<?> EXPERIENCE_BOTTLE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("experience_bottle"));
    public static final EntityType<?> POTION = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("potion"));
    public static final EntityType<?> TRIDENT = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("trident"));
    public static final EntityType<?> TRADER_LLAMA = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("trader_llama"));
    public static final EntityType<?> TROPICAL_FISH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("tropical_fish"));
    public static final EntityType<?> TURTLE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("turtle"));
    public static final EntityType<?> VEX = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("vex"));
    public static final EntityType<?> VILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("villager"));
    public static final EntityType<?> VINDICATOR = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("vindicator"));
    public static final EntityType<?> WANDERING_TRADER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wandering_trader"));
    public static final EntityType<?> WITCH = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("witch"));
    public static final EntityType<?> WITHER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wither"));
    public static final EntityType<?> WITHER_SKELETON = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wither_skeleton"));
    public static final EntityType<?> WITHER_SKULL = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wither_skull"));
    public static final EntityType<?> WOLF = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("wolf"));
    public static final EntityType<?> ZOGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zoglin"));
    public static final EntityType<?> ZOMBIE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombie"));
    public static final EntityType<?> ZOMBIE_HORSE = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombie_horse"));
    public static final EntityType<?> ZOMBIE_VILLAGER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombie_villager"));
    public static final EntityType<?> ZOMBIFIED_PIGLIN = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("zombified_piglin"));
    public static final EntityType<?> PLAYER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("player"));
    public static final EntityType<?> FISHING_BOBBER = Piston.registryUtil.entityUtil.getEntityType(NamespacedResource.minecraft("fishing_bobber"));

    public static NamespacedResource getKey(EntityType<?> type) {
        return Piston.registryUtil.entityUtil.getRegisterKeyByEntityType(type);
    }

    public static Optional<EntityType<?>> byString(String registryName) {
        return Piston.registryUtil.entityUtil.getEntityTypeByString(registryName);
    }
}