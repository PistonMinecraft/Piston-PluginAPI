package org.pistonmc.api.plugin.event.player;

import org.pistonmc.api.plugin.entity.player.PlayerEntity;

public class PlayerChatEvent extends PlayerEvent {
    private String message;

    public PlayerChatEvent(String message, PlayerEntity player) {
        super(player);
        this.message = message;
    }

    /**
     * 返回玩家发出的消息
     * @return 玩家发出的消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置玩家发出的消息
     * @param message 玩家发出的消息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}