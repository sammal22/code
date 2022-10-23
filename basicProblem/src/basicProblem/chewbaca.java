package basicProblem;
import java.util.*;
public class chewbaca {
    
    public static void main(String args[]) {

        Scanner h =new Scanner(System.in);
        int n=h.nextInt();
        int d1=0;
        int sum=0;
        int temp=n;
        int j=0;
        while(temp>0)
        {
            temp=temp/10;
            j++;
        }
        int i=0;
        while(n>0)
        {
            int d= n%10;
            i++;
            
             d1= 9-d;
            if(d1>d)
            {
                d1=d;
            }
            else if(d1==0 && i==j)
            {
                d1=d;
            }
            
            sum=sum+d1*(int)Math.pow(10,i-1);
            
            n=n/10;

            
        }
        System.out.println(sum);

    }

   
}
