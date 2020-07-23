package javaoop;

class person{
	String name;
	String address;
	
	person(String name,String address){
		this.name=name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}


class Student extends person{

	String program;
	int year;
	double fee;
	
	
	
	Student(String name,String address,String program,int year,double fee){
		super(name, address);
		this.program=program;
		this.year=year;
		this.fee=fee;
		
	}
}



public class staff extends person{
	
	String school;
	double pay;
	
	staff(String name,String address,String school,double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Nwet Mon","Monywa","Level2",1,200000);
		Student s2=new Student("Jue","Monywa","Level3",2,400000);
		staff st1=new staff("Kyaw Htut","Yangon","UCS-Yangon",300000);
		staff st2=new staff("Aung","Mandalay","UCS-Mandalay",400000);
		System.out.println("Students information ");
		System.out.print("\tName:\t"+s1.name+"\n\tAddress:\t"+s1.address+"\n\tProgram:\t"+s1.program
				+"\n\tYear:\t"+s1.year+"\n\tFee:\t"+s1.fee);
		System.out.println("");
		System.out.println("");
		System.out.print("\tName:\t"+s2.name+"\n\tAddress:\t"+s2.address+"\n\tProgram:\t"+s2.program
				+"\n\tYear:\t"+s2.year+"\n\tFee:\t"+s2.fee+"\n\n");
		System.out.println("Staffs information ");
		System.out.print("\tName:\t"+st1.name+"\n\tAddress:\t"+st1.address+"\n\tSchool:\t"
				+st1.school+"\n\tPay:\t"+st1.pay);
		
	}

}
