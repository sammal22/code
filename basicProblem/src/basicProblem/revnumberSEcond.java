package basicProblem;
import java.util.*;
import java.math.*;

public class revnumberSEcond {
	public static void main(String[] args)
	{
		Scanner h=new Scanner(System.in);
		int n=h.nextInt();
		int place=1,sum=0;
		int temp=0;
		while(n!=0)
		{
			temp=n%10;
			sum=sum+place*(int)Math.pow(10,temp-1);
			n=n/10;
			place++;
			
		}
		System.out.println(sum);
	}

}
