
public class TeacherMain {
	public static void main(String[] args) {
		Teacher T1= new Teacher();
		T1.Id=1;
		T1.name="Arun";
		T1.subject="English";
		T1.experience=2;
		T1.salary=40000;
		T1.department="CSE";
		
		//**********************//
		Teacher T2= new Teacher();
		T2.Id=2;
		T2.name="Arjun";
		T2.subject="hindi";
		T2.experience=2;
		T2.salary=50000;
		T2.department="E&TC";
		
		//*********************//
		Teacher T3= new Teacher();
		T3.Id=3;
		T3.name="Saurabh";
		T3.subject="CAD";
		T3.experience=3;
		T3.salary=40000;
		T3.department="Civil";
		
		
		Teacher T4= new Teacher();
		T4.Id=4;
		T4.name="Tushar";
		T4.subject="CAD";
		T4.experience=5;
		T4.salary=40000;
		T4.department="Mech";
		
		T1.display();
		T2.display();
		T3.display();
		T4.display();
		
	}
}
