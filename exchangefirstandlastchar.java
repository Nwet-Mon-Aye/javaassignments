package stringassignments;

public class exchangefirstandlastchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";

		
		char[] chars = str.toCharArray();
		char first = chars[0];
		chars[0] = chars[chars.length - 1];
		chars[chars.length - 1] = first;
		str = new String(chars);
		System.out.println("New String is "+str);

	}
	

}
