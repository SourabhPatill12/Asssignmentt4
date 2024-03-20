package in.juhu.cdac;

import java.util.Scanner;

public class Employee {
	String eName;
    int eId;
    double Salary;

       public void AcceptInfo() {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter Employee Name : ");
    	   eName=sc.nextLine();
    	   System.out.println("Enter Employee Id : ");
    	   eId =sc.nextInt();
    	   System.out.println("Enter Employee Salary: ");
    	   Salary =sc.nextDouble();
    	   sc.close();
       }
       public void DisplayInfo(String eName) {
    	   System.out.println("Employee Name: "+eName);
       }

       public void DisplayInfo(int eld) {
    	   System.out.println(" Employee Id: "+eId);
       }

       public void DisplayInfo(double Salary) { 
    	   System.out.println("Employee Salary: "+Salary);
       }

       public static void main(String[] args) {

       Employee e=new Employee(); e.AcceptInfo();

       e.DisplayInfo(e.eId);

       e.DisplayInfo(e.eName);

       e.DisplayInfo(e.Salary);
       }
	

}
