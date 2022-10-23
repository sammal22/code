package recursion;
import java.util.*;
public class permuation 
{
	public static void main(String[] args)
	{
		Scanner h= new Scanner(System.in);
		String s="abc";
		permutation(s,"");
	}
	public static void permutation(String q,String ans)
	{
		if(q.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<q.length();i++)
		{
			char ch=q.charAt(i);
			String s1=q.substring(0,i);
			String s2=q.substring(i+1);
			permutation(s1+s2,ch+ans);
		}
	}

}
