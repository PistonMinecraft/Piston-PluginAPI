package org.pistonmc.api.entity;

public enum MobCategory {
    MONSTER("monster", 70, false, false, 128),
    CREATURE("creature", 10, true, true, 128),
    AMBIENT("ambient", 15, true, false, 128),
    WATER_CREATURE("water_creature", 5, true, false, 128),
    WATER_AMBIENT("water_ambient", 20, true, false, 64),
    MISC("misc", -1, true, true, 128);

    /**
     * The max count of this category of mobs that could be spawned per chunk
     */
    public final int max;

    /**
     * Whether this category of mobs is friendly
     */
    public final boolean isFriendly;

    /**
     * Whether this category of mobs is persistent
     */
    public final boolean isPersistent;

    /**
     * The name of this category
     */
    public final String name;

    /**
     * This category of mobs won't despawn if there are any players within this distance
     */
    public final int noDespawnDistance = 32;

    /**
     * This category of mobs will despawn immediately if there are no players within this distance
     */
    public final int despawnDistance;

    MobCategory(String name, int max, boolean isFriendly, boolean isPersistent, int despawnDistance) {
        this.name = name;
        this.max = max;
        this.isFriendly = isFriendly;
        this.isPersistent = isPersistent;
        this.despawnDistance = despawnDistance;
    }
}