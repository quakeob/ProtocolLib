/*
 *  ProtocolLib - Bukkit server library that allows access to the Minecraft protocol.
 *  Copyright (C) 2012 Kristian S. Stangeland
 *
 *  This program is free software; you can redistribute it and/or modify it under the terms of the 
 *  GNU General Public License as published by the Free Software Foundation; either version 2 of 
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with this program; 
 *  if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 
 *  02111-1307 USA
 */

package com.comphenix.protocol.injector;

/**
 * Invoked when attempting to use a player that has already logged out.
 * 
 * @author Kristian
 */
public class PlayerLoggedOutException extends RuntimeException {

	/**
	 * Generated by Eclipse.
	 */
	private static final long serialVersionUID = 4889257862160145234L;

	public PlayerLoggedOutException() {
		// Default error message
		super("Cannot inject a player that has already logged out.");
	}
	
	public PlayerLoggedOutException(String message, Throwable cause) {
		super(message, cause);
	}

	public PlayerLoggedOutException(String message) {
		super(message);
	}

	public PlayerLoggedOutException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * Construct an exception from a formatted message.
	 * @param message - the message to format.
	 * @param params - parameters.
	 * @return The formated exception
	 */
	public static PlayerLoggedOutException fromFormat(String message, Object... params) {
		return new PlayerLoggedOutException(String.format(message, params));
	}
}
