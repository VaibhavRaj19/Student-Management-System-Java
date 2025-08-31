package ArrayListObjectBased;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		
		Studentmanager manage = new Studentmanager() ;
		Scanner sys = new Scanner(System.in);
	
		boolean ishi = true;
		while(ishi) {
			
			System.out.println("\nStudent Management System");
			System.out.println("Press 1 (Add Student)");
			System.out.println("Press 2 (Display Student)");
			System.out.println("Press 3 (Sort Student)");
			System.out.println("Press 4 (Update Pass/Fail)");
			System.out.println("Press 5 (Remove Student)");
			System.out.println("Press 6 (EXIT)");
			
			System.out.print("Enter Your Choice : ");
			int choice = sys.nextInt();
			sys.nextLine();
			
			switch(choice) {
			    case 1:
			    	manage.addStudent();
			    	break;
			    case 2:
			    	manage.displayStudent();
			    	break;
			    case 3:
			    	manage.sortStudent();
			    	manage.displayStudent();
			    	break;
			    case 4:
			    	manage.updatePassOrFail();
			    	manage.displayStudent();
			    	break;
			    case 5: 
			    	manage.removeStudent();
			    	manage.displayStudent();
			    	break;
			    case 6:
			    	System.out.println("Exiting... Goodbye!");
			    	ishi = false;
			    	break;
			    default :
			    	System.out.println("❌ Choose Correct Option");
			}
		}
	}
}
