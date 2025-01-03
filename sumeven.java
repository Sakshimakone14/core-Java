import java.util.*;
  public class sumeven
   {
         public static void main(String arg[])
         {
             Scanner sc=new Scanner(System.in);
              System.out.printf("Enter a number= "); 
             int a=sc.nextInt();
             int s=0;  
             for(int i=1;i<=a;i=i+2) 
             { 
                          s=s+i;                    
            }
             System.out.printf("Sum of even no= %d",s);
         }
   }
