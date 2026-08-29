package branching;

public class sixteen {

	public static void main(String[] args) {
		int a=10,b=5;
		char op='*';
		switch(op)
		{
		case '+' : System.out.println("Addition " +(a+b));
		break;
		case '-' : System.out.println("Subtraction " +(a-b));
		break;
		case '*' : System.out.println("Multiplication " +(a*b));
		break;
		case '/' : System.out.println("Division " +(a/b));
		break;
		case '%' : System.out.println("Modulus " +(a%b));
		break;
		default : System.out.println("Invalid operator");
		}

	}

}
