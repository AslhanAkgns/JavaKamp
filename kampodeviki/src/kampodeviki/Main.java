package kampodeviki;

public class Main {
	
	public static void main(String[] args) { 
		
		Course Course1 = new Course();
		Course1.id = 1;
		Course1.name = "java + react";
		Course1.time = "two months";
		Course1.instructorName = "Engin demirog";
		
		Course Course2 = new Course();
		Course2.id = 2;
		Course2.name = "c# + angular ";
		Course2.time = "two months"	;
		Course2.instructorName = "Engin demirog";
		
		Course Course3 = new Course(3, "programlamaya giriþ", "two months","engin demirog");
		
		Course[] courses = { Course1, Course2, Course3 };
		
		for (Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.time);
		    System.out.println(course.instructorName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(Course1);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
