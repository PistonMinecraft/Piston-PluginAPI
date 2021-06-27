package org.pistonmc.api.entity.player;

import org.pistonmc.api.entity.LivingEntity;
import org.pistonmc.api.inventory.Inventory;

public interface PlayerEntity extends LivingEntity {
    float getHunger();
    Inventory getInventory();
    void ban();
    void unBan();
    void banIP();
    String getIP();
    void unBanIP();
    float getExp();
    void setExp(float exp);
    Inventory getArmor();
}