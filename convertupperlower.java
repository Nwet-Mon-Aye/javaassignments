package stringassignments;
import java.util.Scanner;

public class convertupperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str=s.nextLine();
		
		
		str=str.toUpperCase();
		System.out.println(str);
	}

}
