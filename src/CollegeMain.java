
public class CollegeMain {
	public static void main(String[] args) {
		College MIT=new College();
			MIT.city="Solapur";
			MIT.collegeName="MIT";
			MIT.totalStudents= 550;
			MIT.totalTeachers=   25   ;
			MIT.grade="A";
	//***********************************//
			
		College MGM=new College();
		MGM.city="Latur";
		MGM.collegeName="MGM";
		MGM.totalStudents= 560;
		MGM.totalTeachers=   35   ;
		MGM.grade="A";
	//***********************************//		
			
			
	MIT.display();
	MGM.display();
	}
}
