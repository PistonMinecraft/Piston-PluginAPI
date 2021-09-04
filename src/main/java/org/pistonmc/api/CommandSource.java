/*
 * Piston's Lite Modding (to Minecraft) API. Also known as Piston Plugin API.
 * Copyright (C) 2021 PistonMC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.pistonmc.api;

import net.kyori.adventure.audience.Audience;

/**
 * Represents something that could
 * execute commands and receive messages
 */
public interface CommandSource extends Audience {
    /**
     * A NULL CommandSource does nothing
     */
    CommandSource NULL = new CommandSource() {
        public boolean acceptsSuccess() { return false; }
        public boolean acceptsFailure() { return false; }
        public boolean shouldInformAdmins() { return false; }
    };

    /**
     * Gets whether to send the success output of the command to this {@link CommandSource}
     * @return if send the success output of the command to this {@link CommandSource}
     */
    boolean acceptsSuccess();

    /**
     * Gets whether to send the fail output of the command to this {@link CommandSource}
     * @return if should send the fail output of the command to this {@link CommandSource}
     */
    boolean acceptsFailure();

    /**
     * Gets whether to inform the success output of the command to admins
     * @return if should inform the success output of the command to admins
     */
    boolean shouldInformAdmins();
}