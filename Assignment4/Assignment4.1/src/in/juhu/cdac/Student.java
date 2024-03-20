package in.juhu.cdac;

public class Student {
	
		String Name; 
		int age;  
		String gender;
		int Rollno;

		public void displayDetails() {
			System.out.println("Name    : "+Name); 
			System.out.println("Age     : "+age); 
			System.out.println("Gender  : "+gender);
			System.out.println("Roll no : "+Rollno);
		}

		public static void main(String[] args) { 
			Student s1= new Student();
			s1.Name= "Sourabh Patil";
			s1.age=22;
			s1.gender= "Male";
            s1.Rollno=69;
            s1.displayDetails();

		}	
	}

