package pack;

import java.util.Date;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
	Bug b=new Bug();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter bugName");
	b.setBugName(scan.nextLine());
	System.out.println("Enter bugDiscription");
	b.setDiscription(scan.nextLine());
	
	System.out.println("Plese enter your personal details");

	BugCreation b1=new BugCreation();
	System.out.println("Enter your email");
	b1.setEmailAddress(scan.nextLine());
	System.out.println("Enter your name");
	b1.setOwnerName(scan.nextLine());
	System.out.println("enter bug priorty");
	b1.setPriority(scan.nextInt());
	scan.nextLine();
	b1.setStatus(STATUS.COMPLETED);
	b1.setCreatedDate(new Date());
	System.out.println("Enter discription");
	b1.setDiscription(scan.nextLine());
	
	System.out.println(b.getBugName());
	System.out.println(b.getDiscription());
	System.out.println(b1.getEmailAddress());
	System.out.println(b1.getOwnerName());
	System.out.println(b1.getStatus());
	System.out.println(b1.getPriority());
	System.out.println(b1.getCreatedDate());
	System.out.println(b1.getDiscription());
}

}
