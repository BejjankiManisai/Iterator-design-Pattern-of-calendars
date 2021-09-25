package CalendarIterator;

public class ArrayIterator implements Iterator {
	Calendar[] events;
	int position = 0;
 
	public ArrayIterator(Calendar[] events) {
		this.events = events;
	}
 
	public Calendar event() {
		Calendar calendar = events[position];
		position = position + 1;
		return calendar;
	}
 
	public boolean has Event() {
		if (position >= events.length || events[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}


}
