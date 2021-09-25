package CalendarIterator;

public class Calendar {
	
	String name;
	
	String description;
	
	boolean morninghour;
	
	double time;
	
	public Calendar(String name,String description,boolean morninghour,double time) {
		
		this.name = name;
		
		this.description = description;
		
		this.morninghour = morninghour;
		
		this.time = time;
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String getDescription() {
		
		return description;
		
	}
	
	public boolean needsMorninghour() {
		
		return morninghour;
		
	}
	
	public double neededTime() {
		
		return time;
	}
	
	public String toString() {
		
		return (name + ",AM" + time + "/n " + description);
	}

	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}
}
