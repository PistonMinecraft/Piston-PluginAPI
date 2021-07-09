package org.pistonmc.api.event.entity.player;

import org.pistonmc.api.entity.player.PlayerEntity;
import org.pistonmc.api.inventory.Inventory;

public class PlayerOpenInventoryEvent extends PlayerEvent {
    private final Inventory inventory;
    private boolean cancelled;

    public PlayerOpenInventoryEvent(PlayerEntity player, Inventory open) {
        super(player);
        this.inventory = open;
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}