import java.util.*;
public class reverse
 {
     public static void main(String arg[])
      { 
           int a[]=new int[50];
           Scanner sc=new Scanner(System.in);
          System.out.println("Enter limit=");
         int n=sc.nextInt();
         System.out.println("Enter n numbers=");
          for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
        System.out.println("Reverse no="); 
         for(int i=n;i>=0;i--)
            System.out.println(a[i]);       
      }
 }
