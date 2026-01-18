
public class StudentMain {
	public static void main(String[] args) {

		Student S1 = new Student();
		S1.studentId = 01;
		S1.name = "Raj";
		S1.age = 22;
		S1.course = "CSE";
		S1.year = 2022;
		S1.marks = 65.70;
		// **************************//
		Student S2 = new Student();
		S2.studentId = 2;
		S2.name = "Ram";
		S2.age = 21;
		S2.course = "CSE";
		S2.year = 2022;
		S2.marks = 70.70;
		// *************************//
		Student S3 = new Student();
		S3.studentId = 3;
		S3.name = "Sham";
		S3.age = 24;
		S3.course = "CSE";
		S3.year = 2022;
		S3.marks = 77.70;
		// ************************//
		Student S4 = new Student();
		S4.studentId = 4;
		S4.name = "lakhan";
		S4.age = 23;
		S4.course = "CSE";
		S4.year = 2022;
		S4.marks = 80.70;
		
		
		S1.display();
		S2.display();
		S3.display();
		S4.display();
	}
}
