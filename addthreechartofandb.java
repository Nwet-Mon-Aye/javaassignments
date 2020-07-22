package stringassignments;
import java.util.Scanner;
public class addthreechartofandb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str=s.nextLine();
		
		 if(str.length()>=3){
			 	String res=str.substring(0,3);
	           
	            System.out.println(res+""+str+""+res);
	        }else{
	            System.out.println("please enter a string with minimum length of 2.");
	        }

	}

}
