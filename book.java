package javaoop;

class author{
	String name;
	String email;
	char gender;
	
	author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
}

public class book {

	String name;
	double price=0;
	int qty;
	
	
	book(String name,author a,double price){
		this.name=name;
		this.price=price;
		
		}
	book(String name,author a,double price,int qty){
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		author a1=new author("Moe Shin I.M.T","moe54@gmail.com",'M');
		book b1=new book("Tree love",a1,4000,2);
		author a2=new author("U Phone","phone14@gmail.com",'M');
		book b2=new book("Life is short",a2,3000,4);
		System.out.println("book informations are ");
//		System.out.println("bookname\tAuthor\t\tEmail\t\tGender\t\tPrice\tQty");
		System.out.println(b1.name+"\t"+a1.name+"\t"+a1.email+"\t"+a1.gender+"\t"+b1.price+"\t"+b1.qty);
		System.out.println(b2.name+"\t"+a2.name+"\t\t"+a2.email+"\t"+a2.gender+"\t"+b2.price+"\t"+b2.qty);
		

	}

}
