package basicProblem;
import java.util.*;
public class quadraticEquation {
    public static void main(String args[]) {
        Scanner h= new Scanner(System.in);
        int a=h.nextInt();
        int b=h.nextInt();
        int c=h.nextInt();
        int D=b*b-4*a*c;
        int temp=0;
        int x1,x2;
        if(D>0)
        {
            System.out.println("Real and Distinct");
             x1= (int)(-b+Math.sqrt(D))/(2*a);
             x2= (int)(-b-Math.sqrt(D))/(2*a);
            if(x1>x2)
            {
                temp=x1;
                x1=x2;
                x2=temp;

            }
            System.out.println(x1+" "+x2);
        }
        else if(D==0)
        {
            System.out.println("Real and Equal");
            x2= (int)(-b+Math.sqrt(D))/(2*a);
             System.out.println(x2);

        }

    }
}