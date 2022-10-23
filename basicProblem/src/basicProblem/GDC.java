package basicProblem;
import java.util.*;

public class GDC {
	public static void main(String[] args)
	{
		System.out.println("Enter the 2 number ");
		Scanner h= new Scanner (System.in);
		int n=h.nextInt();
		int n2=h.nextInt();
		int temp,i,rem;
		
//		if(n>n2)
//		{
//			temp=n2;
//			n2=n;
//			n=temp;
//			
//		}
		
		
		while(n2%n !=0)
		{
			rem=n2%n;
			n2=n;
			n=rem;
		}
		System.out.println("HCf is"+n);
		
	}

}
