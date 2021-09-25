package CalendarIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator implements Iterator {
	ArrayList<Calendar> events;
	int position = 0;
 
	public ArrayListIterator(ArrayList<Calendar> items) {
		this.events = events;
	}
 
	public Calendar event() {
		Calendar event = events.get(position);
		position = position + 1;
		return event;
	}
 
	public boolean hasEvent() {
		if (position >= events.size()) {
			return false;
		} else {
			return true;
		}
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



