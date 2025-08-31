package ArrayListObjectBased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Studentmanager {
	
	ArrayList<Student> std;
	Scanner scanner;

	public Studentmanager() {
		this.std = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}
	
	// Add Student Data (Dynamic user input)
	public void addStudent() {
		System.out.print("Enter Roll No: ");
		int rollno = scanner.nextInt();
		scanner.nextLine(); // consume newline
		
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Course: ");
		String course = scanner.nextLine();
		
		System.out.print("Enter Marks: ");
		float mark = scanner.nextFloat();
		
		Student s = new Student(rollno, name, course, mark);
		std.add(s);
		
		System.out.println("✅ Student added successfully!");
	}
	
	// Display all students
	public void displayStudent() {
		if (std.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		for(Student obj: std) {
			System.out.println(obj);
		}
	}
	
	// Sort students by marks
	public void sortStudent() {
		Collections.sort(std, new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				return Float.compare(s1.getMark(), s2.getMark());
			}
		});
		System.out.println("✅ Students sorted by marks.");
	}
	
	// Remove students with marks < 14
	public void removeStudent() {
		for(int i = 0 ; i< std.size(); i++) {
			if(std.get(i).getMark() < 14) {
				std.remove(i);
				i--;
			}
		}
		System.out.println("✅ Students with marks < 14 removed.");
	}
	
	// Update pass/fail
	public void updatePassOrFail() {
		for(Student obj : std) {
			if(obj.getMark() > 20) {
				obj.setPassorfail("Pass");
			}else {
				obj.setPassorfail("Fail");
			}
		}
		System.out.println("✅ Pass/Fail status updated.");
	}
}
