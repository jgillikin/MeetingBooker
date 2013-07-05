package com.desc.meetingbooker;

import java.util.Comparator;

/**
 * A Class used when sorting the array of events
 * 
 * @author Carl Johnsen
 * @version 1.0
 * @since 04-04-2013
 */
public final class CustomComparator implements Comparator<CalEvent> {
	
	@Override
	public final int compare(final CalEvent e1, final CalEvent e2) {
		return e1.startTime.compareTo(e2.startTime);
	}
	
}