package org.pistonmc.api.plugin.event.player;

import org.pistonmc.api.plugin.entity.player.PlayerEntity;
import org.pistonmc.api.plugin.inventory.Inventory;

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