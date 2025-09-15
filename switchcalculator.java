import java.util.Scanner;

public class calcutator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result=0;
		System.out.println("Enter two numbers :");
		int a =sc.nextInt();
		int b =sc.nextInt();
		System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide");
		System.out.println("Enter your choice :");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:result=a+b; break;
			case 2:result=a-b; break;
			case 3:result=a*b; break;
			case 4:result=a/b; break;
			default:System.out.println("Invalid choice");
			
		}
	    
		System.out.println("Result= "+result);
	}

}
