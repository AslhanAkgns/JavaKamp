package kampodeviki;

public class Course {

	public Course() {
		System.out.println("the program is running");
		
	}
	
	public Course(int id, String name, String time, String instructorName) {
		
		this();
		this.id = id;
		this.name = name;
		this.time = time;
		this.instructorName = instructorName;
		
	}
	
	int id;
	String name;
	String time;
	String instructorName;
	
	
	
}
