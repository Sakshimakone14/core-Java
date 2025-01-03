import java.util.*;
public class sort
 {
     public static void main(String arg[])
     {
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
       System.out.printf("Enter limit= ");
       int n=sc.nextInt();
      System.out.println("Enter n numbers= ");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int pass=1;pass<n;pass++)
       {
        for(int i=0;i<n-pass;i++)
           {
             if(a[i]>a[i+1])
             {
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
             }
          }
       } 
      System.out.println(" n numbers= "); 
      for(int i=0;i<n;i++)
            System.out.println(a[i]);
     }
 }
