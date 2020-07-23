package javaoop;
import java.util.Scanner;

class transferAccount{
	String id;
	String name;
	static int balance=0;
	
	transferAccount(String id,String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
		
	}
	
}
public class bankAccount {
	String id;
	String name;
	static int balance=0;
	
	bankAccount(String id,String name){
		this.id=id;
		this.name=name;
	}
	bankAccount(String id,String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int credit(int amount) {
		balance+=amount;
		return balance;
		
	}
	public int debit(int amount) {
		if(amount<=balance) {
			balance-=amount;
			
		}
		else {
			System.out.println("balance not insufficent");
			
		}
		return balance;
		
	}
	public int transferto(transferAccount ts,int amount) {
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("amount exceed");
		}
		return balance;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount ba1=new bankAccount("1","Mg Mg",200000);
		
		System.out.println("User information "+ba1.id+"\t"+ba1.name+"\t"+ba1.balance);
		ba1.credit(50000);
		System.out.println("After add amount "+ba1.id+"\t"+ba1.name+"\t"+ba1.balance);
		ba1.debit(100000);
		System.out.println("After debit aomount "+ba1.id+"\t"+ba1.name+"\t"+ba1.balance);
		System.out.println("");
		transferAccount ts=new transferAccount("2","Su Su",100000);
		System.out.println("User information "+ts.id+"\t"+ts.name+"\t"+ts.balance);
		Scanner trs=new Scanner(System.in);
		System.out.println("Enter amount to transfer");
		int amt=trs.nextInt();
		
		
		//transferAccount ts = null;
		ba1.transferto(ts, amt);
		System.out.println("Current amount after transfer to another account is "+balance);
		//System.out.println("Current amount after transfer to another account is "+balance);
		int rebal=(ts.balance)+amt;
		System.out.println("User information "+ts.id+"\t"+ts.name+"\t"+rebal);
		
		
	}

}
