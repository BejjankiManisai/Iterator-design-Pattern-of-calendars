package CalendarIterator;

public class Morninghour2 implements Appointment {
	static final int MAX_EVENTS = 6;
	int numberOfEvents = 0;
	Calendar[] calendars;
  
	
	public void addeVENT(String name, String description, 
            boolean Morninghour, double time) 
{
Calendar calendar = new Calendar(name, description, morninghour, time);
if (numberOfEvents >= MAX_EVENTS) {
System.err.println("Sorry, appointment is full!  Can't add event to appointment");
} else {
calendar[numberOfEvents] = calendar;
numberOfEvents = numberOfEvents + 1;
}
}

public Calendar[] getCalendar() {
return calendar;
}

public Iterator createIterator() {
return new Morninghour2Iterator(menuItems);
// To test Alternating menu items, comment out above line,
// and uncomment the line below.
//return new AlternatingDinerMenuIterator(menuItems);
}

// other menu methods here
}