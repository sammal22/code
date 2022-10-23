package basicProblem;
import java.util.*;

public class resersePosition {
	public static void main(String[]args)
	{
		Scanner h =new Scanner(System.in);
		int n=h.nextInt();
		int i ,j,l=0,k,temp,d,sum=0,z=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			l++;
		}
		for(i=1;i<=l;i++)
		{
			k=1;
			temp=n;
			for(j=1;j<=l;j++)
			{
				d=temp%10;
				temp=temp/10;
				if(i==d)
				{
					z=j;
					break;
				}
			}
			while(k<i)
			{
				z=z*10;
				k++;
			}
			sum=sum+z;
		}
		System.out.println(sum);
		
				
	}

}
