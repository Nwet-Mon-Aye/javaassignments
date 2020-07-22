package stringassignments;
import java.util.Scanner;

public class removepositioninstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello best and bright";
		System.out.println(str);
		StringBuffer s=new StringBuffer(str);
		Scanner getPos=new Scanner(System.in);
		System.out.println("Enter position");
		String pos=getPos.nextLine();
		//System.out.println(Integer.parseInt(pos));
		s=s.deleteCharAt(Integer.parseInt(pos));
		System.out.println("After removing "+s);

	}

}
