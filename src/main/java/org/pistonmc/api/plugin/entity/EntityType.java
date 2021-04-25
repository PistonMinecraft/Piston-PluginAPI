package org.pistonmc.api.plugin.entity;

import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.val;
import net.kyori.adventure.text.Component;
import org.pistonmc.api.plugin.NamespacedResource;

public enum EntityType implements IEntityType {
    AREA_EFFECT_CLOUD("area_effect_cloud", MobCategory.MISC),
    ARMOR_STAND("armor_stand", MobCategory.MISC),
    ARROW("arrow", MobCategory.MISC),
    BAT("bat", MobCategory.AMBIENT),
    BEE("bee", MobCategory.CREATURE),
    BLAZE("blaze", MobCategory.MONSTER),
    BOAT("boat", MobCategory.MISC),
    CAT("cat", MobCategory.CREATURE),
    CAVE_SPIDER("cave_spider", MobCategory.MONSTER),
    CHICKEN("chicken", MobCategory.CREATURE),
    COD("cod", MobCategory.WATER_AMBIENT),
    COW("cow", MobCategory.CREATURE),
    CREEPER("creeper", MobCategory.MONSTER),
    DOLPHIN("dolphin", MobCategory.WATER_CREATURE),
    DONKEY("donkey", MobCategory.CREATURE),
    DRAGON_FIREBALL("dragon_fireball", MobCategory.MISC),
    DROWNED("drowned", MobCategory.MONSTER),
    ELDER_GUARDIAN("elder_guardian", MobCategory.MONSTER),
    END_CRYSTAL("end_crystal", MobCategory.MISC),
    ENDER_DRAGON("ender_dragon", MobCategory.MONSTER),
    ENDERMAN("enderman", MobCategory.MONSTER),
    ENDERMITE("endermite", MobCategory.MONSTER),
    EVOKER("evoker", MobCategory.MONSTER),
    EVOKER_FANGS("evoker_fangs", MobCategory.MISC),
    EXPERIENCE_ORB("experience_orb", MobCategory.MISC),
    EYE_OF_ENDER("eye_of_ender", MobCategory.MISC),
    FALLING_BLOCK("falling_block", MobCategory.MISC),
    FIREWORK_ROCKET("firework_rocket", MobCategory.MISC),
    FOX("fox", MobCategory.CREATURE),
    GHAST("ghast", MobCategory.MONSTER),
    GIANT("giant", MobCategory.MONSTER),
    GUARDIAN("guardian", MobCategory.MONSTER),
    HOGLIN("hoglin", MobCategory.MONSTER),
    HORSE("horse", MobCategory.CREATURE),
    HUSK("husk", MobCategory.MONSTER),
    ILLUSIONER("illusioner", MobCategory.MONSTER),
    IRON_GOLEM("iron_golem", MobCategory.MISC),
    ITEM("item", MobCategory.MISC),
    ITEM_FRAME("item_frame", MobCategory.MISC),
    FIREBALL("fireball", MobCategory.MISC),
    LEASH_KNOT("leash_knot", MobCategory.MISC),
    LIGHTNING_BOLT("lightning_bolt", MobCategory.MISC),
    LLAMA("llama", MobCategory.CREATURE),
    LLAMA_SPIT("llama_spit", MobCategory.MISC),
    MAGMA_CUBE("magma_cube", MobCategory.MONSTER),
    MINECART("minecart", MobCategory.MISC),
    CHEST_MINECART("chest_minecart", MobCategory.MISC),
    COMMAND_BLOCK_MINECART("command_block_minecart", MobCategory.MISC),
    FURNACE_MINECART("furnace_minecart", MobCategory.MISC),
    HOPPER_MINECART("hopper_minecart", MobCategory.MISC),
    SPAWNER_MINECART("spawner_minecart", MobCategory.MISC),
    TNT_MINECART("tnt_minecart", MobCategory.MISC),
    MULE("mule", MobCategory.CREATURE),
    MOOSHROOM("mooshroom", MobCategory.CREATURE),
    OCELOT("ocelot", MobCategory.CREATURE),
    PAINTING("painting", MobCategory.MISC),
    PANDA("panda", MobCategory.CREATURE),
    PARROT("parrot", MobCategory.CREATURE),
    PHANTOM("phantom", MobCategory.MONSTER),
    PIG("pig", MobCategory.CREATURE),
    PIGLIN("piglin", MobCategory.MONSTER),
    PIGLIN_BRUTE("piglin_brute", MobCategory.MONSTER),
    PILLAGER("pillager", MobCategory.MONSTER),
    POLAR_BEAR("polar_bear", MobCategory.CREATURE),
    TNT("tnt", MobCategory.MISC),
    PUFFERFISH("pufferfish", MobCategory.WATER_AMBIENT),
    RABBIT("rabbit", MobCategory.CREATURE),
    RAVAGER("ravager", MobCategory.MONSTER),
    SALMON("salmon", MobCategory.WATER_AMBIENT),
    SHEEP("sheep", MobCategory.CREATURE),
    SHULKER("shulker", MobCategory.MONSTER),
    SHULKER_BULLET("shulker_bullet", MobCategory.MISC),
    SILVERFISH("silverfish", MobCategory.MONSTER),
    SKELETON("skeleton", MobCategory.MONSTER),
    SKELETON_HORSE("skeleton_horse", MobCategory.CREATURE),
    SLIME("slime", MobCategory.MONSTER),
    SMALL_FIREBALL("small_fireball", MobCategory.MISC),
    SNOW_GOLEM("snow_golem", MobCategory.MISC),
    SNOWBALL("snowball", MobCategory.MISC),
    SPECTRAL_ARROW("spectral_arrow", MobCategory.MISC),
    SPIDER("spider", MobCategory.MONSTER),
    SQUID("squid", MobCategory.WATER_CREATURE),
    STRAY("stray", MobCategory.MONSTER),
    STRIDER("strider", MobCategory.CREATURE),
    EGG("egg", MobCategory.MISC),
    ENDER_PEARL("ender_pearl", MobCategory.MISC),
    EXPERIENCE_BOTTLE("experience_bottle", MobCategory.MISC),
    POTION("potion", MobCategory.MISC),
    TRIDENT("trident", MobCategory.MISC),
    TRADER_LLAMA("trader_llama", MobCategory.CREATURE),
    TROPICAL_FISH("tropical_fish", MobCategory.WATER_AMBIENT),
    TURTLE("turtle", MobCategory.CREATURE),
    VEX("vex", MobCategory.MONSTER),
    VILLAGER("villager", MobCategory.MISC),
    VINDICATOR("vindicator", MobCategory.MONSTER),
    WANDERING_TRADER("wandering_trader", MobCategory.CREATURE),
    WITCH("witch", MobCategory.MONSTER),
    WITHER("wither", MobCategory.MONSTER),
    WITHER_SKELETON("wither_skeleton", MobCategory.MONSTER),
    WITHER_SKULL("wither_skull", MobCategory.MISC),
    WOLF("wolf", MobCategory.CREATURE),
    ZOGLIN("zoglin", MobCategory.MONSTER),
    ZOMBIE("zombie", MobCategory.MONSTER),
    ZOMBIE_HORSE("zombie_horse", MobCategory.CREATURE),
    ZOMBIE_VILLAGER("zombie_villager", MobCategory.MONSTER),
    ZOMBIFIED_PIGLIN("zombified_piglin", MobCategory.MONSTER),
    PLAYER("player", MobCategory.MISC),
    FISHING_BOBBER("fishing_bobber", MobCategory.MISC),
    UNKNOWN(null, null);

    @override @val NamespacedResource id;
    @override @val MobCategory category;
    private final boolean canSummon;
    private final boolean fireImmune;
    private final boolean canSpawnFarFromPlayer;
    @override @val String descriptionId;
    @override @val Component description;
    @override @val NamespacedResource defaultLootTable;

    EntityType(String name, MobCategory category) {
        this.id = NamespacedResource.minecraft(name);
        this.category = category;
        this.canSummon = IEntityType.super.canSummon();
        this.fireImmune = IEntityType.super.fireImmune();
        this.canSpawnFarFromPlayer = IEntityType.super.canSpawnFarFromPlayer();
        this.descriptionId = IEntityType.super.getDescriptionId();
        this.description = IEntityType.super.getDescription();
        this.defaultLootTable = IEntityType.super.getDefaultLootTable();
    }

    @Override
    public boolean canSummon() {
        return canSummon;
    }

    @Override
    public boolean fireImmune() {
        return fireImmune;
    }

    @Override
    public boolean canSpawnFarFromPlayer() {
        return canSpawnFarFromPlayer;
    }

    @Override
    public String toString() {
        return descriptionId;
    }
}