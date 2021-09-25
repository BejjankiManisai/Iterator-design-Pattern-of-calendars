package CalendarIterator;

import java.util.ArrayList;
import java.util.List;

public class EventCalendar implements Calendar {
	List<Calendar> calendar;
	
	public EventCalendar() {
		calendar = new ArrayList<Calendar>();
		
		addEvent("Appointment with Insurance Company", 
				"Claim of Car Accidental Insurance", 
				true,
				10.35);
		
		addEvent("Regular Appointment with Bank", 
				"Household Mortgage, Loans", 
				false,
				11.15);
		
		addEvent("Visiting Carmax",
				"To make a visit to sell car",
				true,
				11.20);
			
		addEvent("Poppeye's",
				"Get food to your belly",
				true,
				3.59);
	}
	
	public void addEvent(String name, String description,
            boolean morninghour, double time)
	{
		Calendar calendar = new Calendar(name, description, morninghour, time);
		calendar.add(calendar);
	}
 
	public List<Calendar> getCalendar() {
		return calendar;
	}

	public Iterator createIterator() {
		return new CalendarTrial(calendar);
	}
  
	public String toString() {
		return "Objectville CalendarTrial";
	}

	// other event methods here
}
