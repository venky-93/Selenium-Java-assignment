package week4.day1;

public class Department extends Student {
	
	public void deptName() {
		System.out.println("Department name is");
	}
	
	public static void main(String[] args) {
		Department obj = new Department();
		obj.studentDept();
		obj.deptName();
	}

}
