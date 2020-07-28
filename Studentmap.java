package javaoop;
import java.util.*;
import java.util.Scanner;
public class Studentmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, List<String>> stuList=new HashMap<String, List<String>>();
		List<String> s1=new ArrayList<String>();
//		s1.add("Maung Maung");
		s1.add("09-88766555");
		s1.add("5cs-90");
		s1.add("Monywa");
		
		List<String> s2=new ArrayList<String>();
//		s2.add("Su Su");
		s2.add("09-87769");
		s2.add("5cs-88");
		s2.add("Yangon");
		
		List<String> s3=new ArrayList<String>();
//		s2.add("Ku KU");
		s3.add("09-98763");
		s3.add("5cs-8");
		s3.add("Mandalay");
		
		List<String> s4=new ArrayList<String>();
//		s1.add("Maung Maung");
		s4.add("09-88766555");
		s4.add("5cs-90");
		s4.add("Monywa");
		
		stuList.put("Maung Maung", s1);
		stuList.put("Su Su", s2);
		stuList.put("Ku Ku", s3);
		stuList.put("Ma Ma", s4);
		
		Set set=stuList.entrySet();
		Iterator it=set.iterator();
		System.out.println("Stuents Lists: ");
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
			System.out.print(mp.getKey()+",");
				
		}
		System.out.println();
		String type = null;
		Scanner sca=new Scanner(System.in);
		
		System.out.println("Tf you see Student information,enter Student's first character");
		while(sca.hasNext()==true) {
		String str=sca.nextLine();
		
		if(str.equals("M")) {
			Set s=stuList.entrySet();
			Iterator itr=set.iterator();
			
			while(itr.hasNext()) {
				Map.Entry mp=(Map.Entry)itr.next();
				if(mp.getKey().equals("Maung Maung"))
				System.out.println(mp.getKey()+","+mp.getValue());
				if(mp.getKey().equals("Ma Ma"))
					System.out.println(mp.getKey()+","+mp.getValue());
					
			}
		}
		if(str.equals("K")) {
			Set s=stuList.entrySet();
			Iterator itr=set.iterator();
			
			while(itr.hasNext()) {
				Map.Entry mp=(Map.Entry)itr.next();
				if(mp.getKey().equals("Ku Ku"))
				System.out.println(mp.getKey()+","+mp.getValue());
					
			}
		}
		
		if(str.equals("S")) {
			Set s=stuList.entrySet();
			Iterator itr=set.iterator();
			
			while(itr.hasNext()) {
				Map.Entry mp=(Map.Entry)itr.next();
				if(mp.getKey().equals("Su Su"))
				System.out.println(mp.getKey()+","+mp.getValue());
					
			}
		}
	}
			
	
		}
		
		
		
		
	}


