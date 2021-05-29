package org.pistonmc.api.util;

import manifold.ext.props.rt.api.val;
import org.pistonmc.api.NamespacedResource;
import org.pistonmc.api.entity.EntityType;

import java.util.Optional;

/** This is an internal API */
public interface RegistryUtil {
    interface EntityUtil {
        <T extends org.pistonmc.api.entity.Entity> EntityType<T> getEntityType(NamespacedResource registryName);
        NamespacedResource getRegisterKeyByEntityType(EntityType<?> type);
        Optional<EntityType<?>> getEntityTypeByString(String name);
    }
    @val EntityUtil entityUtil;
}