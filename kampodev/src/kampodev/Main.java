package kampodev;

public class Main {

	public static void main(String[] args) {
	      
	
		Student student = new Student ();
		 student.setId(1);
		 student.setFirstName("Asl�han");
		 student.setLastName("Akg�ne�");
		 student.setEmail("aslhan@gmail.com");
		 student.setChosenCourses("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		 
		 
	   Instructor instructor = new Instructor ();
	     instructor.setId(1);
	     instructor.setFirstName("Engin");
	     instructor.setLastName("Demirog");
	     instructor.setCoursesTaught("Java & react");
	     
	   StudentManager studentManager = new StudentManager();
	     studentManager.addLesson(student);
	     
	   InstructorManager instructorManager = new InstructorManager();
	     instructorManager.addCourses(instructor);
	     

	}

}
