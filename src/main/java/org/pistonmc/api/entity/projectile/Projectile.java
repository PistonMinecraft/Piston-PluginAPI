package org.pistonmc.api.entity.projectile;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.pistonmc.api.entity.Entity;

public interface Projectile extends Entity {
    void setOwner(@Nullable Entity entity);
    @Nullable Entity getOwner();
}