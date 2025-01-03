import java.util.*;
public class stud2
 { 
      int rno;
      String sname;
      float per;
      void accept(int rno1,String sname1,float per1)
        {
            rno=rno1;
            sname=sname1;
            per=per1;
        }   
      void disp()
       {
            System.out.printf("\n Student rno= %d",rno);
            System.out.printf("\n Student name= %s",sname);
            System.out.printf("\n Student percentage= %f",per);
       }
    public static void main(String arg[])
      {
            stud2 ob=new stud2();
            int rno;
           String sname;
           float per;
            Scanner sc=new Scanner(System.in);
            System.out.printf("Enter student rno name and per= ");
            rno=sc.nextInt();
            sname=sc.next();
            per=sc.nextFloat();
            ob.accept(rno,sname,per);
            ob.disp();           
      }     
 }

