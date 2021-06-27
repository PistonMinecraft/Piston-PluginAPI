package org.pistonmc.api.event.entity;

import org.pistonmc.api.entity.Entity;
import org.pistonmc.api.entity.ItemEntity;

public class EntityThrowItemEvent extends EntityEvent {
    private final ItemEntity item;

    public EntityThrowItemEvent(Entity entity, ItemEntity item) {
        super(entity);
        this.item = item;
    }

    /**
     * 返回被丢出的物品
     * @return 被丢出的物品
     */
    public ItemEntity getItem() {
        return item;
    }
}