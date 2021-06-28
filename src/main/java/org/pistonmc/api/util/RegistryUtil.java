package org.pistonmc.api.util;

import manifold.ext.props.rt.api.val;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.pistonmc.api.NamespacedResource;
import org.pistonmc.api.entity.EntityType;

import java.util.Optional;

@ApiStatus.Internal
public interface RegistryUtil {
    @ApiStatus.Internal
    interface EntityUtil {
        <T extends org.pistonmc.api.entity.Entity> EntityType<T> getEntityType(NamespacedResource registryName);
        NamespacedResource getRegisterKeyByEntityType(EntityType<?> type);
        Optional<EntityType<?>> getEntityTypeByString(String name);
    }
    @val @NotNull EntityUtil entityUtil;
}