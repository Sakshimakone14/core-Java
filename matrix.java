import java.util.*;
 public class  Main
 {
     public static void main(String arg[])
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows and cols= ");
             int m=sc.nextInt();
             int n=sc.nextInt();
             int a[][]=new int[m][n]; 
            System.out.println("Enter matrix= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                         a[i][j]=sc.nextInt();
                     }
                    
                }
            System.out.println("The  matrix= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                         System.out.printf("%d\t",a[i][j]);
                     }
                     
                    System.out.println();
                }
      }
 }
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Addition of matrix
 import java.util.*;
 public class  Main
 {
     public static void main(String arg[])
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows and cols= ");
             int m=sc.nextInt();
             int n=sc.nextInt();
             int a[][]=new int[m][n];
             int b[][]=new int[m][n];
             int c[][]=new int[m][n];
            System.out.println("Enter matrix1= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                         a[i][j]=sc.nextInt();
                     }
                    
                }
            System.out.println("Enter matrix2= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                         b[i][j]=sc.nextInt();
                     }
                    
                }        
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                        c[i][j]=a[i][j]+b[i][j];   
                     }
                }
            System.out.println("The  matrix addition = ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                        System.out.printf("%d\t",c[i][j]);   
                     }
                     System.out.println();
                }
      }
 }
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Transpose matrix
 import java.util.*;
 public class  Main
 {
     public static void main(String arg[])
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows and cols= ");
             int m=sc.nextInt();
             int n=sc.nextInt();
             int a[][]=new int[m][n];
             //int b[][]=new int[m][n];
             //int c[][]=new int[m][n];
            System.out.println("Enter matrix1= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                         a[i][j]=sc.nextInt();
                     }
            
                }
            System.out.println("The  Transpose matrix= ");
              for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                     {
                        System.out.printf("%d\t",a[j][i]);   
                     }
                     System.out.println();
                }
      }
 }
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------
 Matrix multiplication
 import java.util.*;
 public class  Main
 {
     public static void main(String arg[])
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows and cols= ");
             int m=sc.nextInt();
             int n=sc.nextInt();
             int a[][]=new int[m][n];
             int b[][]=new int[m][n];
             int c[][]=new int[m][n];
            System.out.println("Enter matrix1= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                         a[i][j]=sc.nextInt();
                     }
            
                }
            System.out.println("Enter matrix1= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                         b[i][j]=sc.nextInt();
                     }
            
                }
               for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                        c[i][j]=0;
                        for(int k=0;k<n;k++)
                        {
                         c[i][j]=c[i][j]+a[i][k]*b[k][j];
                     
                        }    
                    }
            
                }      
            System.out.println("The  Transpose matrix= ");
              for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                     {
                        System.out.printf("%d\t",c[i][j]);   
                     }
                     System.out.println();
                }
      }
 }
----------------------------------------------------------------------------------------------------------------------------------------------------------------
sum of diagonal elements
import java.util.*;
 public class Main
 {
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of rows and cols= ");
          int m=sc.nextInt();
          int n=sc.nextInt();
        int a[][]=new int[m][n];
          System.out.println("Enter martix= ");
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
           }
          int s=0;
            for(int i=0;i<m;i++)
              {
                  for(int j=0;j<n;j++)
                    {
                       if(i==j)
                        {
                            s=s+a[i][j];
                        }
                    }
              }
        System.out.println("Sum of diagonal elements= "+s);      
     }
 }
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
 sum of upper traingular
 import java.util.*;
 public class Main
 {
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of rows and cols= ");
          int m=sc.nextInt();
          int n=sc.nextInt();
        int a[][]=new int[m][n];
          System.out.println("Enter martix= ");
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
           }
          int s=0;
            for(int i=0;i<m;i++)
              {
                  for(int j=0;j<n;j++)
                    {
                       if(i<j)
                        {
                           s=s+a[i][j];
                        }
                    }
              }
       System.out.println("Sum of upper triangular elements= "+s);      
     }
 } 
 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Sum of lower traingle 
 import java.util.*;
 public class Main
 {
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of rows and cols= ");
          int m=sc.nextInt();
          int n=sc.nextInt();
        int a[][]=new int[m][n];
          System.out.println("Enter martix= ");
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
           }
          int s=0;
            for(int i=0;i<m;i++)
              {
                  for(int j=0;j<n;j++)
                    {
                       if(i>j)
                        {
                           s=s+a[i][j];
                        }
                    }
              }
       System.out.println("Sum of lower triangular elements= "+s);      
     }
 -----------------------------------------------------------------------------------------------------------------------------------------------
  import java.util.*;
 public class Main
 {
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of rows and cols= ");
          int m=sc.nextInt();
          int n=sc.nextInt();
        int a[][]=new int[m][n];
          System.out.println("Enter martix= ");
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
           }
            int ch;

         do
          {
              System.out.println("Enter your chioce=1-sum_of_diagonal\n2-upper trai\n3-lower trai=");
               ch=sc.nextInt();
                          int s=0;
              switch(ch)
               {
        case 1:
            for(int i=0;i<m;i++)
              {
                  for(int j=0;j<n;j++)
                    {
                       if(i==j)
                        {
                            s=s+a[i][j];
                        }
                    }
              }
            System.out.println("Sum of diagonal elements= "+s);      
              break;
        case 2:          
            for(int i=0;i<m;i++)
              {
                  for(int j=0;j<n;j++)
                    {
                       if(i<j)
                        {
                           s=s+a[i][j];
                        }
                    }
              }
            System.out.println("Sum of upper triangular elements= "+s);  
              break;
        case 3:
            for(int i=0;i<m;i++)
              {
                  for(int j=0;j<n;j++)
                    {
                       if(i>j)
                        {
                           s=s+a[i][j];
                        }
                    }
              }
       System.out.println("Sum of lower triangular elements= "+s);            
               }
          }while(ch<4);
     }
 }
 ...........................................................................................................................................................................................

