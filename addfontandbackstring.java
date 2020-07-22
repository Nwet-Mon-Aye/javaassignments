package stringassignments;
import java.util.Scanner;

public class addfontandbackstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getword=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=getword.nextLine();
		//System.out.println("A word that you put is"+word);
		char res=word.charAt(word.length()-1);
		System.out.println(res+""+word+""+res);

	}

}
