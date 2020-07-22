package stringassignments;
import java.util.Scanner;
public class factorynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a num");
		
		String str=s.nextLine();
		int n=Integer.parseInt(str);
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial nums are "+fact);

	}

}
