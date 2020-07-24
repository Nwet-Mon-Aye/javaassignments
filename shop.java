package javaoop;

import java.util.Date;
class customer{
	String name;
	boolean member=false;
	public static String type;
	
	
	 customer(String name,String type){
		this.name=name;
		this.type=type;
		
	}
	
	
}

class discountrate{
	double serviceDiscountPremium=0.2;
	double serviceDiscountGold=0.15;
	double serviceDiscountSilver=0.1;
	double productDiscountPremium=0.1;
	double productDiscountGold=0.1;
	double productDiscountSilver=0.1;
	double getServiceDiscountRate(String type) {
		double resser = 0;
		if(type=="Gold") {
			resser=0.15;
		}
		else if(type=="Premium") {
			resser=0.2;
		}
		else if(type=="Silver") {
			resser=0.1;
		}
		
		
		return resser;
		
	}
	double getProductDiscountRate(String type) {
		double respro = 0;
		if(type=="Gold") {
			respro=0.1;
		}else if(type=="Premium") {
			respro=0.1;
		}else if(type=="Silver") {
			respro=0.1;
		}
		
		
		return respro;
		
	}
}

public class shop extends customer{
	
	Date date=new Date("yyyy/mm/dd");
	double serviceExpense=20000.0;
	double productExpense=30000.0;

	shop(String name,Date date){
		super(name, type);
		this.date=date;
		
	}
	double getTotalExpense() {
		double total=serviceExpense+productExpense;
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//shop sp=new shop("Kyaw Thu","2020.3.10");
		double serviceExpense=20000.0;
		double productExpense=30000.0;
		double total=serviceExpense+productExpense;
		discountrate sdis=new discountrate();
		sdis.getServiceDiscountRate(type);
		sdis.getProductDiscountRate(type);
		customer c=new customer("Kyaw Thu","Premium");
		System.out.println("Name: "+c.name+"\t"+"Member Type: "+c.type+
				"\t"+"Discount: "+sdis.getServiceDiscountRate(type)+"\t"+"TotalExp: "+(total-(serviceExpense*sdis.getServiceDiscountRate(type)))+"\t"+"Date: "+new Date("2020/3/10"));
		System.out.println("Name: "+c.name+"\t"+"Member Type: "+c.type+
				"\t"+"Discount: "+sdis.getProductDiscountRate(type)+"\t"+"TotalExp: "+(total-(serviceExpense*sdis.getProductDiscountRate(type)))+"\t"+"Date: "+new Date("2020/3/10"));
		customer c2=new customer("Hla Yee","Gold");
		System.out.println("Name: "+c2.name+"\t"+"Member Type: "+c2.type+
				"\t"+"Discount: "+sdis.getServiceDiscountRate(type)+"\t"+"TotalExp: "+(total-(serviceExpense*sdis.getServiceDiscountRate(type)))+"\t"+"Date: "+new Date("2020/2/3"));
		System.out.println("Name: "+c2.name+"\t"+"Member Type: "+c2.type+
				"\t"+"Discount: "+sdis.getProductDiscountRate(type)+"\t"+"TotalExp: "+(total-(serviceExpense*sdis.getProductDiscountRate(type)))+"\t"+"Date: "+new Date("2020/2/3"));
		customer c3=new customer("Lwin Lwin","Silver");
		System.out.println("Name: "+c3.name+"\t"+"Member Type: "+c3.type+
				"\t"+"Discount: "+sdis.getServiceDiscountRate(type)+"\t"+"TotalExp: "+(total-(serviceExpense*sdis.getServiceDiscountRate(type)))+"\t"+"Date: "+new Date("2020/1/20"));
		System.out.println("Name: "+c.name+"\t"+"Member Type: "+c3.type+
				"\t"+"Discount: "+sdis.getProductDiscountRate(type)+"\t"+"TotalExp: "+(total-(serviceExpense*sdis.getProductDiscountRate(type)))+"\t"+"Date: "+new Date("2020/1/20"));
		
		
		
		
		
	}

}
