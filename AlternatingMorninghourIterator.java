package CalendarIterator;

import java.util.Calendar; 

public class AlternatingMorninghourIterator implements Iterator {
	Calendar[] list;
	int position;

	public AlternatingMorninghourIterator(Calendar[] list) {
		this.list = list;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public Calendar next() {
		Calendar calendar = list[position];
		position = position + 2;
		return calendar;
	}
	public boolean has Event() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternating Morning Hour Iterator";
	}
}
