package kampodev;

public class Instructor extends User{
       
	   String CoursesTaught;
	   
	  public Instructor() {
		  
	  }
	  
	  public Instructor(String coursesTaught) {
		  super();
		  this.CoursesTaught = coursesTaught;
	  }

	public String getCoursesTaught() {
		return CoursesTaught;
	}

	public void setCoursesTaught(String coursesTaught) {
		this.CoursesTaught = coursesTaught;
	}
}
