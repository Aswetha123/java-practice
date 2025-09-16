import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance,amount,ch;
		System.out.println("Enter current balance :");
		balance = sc.nextInt();
		do
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display Balance");
			System.out.println("Exit");
			System.out.println("enter your choice :");
			ch=sc.nextInt();
			switch (ch)
			{
			case 1:System.out.println("Enter the amount :");
			       amount = sc.nextInt();
			       balance = balance+amount; break;
			case 2:System.out.println("Enter the amount to wwithdraw :");
		           amount = sc.nextInt();
		           if(amount>balance)
		        	   System.out.println("Insufficient balance");
		           else
		        	   balance=balance-amount;
			case 3:System.out.println("Current balance :"+balance); break;
		           
			case 4:System.out.println("Thank you for banking"); break;
			default : System.out.println("Invalid");
			}
		}while(ch!=4);

	}

}
