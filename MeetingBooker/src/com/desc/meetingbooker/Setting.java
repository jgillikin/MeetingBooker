package com.desc.meetingbooker;

/**
 * A class that represents a setting in the settingsactivity
 * 
 * @author Carl Johnsen
 * @since 28-06-2013
 * @version 1.0
 */
public final class Setting {
	
	protected final 	String description;
	protected final 	String name;
	protected 			String value;
	protected final 	String valueType;
	
	/**
	 * Constructs a new Setting object, that is either a String,
	 * or a number wrapped in a string
	 * 
	 * @param name The name of the setting
	 * @param value The value linked to the name
	 * @param valueType The type of the value
	 * @param desc The description of the Setting
	 */
	public Setting(final String name, 
			final String value, 
			final String valueType,
			final String description) {
		this.description 	= description;
		this.name 			= name;
		this.value 			= value;
		this.valueType 		= valueType;
	}
	
	public String toString() {
		return name + " " + value;
	}

}
