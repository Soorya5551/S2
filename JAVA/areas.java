package Graphics;
import java.util.*;
import java.lang.Math;
interface area{
  void rec_area();
  void tri_area();
  void squ_area();
  void cir_area();
  }



  public class areas implements area{
      
    
    Scanner inp=new Scanner(System.in);
    public void rec_area(){
      System.out.print("__Rectangle__");
      System.out.print("Enter the length:");
      int len=inp.nextInt();
      System.out.println("Enter the breadth:");
      int bre=inp.nextInt();
      float rect_result=(len*bre);
      System.out.println("Area of rectangle:"+rect_result);
      }





    public void tri_area(){
       System.out.println("__Triangle__");
       System.out.println("Enter the first side:");
       int a=inp.nextInt();
       System.out.println("Enter the second side:");
       int b=inp.nextInt();
        System.out.println("Enter the third side:");
        int c=inp.nextInt();
        int s=((a+b+c)/2);
        double tri_result=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle:"+tri_result);
        }




    public void squ_area(){
     System.out.print("__Square__");
     System.out.println("Enter the side:");
     int side=inp.nextInt();
     float squ_result=(side*side);
     System.out.println("Area of square:"+squ_result);
    }




     public void cir_area(){
       System.out.println("__Circle__");
       System.out.println("Enter the radius:");
       int r=inp.nextInt();
       double cir_result=(3.14*r*r);
       System.out.println("Area of circle:"+cir_result);
      }
    
  }




