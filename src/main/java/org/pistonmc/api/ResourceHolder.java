package org.pistonmc.api;

import manifold.ext.props.rt.api.val;

@FunctionalInterface
public interface ResourceHolder {
    @val NamespacedResource resource;
}