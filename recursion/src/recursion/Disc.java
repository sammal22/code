package recursion;
import java.util.*;

public class Disc 
   {
	public static void main(String [] args)

	{
		int n=8;
	   Disc(0,n,"");
	}
	
	public static void Disc(int curr, int end ,String ans )
	{
		if(curr==end) {
			System.out.println(ans);
			return;
		}
		if(curr>end)
		{
			return;
		}
		Disc(curr+1,end,ans+1);
		Disc(curr+2,end,ans+2);
		Disc(curr+3,end,ans+3);
		
	}
	

}
