package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		
		
		System.out.print("Enter the number of new students to enroll : ");
		Scanner in = new Scanner(System.in);
		int Number_students = in.nextInt();
		Student[] students = new Student[Number_students];
		
		for(int n=0;n<Number_students;n++) {
			
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		
		for(int n=0;n<Number_students;n++) {
		
		System.out.println(students[n].showInfo().toString());

		}
	}

}
