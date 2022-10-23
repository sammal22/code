package recursion;
import java.util.*;

public class GenerateParentheses {
public static void main(String [] args)
{
	int n=3;
	List<String> list = new ArrayList<>();
	pat(n,0,0,"",list);
	
	
}
public static void pat(int n,int open, int close,String ans,List<String> list)
{
	if(open==n && close == n)
	{
		list.add(ans);
		return;
	}
	if(open<n)
	{
		pat(n,open+1,close,ans+ "(",list);
	}
	if(close<open)
	{
		pat(n,open,close+1,ans+")",list);
	}
}
}
