
public class ArmstrongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=153;
    int temp=num;
    int num2=num;
     int sum=0,sum1=0,rem,count=0; 
     
    while(num2>0) {
    	rem=num % 10;
 	   sum+=rem*rem*rem;
 	   num2=num2/ 10;
 	   count++;
    	
    }
   
     while(num>0) {
    	  rem=num % 10;
    	   sum1+=Math.pow(rem, count);
    	   num=num / 10;
     }
    
     if(sum==temp) {
    	 System.out.println("Armstrong number");
     }
     else
     {
    	 System.out.println("not armstrong number");
     }
	}

}
