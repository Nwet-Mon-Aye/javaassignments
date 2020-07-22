package stringassignments;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		System.out.println("Enter first num");
		String n1=st.nextLine();
		int number1=Integer.parseInt(n1);
		//System.out.println("First num "+Integer.parseInt(n1));
		System.out.println("Enter second num");
		String n2=st.nextLine();
		int number2=Integer.parseInt(n2);
		//System.out.println("Second num "+Integer.parseInt(n2));
		System.out.println("Enter a operator");
		String op=st.nextLine();
		char opres=op.charAt(0);
		//System.out.println("Second num "+opres);
		switch(opres) {
		case '+':
			System.out.println("The result is "+(number1+number2));
			break;
		case '-':
			System.out.println("The result is "+(number1-number2));
			break;
		case '*':
			System.out.println("The result is "+(number1*number2));
			break;
		case '/':
			System.out.println("The result is "+(number1/number2));
			break;
		default:
			System.out.println("Invalid");
			
		
		}
		

	}

}
