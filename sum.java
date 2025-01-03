import java.util.*;
 public class sum
  {
     public static void main(String arg[])
      {
         int s=0,ld;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a number= ");
        int n=sc.nextInt();
        while(n!=0)
        {
         ld=n%10;
         s=s+ld;
         n=n/10;
      
        }
    System.out.printf("Sum of digit= %d",s);  
     }
  }
