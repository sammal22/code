package basicProblem;
import java.util.*;

public class fibnoci {
	public static void main(String[]args)
	{
		System.out.println("Enter the number ");
		Scanner h = new Scanner (System.in);
		int n=h.nextInt();
		int sum =1,i=1,j=0,k=1;
//		System.out.print(j+"\t");
//		System.out.print(k+"\t");
		while(i<=n+1)
		{
			if(i==n)
			{
				System.out.println("Fib \t"+sum);
				break;
			}
			sum=k+j;
			j=k;
			k=sum;
			
			
			
			i++;
			
		}
	}

}
