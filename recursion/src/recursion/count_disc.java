package recursion;
import java.util.*;

public class count_disc
   {
	public static void main(String [] args)

	{
		int n=4;
	  int count= countDisc(0,n,"");
	  System.out.print(count);
	}
	
	public static int countDisc(int curr, int end ,String ans )
	{
		if(curr==end) {
			
			return (1);
		}
		if(curr>end)
		{
			return (0);
		}
		int count=0;
		for(int i=1;i<=3;i++)
		{
			count+=countDisc( curr+i,end,ans+1);
		}
		return count;
		
	}
	

}
