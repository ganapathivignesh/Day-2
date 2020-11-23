import java.util.Scanner; 
public class Task2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");   //get n value//
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		System.out.println("enter the values one by one");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int ch:a)
		{
		
		
			int count = 0;
			for(i=2;i<n;i++) 
			{
				if(ch%i==0) 
				{
					count++;
				}
			}
				if(count<2) {
					System.out.println(ch+" is a Prime number");
				}
				else {
					System.out.println(ch+" is not a Prime number");
				}
		}
		for(int ch:a)
		{
			int j,sum=1;
			for(j=1;j<n;j++) {
				if(ch%j==0) {
					sum=sum+j;
					}
				}
			if(sum==ch) {
				System.out.println(ch+" is a Perfect number");
			}
			else {
				System.out.println(ch+" is not a Perfect number");
			}
		 }
		for(int ch1:a)
		{
			int rem,rev=0,m = 0;
			 m=ch1;
			 for(rem=0; ch1!=0; ch1/=10) {
				 rem = ch1 % 10;
				 rev = rev * 10 + rem;
			  }
			 if(rev==m) {
				 System.out.println(m+" is a Palindrome");
			 }
			 else {
				 System.out.println(m+" is not a Palindrome");
			 }
			 
		}
		
	}

}

