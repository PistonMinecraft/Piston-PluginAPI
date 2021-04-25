package org.pistonmc.api.plugin.util;

import org.pistonmc.api.plugin.NamespacedResource;

public interface RegistryUtil {
    // [Relate to entity type registry]
    boolean isEntityTypeCanSummon(NamespacedResource entityKey);
    boolean isEntityTypeFireImmune(NamespacedResource entityKey);
    boolean isEntityTypeCanSpawnFarFromPlayer(NamespacedResource entityKey);
    // [Relate to entity type registry] - end
}