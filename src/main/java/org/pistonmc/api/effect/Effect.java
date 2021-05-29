package org.pistonmc.api.effect;

public interface Effect {
    EffectType getEffectType();
    short getEffectLevel();
    int remainTime();
}