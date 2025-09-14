import java.util.Scanner;

public class vowelorconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any charecter :");
		char ch=sc.next().charAt(0);
		if((ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {
			ch=Character.toLowerCase(ch);
			
			String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "vowel" : "Constant";
			System.out.println("It is a :"+result);
					
		}else {
			System.out.println("Invalid");
		}
		

	}

}
