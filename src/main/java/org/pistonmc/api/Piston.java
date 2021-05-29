package org.pistonmc.api;

import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.pistonmc.api.util.RegistryUtil;

public class Piston {
    public static @MonotonicNonNull Server server;

    public static @MonotonicNonNull RegistryUtil registryUtil;
}