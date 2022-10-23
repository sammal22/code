package basicProblem;
import java.util.*;
import java.math.*;

public class armstong {
	public static void main(String[]args)
	{
		System.out.println("enter the number");
		Scanner h= new Scanner(System.in);
		int n= h.nextInt();
		int temp=n,j;
		double i=0,d,a,sum;
		while(temp>0)
		{
			temp=temp/10;
			i++;
		}
		System.out.println(i);
		
		System.out.println(Math.pow(2, 2));
		temp=n;
		while(temp>0)
	{   
			j=1;
			a=1;
			d=temp%10;
			temp=temp/10;
			
			while(j<=i)
			{
				a=d*a;
				j++;
			}
			a=(int) Math.pow(d, i);
			 
			 sum=sum+a;
	}
			
		
		if(n==sum)
		{
			System.out.println("it is armstron number");
			
		}
		else {
			System.out.println("it is not a armstron number");
		}
		
			

}

}
