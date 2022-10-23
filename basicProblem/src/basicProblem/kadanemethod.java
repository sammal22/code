package basicProblem;

import java.util.Scanner;

public class kadanemethod {
	public static void main(String[]args)
	{
		Scanner h=new Scanner(System.in);
		int a[]=new int[7];
		for (int i=0;i<7;i++)
		{
			a[i]=h.nextInt();
		}
		int sum=0,msum=Integer.MIN_VALUE;
		for(int i=0;i<7;i++)
		{  
				sum=sum+a[i];
				if(sum>msum) msum=sum;
				if(sum<0) sum=0;
			}
		System.out.println(msum);
		}
	}
