package week4.day1;

//week4 day 1 Assignment 5

public class Overload {
	
	public void getStudentInfo(int id) {
		
		System.out.println(id);
		
	}
	
	public void getStudentInfo(int id , String name){
		
		System.out.println(id);
		System.out.println(name);
	
	}
	
	public void getStudentInfo(String email , double no){
	
		System.out.println(email);
		System.out.println(no);
	}

	public static void main(String[] args) {
	
		Overload obj = new Overload();
		obj.getStudentInfo(1);
		obj.getStudentInfo(1, "Sneha Vaideswaran");
		obj.getStudentInfo("snehavaideswaran@gmail.com", 8446591558d);

	}

}
