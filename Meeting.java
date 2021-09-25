package CalendarIterator;

import java.util.Iterator;

public class Meeting {
	Calendar eventcalendar;
	Calendar morninghour2;
	
	public Meeting( Calendar eventCalendar,Calendar morninghour2) {
		this.eventcalendar = eventCalendar;
		this.morninghour2 = morninghour2;
}

	public void printAppointment() {
		Iterator eventIterator = eventcalendar.createIterator();
		Iterator morningIterator = morninghour2.createIterator();

		System.out.println("APPOINTMENT\n----\nMORNINGHOUR1");
		printAppointment(eventIterator);
		System.out.println("\nHOUR2");
		printAppointment(morningIterator);
	
	}
	
	private void printAppointment(Iterator iterator) {
		while (iterator.hasNext()) {
			Calendar menuItem = (Calendar) iterator.next();
			Calendar calendar = new Calendar();
			System.out.print(calendar.getName() + ", ");
			System.out.print(calendar.getTime() + " -- ");
			System.out.println(calendar.getDescription());
		}
	}
	public void printMorninghourCalendar() {
		printVegetarianMenu(eventcalendar.createIterator());
		printVegetarianMenu(morninghour2.createIterator());
	}
	
	public boolean addmorninghourEvent(String name) {
		Iterator morninghour1Iterator = eventcalendar.createIterator();
		if (addMorninghour(name, morninghour1Iterator)) {
			return true;
		}
		Iterator morningIterator = morninghour2.createIterator();
		if (addMorninghour(name, morningIterator)) {
			return true;
		}
		return false;
	}


	private void printMorninghourAppointment(Iterator1 iterator) {
		while (iterator.hasEvent()) {
			Calendar calendar = new Calendar();
			if (calendar.needsMorninghour()) {
				System.out.print(calendar.getName());
				System.out.println("\t\t" + calendar.getTime());
				System.out.println("\t" + calendar.getDescription());
			}
		}
	}
	
	private boolean addMorninghour(String name, Iterator1 iterator) {
		while (iterator.hasEvent()) {
			Calendar calendar = new Calendar();
			if (calendar.getName().equals(name)) {
				if (calendar.needsMorninghour()) {
					return true;
				}
			}
		}
		return false;
	}
}