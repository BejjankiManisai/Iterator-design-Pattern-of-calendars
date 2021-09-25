package CalendarIterator;

import java.util.Iterator;

public class Morninghour2Iterator implements Iterator {
	Calendar[] events;
	int position = 0;

	public Morninghour2Iterator(Calendar[] events) {
		this.events = events;
}

	public Calendar event() {
		/*
		Calendar calendar = events[position];
		position = position + 1;
		return calendar;
		*/
		
		// or shorten to 
		return events[position++];
	}
 
	public boolean hasEvent() {
		/*
		if (position >= events.length || events[position] == null) {
			return false;
		} else {
			return true;
		}
		*/
		
		// or shorten to
		return events.length > position;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
}
