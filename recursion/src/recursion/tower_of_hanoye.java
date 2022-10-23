package recursion;
import java.util.*;


public class tower_of_hanoye {
	public static void main(String[]args)
	{
		int n=3;
		TOH(n,"A","B","C");
	}
	public static void TOH(int n,String src,String hel,String dis)
	{
		if(n==0)
		{
			return;
		}
		TOH(n-1,src,dis,hel);
		System.out.println("Move "+n+"th disc from "+src+" to "+dis);
		TOH(n-1,hel,src,dis);
	}

}
