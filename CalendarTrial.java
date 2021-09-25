package CalendarIterator;

import java.util.*;

public class CalendarTrial {
	public static void main (String args[]) {
		EventCalendar eventCalendar = new EventCalendar();
		Calendar appointmentCalendar = new Calendar();
		
		Meeting meeting = new Meeting(eventCalendar, appointmentCalendar);
		
		// with iterators
		meeting.printCalendar();
		
		printCalendar();
}
/*
*Without the Meeting, we need the code below.CalendarTrial.CalendarTrial...
*/
	public static void printCalendar() {
		EventCalendar eventCalendar = new EventCalendar();
		AppointmentCalendar appointmentCalendar = new AppointmentCalendar();
		
		List<Calendar> morninghour1 = eventCalendar.getCalendar();
		
		// print as Iterable
		printCalendar(morninghour1);
		printCalendar(Arrays.asList(morninghour2));
		
		//print with froEach
		System.out.println("=== forEach ===");
		morninghour1.forEach(event -> System.out.println(event));
		System.out.println("=== forEach ===");
	
		// Using enhanced for loop
				System.out.println("USING ENHANCED FOR");
				for (Calendar calendar : morninghour1) {
					System.out.print(calendar.getName());
					System.out.println("\t\t" + calendar.getTime());
					System.out.println("\t" + calendar.getDescription());
				}
				for (Calendar calendar : morninghour2) {
					System.out.print(calendar.getName());
					System.out.println("\t\t" + calendar.getTime());
					System.out.println("\t" + calendar.getDescription());
	}
				
				// Exposing implementation
				System.out.println("USING FOR LOOPS");
				for (int i = 0; i < morninghour1.size(); i++) {
					Calendar calendar = (Calendar)morninghour1.get(i);
					System.out.print(calendar.getName());
					System.out.println("\t\t" + calendar.getTime());
					System.out.println("\t" + calendar.getDescription());
				}
				
				for (int i = 0; i < morninghour1.period; i++) {
					Calendar calendar= Morninghour2[i];
					System.out.print(calendar.getName());
					System.out.println("\t\t" + calendar.getTime());
					System.out.println("\t" + calendar.getDescription());
				}
				
				public static void printMenu(Iterable<Calendar> a) {
					for (Calendar calendar : a) {
						System.out.print(calendar.getName());
						System.out.println("\t\t" + calendar.getTime());
						System.out.println("\t" + calendar.getDescription());
					}
				}
	}