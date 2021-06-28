package org.pistonmc.api.event.entity;

import manifold.ext.props.rt.api.val;
import org.pistonmc.api.entity.Entity;
import org.pistonmc.api.entity.ItemEntity;

public class EntityThrowItemEvent extends EntityEvent {
    /**
     * The item have thrown
     */
    final @val ItemEntity item;

    public EntityThrowItemEvent(Entity entity, ItemEntity item) {
        super(entity);
        this.item = item;
    }
}