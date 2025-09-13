import java.util.Scanner;

public class BigThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter three numbers :");
	    int num1 =sc.nextInt();
	    int num2= sc.nextInt();
	    int num3 = sc.nextInt();
	    if(num1>num2 && num1>num3)
	    	System.out.println("Number1 is greast:"+num1);
	    else
	    	if(num2>num3)
	    		System.out.println("Number2 is greast:"+num2);
	    	else
	    		System.out.println("Number3 is greast:"+num3);
	}

}

