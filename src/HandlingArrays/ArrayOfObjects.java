package HandlingArrays;

public class ArrayOfObjects {
	public static void main(String args[]) {
		students[] arrStudents= new students[2];
		arrStudents[0] = new students(10, "john", "KIT");
		arrStudents[1] = new students(10, "sita", "KIT");
		
		for(int i= 0; i< arrStudents.length;i++) {
			System.out.println(arrStudents[i].name+ ":"+arrStudents[i].roll_number +":"+arrStudents[i].University);
		}
		
	}
	
	

}


class students {
	int roll_number;
	String  name;
	String University;
	
	students(int roll_number ,String name , String university){
		this.roll_number = roll_number;
		this.name= name;
		this.University= university;
	}
	
}
