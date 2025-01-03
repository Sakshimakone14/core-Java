import java.util.*;
public class stud1
 { 
      int rno;
      String sname;
      float per;
      void accept()
        {
            Scanner sc=new Scanner(System.in);
            System.out.printf("Enter student rno name and per= ");
            rno=sc.nextInt();
            sname=sc.next();
            per=sc.nextFloat();
        }   
      void disp()
       {
            System.out.printf("\n Student rno= %d",rno);
            System.out.printf("\n Student name= %s",sname);
            System.out.printf("\n Student percentage= %f",per);
       }
    public static void main(String arg[])
      {
            stud1 ob=new stud1();
            ob.accept();
            ob.disp();           
      }     
 }

