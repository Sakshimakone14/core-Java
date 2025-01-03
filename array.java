import java.util.*;
  public class array
   {
       public static void main(String arg[])
       {
            int a[]=new int[20];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter limit= ");
            int n=sc.nextInt();
           System.out.println("Enter n numbers= ");
            for(int i=0;i<n;i++)
              {
                 a[i]=sc.nextInt();
              }  
          System.out.println("First element="+a[0]);
         System.out.println("Last element="+a[n-1]);
       }
   }
