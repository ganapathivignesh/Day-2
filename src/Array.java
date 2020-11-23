import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers in array 1");
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int d[][]=new int[2][2];
		int e[][]=new int[2][2];int i,j,k=0;
        for(i=0;i<2;i++)//get the values of array 1 from user//
        {
        	for(j=0;j<2;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
        System.out.println("enter the numbers in array 2");
        for(i=0;i<2;i++)//get the values of array 2 from user//
        {
        	for(j=0;j<2;j++)
        	{
        		b[i][j]=sc.nextInt();
        	}
        }
        for(i=0;i<2;i++)
        {
        	for(j=0;j<2;j++)
        	{
        		c[i][j]=a[i][j]+b[i][j];
        		System.out.print(c[i][j]+" ");//add//
        	}
        	 System.out.println(" ");
         }
         
         for(i=0;i<2;i++)
         {
         	for(j=0;j<2;j++)
         	{
         		d[i][j]=a[i][j]-b[i][j];
         		System.out.print(d[i][j]+" ");//sub//
         	}
         	System.out.println(" ");
          }
         
          for(i=0;i<2;i++)
          {
          	for(j=0;j<2;j++)
          	{
          		for(k=0;k<2;k++)
          		{
          		e[i][j]+=a[i][k]*b[k][j];//multiply//
          		
          		}
          	}
          
          }
          for(i=0;i<2;i++)
          {
          	for(j=0;j<2;j++)
          	{
          		
          		System.out.print(e[i][j]+" ");//display multiply result//
          	}
          	System.out.println(" ");
           }
          
	}

}
