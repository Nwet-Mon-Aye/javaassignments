package stringassignments;

public class twominmax {
	
	public void printTwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
	public void printTwoMinNumbers(int[] nums) {
		int minOne = nums[0];
        int minTwo = nums[0];
        for(int i=0;i<nums.length;i++) {
        	if(minOne>nums[i]) {
        		minTwo=minOne;
        		minOne=nums[i];
        	} else if(minTwo>nums[i]){
                minTwo = nums[i];
            }
        }
        
        System.out.println("First min Number: "+minOne);
        System.out.println("Second min Number: "+minTwo);
       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num[] = {5,34,78,2,45,1,99,23};
		 int total=0;
		 int avg=0;
		 for(int i=0;i<num.length;i++) {
			 total+=num[i];
			
		 }
		 avg=total/8;
		 System.out.println("the average is "+avg);
		 
		 
		 twominmax tmn = new twominmax();
	        tmn.printTwoMaxNumbers(num);
	        tmn.printTwoMinNumbers(num);
	        

	}

}
