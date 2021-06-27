package org.pistonmc.api.util;

import org.pistonmc.api.NamespacedResource;

public class Util {
    public static String makeDescriptionId(String prefix, NamespacedResource resource) {
        return resource == null ? prefix + ".unregistered_sadface" :
                prefix + '.' + resource.namespace + '.' + resource.path.replace('/', '.');
    }
}