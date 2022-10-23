package basicProblem;
import java.util.*;

public class input {
	public static void main(String[] args)
	{
		      Scanner h= new Scanner(System.in);
		        int n=5;
		        int sum=0,i=0,j=0;
		        int[] arr = new int[n];
		        while(i<n)
		        {
		            arr[i]=h.nextInt();
		            i++;
		             }
		        
		        while(j<n)
		        {
		            sum=sum+arr[j];
		            if(sum<0)
		            {
		                break;
		            }
		            System.out.println(arr[j]);
		            j++;
		        }

		    }
		}
