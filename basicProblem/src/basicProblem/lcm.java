package basicProblem;

import java.util.*;

public class lcm {
	public static void main(String[] args)
	{
		System.out.println("Enter the 2 number ");
		Scanner h= new Scanner (System.in);
		int n1=h.nextInt();
		int n2=h.nextInt();
        int a=n1,b=n2;
		int temp,i,rem;
		
		if(n1>n2)
		{
			temp=n2;
			n2=n1;
			n1=temp;
			
		}
		
		
		while(n2%n1 !=0)
		{
			rem=n2%n1;
			n2=n1;
			n1=rem;
		}
		System.out.println((a*b)/n1);
        

		
	}

}