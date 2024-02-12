package week4.day1;

public class College extends Student {
	
	public void collegename() {
		System.out.println("College name is");
	}

	public void collegeCode() {
		System.out.println("Dress code is");
	}
	
	public void collegeRank() {
		System.out.println("College Rank is");
	}
	public static void main(String[] args) {
		College obj1 = new College();
		obj1.studentName();
		obj1.studentDept();
		obj1.studentId();
		obj1.collegeRank();
	}

}
