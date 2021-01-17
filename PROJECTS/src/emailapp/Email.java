package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstname;
	private String lastname;
	private String password;
	private int defaulPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String email;
	private String alternateEmail;
	private String companySuffix = "TechMahindra.com";


public Email(String firstname, String lastname) {
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.department = setDepartment();
	System.out.println("Department : " + this.department);
	
	this.password = randomPassword(defaulPasswordLength);
	System.out.println("Your password : " +this.password);
	
	email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department+ "." + companySuffix;
	
}

private String setDepartment() {
	
	System.out.print("DEPARTMENT CODES\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter the code here : ");
	Scanner in = new Scanner(System.in);
	int deptChoice = in.nextInt();
	
	if(deptChoice == 1) {
		
		return "sales";
	}
	
	else if(deptChoice == 2) {
		
		return "dev";
	}
	
	else if(deptChoice == 3) {
		
		return "acct";
		
	}
	
	else {
		
		return "";
	}
			
	
	
}

private String randomPassword(int length) {
	
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
	char[] password = new char[length];
	for (int i=0;i<length;i++) {
		
		int rand = (int)(Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);		
	}
	return new String(password);

		
}

public void setmailboxCapacity(int capacity) {
	
	this.mailboxCapacity = capacity;
	
}

public void setalternateEmail(String altemail) {
	
	this.alternateEmail = altemail;
	
}

public void changePassword(String password) {
	
	this.password = password;
	
}

public int getmailboxCapacity() {
	
	return mailboxCapacity;
}

public String getalternateEmail() {
	
	return alternateEmail;	
}

public String getPassword() {
	
	return password;
	
}

public String showInfo() {
	
	return "DISPLAY NAME : " + firstname + " " + lastname +
			"\nCOMPANY EMAIL : " + email + 
			"\nMAILBOX CAPACITY : " + mailboxCapacity + "mb";
	
}

}