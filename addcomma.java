package stringassignments;
import java.util.Scanner;
public class addcomma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		String str=s.nextLine();
		//int n=Integer.parseInt(str);
		
		//System.out.printf( "%,d\n", str );
		for(int i=0;i<str.length();i++) {
			String res=str.substring(i,i+2);
			i++;
			System.out.print(res+",");
			
		}
		
		
	}

}
