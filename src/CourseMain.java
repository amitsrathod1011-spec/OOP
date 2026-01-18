
public class CourseMain {
	public static void main(String[] args) {
		Course java=new Course();
		java.courseId=1;
		java.courseName="Java full stack";
		java.duration=6;
		java.fees=25000;
		
		Course python=new Course();
		python.courseId=1;
		python.courseName="Java full stack";
		python.duration=6;
		python.fees=25000;
		
		java.display();
		python.display();
	}
}
