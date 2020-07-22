package stringassignments;
import java.util.Scanner;

public class convertupperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str=s.nextLine();
		
		char chArr[]=str.toCharArray();
		for(int i=0;i<chArr.length;i++) {
			
			if ( i == 0|| chArr[i] != ' ' && chArr[i - 1] == ' ')  
	                { 
	  
	                    chArr[i] = (char)(chArr[i] - 'a' + 'A'); 
	                
	                } 
	            
	   		}
			String st = new String(chArr);
			 System.out.println(st);
			
		}
		
		
		 
		
	

}
