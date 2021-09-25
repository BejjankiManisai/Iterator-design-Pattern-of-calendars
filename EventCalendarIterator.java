package CalendarIterator;

import java.util.List;

public class EventCalendarIterator {
	List<Calendar> Events;
	int position = 0;
	
	public EventCalendarIterator(List<Calendar> events) {
		this.Events = events;
}

	public Calendar next() {
		/* 
		Calendar event = events.get(position);
		position = position + 1;
		return event;
		*/
		// or shorten to:
		return Events.get(position++);
	}
	
	public boolean hasEvent() {
		/*
		if (position >= events.size()) {
			return false;
		} else {
			return true;
		}
		*/
		// or shorten to:
		return Events.size() > position;
	}
}
