package basicProblem;
import java.util.*;

public class maxsumarray {
	public static void main(String[]args)
	{
		Scanner h=new Scanner(System.in);
		int a[]=new int[7];
		for (int i=0;i<7;i++)
		{
			a[i]=h.nextInt();
		}
		int sum=0,msum=-100;
		for(int i=0;i<7;i++)
		{  
			sum=0;
			for(int j=i;j<7;j++)
			{
				sum=sum+a[j];
				if(sum>msum)
				{
					msum=sum;
				}
			}
		}
		System.out.println(msum);
	}

}
