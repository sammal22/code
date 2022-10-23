package basicProblem;
import java.util.*;
public class reverseByPosition {
    public static void main(String args[]) {
		Scanner h= new Scanner(System.in);
		int n=h.nextInt();
		int i=0,l=1;
        int temp=n;
        while(temp>0)
		{  l++;
           
           temp=temp/10;
		}
        
        int d;
        
        int arr[] = new int[6];
        int arr1[] = new int[6];
        
        temp=n;
        i=1;
        while(temp>0)
        {  
        d=temp%10;
            arr[i]=d;
            temp=temp/10;
            i++;
        }
        i=1;
        temp=n;
        while(temp>0)
        {
            d=temp%10;
            arr1[d]=i;
            i++;
            temp=temp/10;
        }
        i=5;
        while(i>0)
        {
            System.out.print(arr1[i]);
            i--;
        }
		
		

    }
}