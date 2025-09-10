import java.util.Scanner;
public class averagemarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number");
		int rollnum=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter the marks in three subjects:");
		double mark1 = sc.nextDouble();
		double mark2 = sc.nextDouble();
		double mark3 = sc.nextDouble();
		double total = mark1+mark2+mark3;
		double avg = total/3;
		System.out.println("Roll number = "+rollnum);
		System.out.println("Student name = "+name);
		System.out.println("Total marks = "+total);
		System.out.println("Average marks = "+avg);
		
		
		
		

	}

}
