import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n,a;
      int rev = 0,rem=0;
      if(args.length>0)
      {
    	  n=Integer.parseInt(args[0]);
    	  
      }
      else
      {
    	 System.out.println("enter a positive value");
    	 n=sc.nextInt();
      }
      while(n!=0)
      {
    	  rem=n%10;
    	  rev=rev*10+rem;
    	  n=n/10;
      }
      a=rev;
      int i,count = 0;
		for(i=2;i<a;i++) {
			if(a%i==0) {
				count++;
			}
		}
			if(count<2) {
				System.out.println(a+" is a Prime number");
			}
			else {
				System.out.println(a+" is not a Prime number");
			}
      
      
      
      
      
	}

}
