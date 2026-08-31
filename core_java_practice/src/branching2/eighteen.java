package branching2;

public class eighteen {

	public static void main(String[] args) {
		int balance=10000;
		int choice=2;
		int amount=3000;
		switch(choice)
		{
		case 1 : System.out.println("Balance =" + balance);
		break;
		case 2 : if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Withdrawal successful");
			System.out.println("Remaining Balance = "+balance);	
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		break;
		default : System.out.println("Invalid choice");
	}
	}
}


