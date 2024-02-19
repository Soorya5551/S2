import Graphics.*;
import java.util.*;
public class TestPackage{
  public static void main(String [] args){
    {

         Scanner inp=new Scanner(System.in);
     do
     {
              System.out.println("\n\n\n___MENU___\n1.Area of rectangle.\n2.Area of triangle.\n3.Square.\n4.Circle.\n5.Exit.");
               System.out.print("Enter your choice:");
              int ch = inp.nextInt();
              areas obj=new areas();
            /*  areas.rectangle.rect_obj=areas.new.rectangle();
              areas.triangle.tri_obj=areas.new.triangle();
              areas.square.sq_obj=areas.new.square();
              areas.circle.cir_obj=areas.new.circle();*/
    switch (ch) {
                  case 1:obj.rec_area();
                         break;
                  case 2:obj.tri_area();
                          break;
                  case 3:obj.squ_area();
                          break;
                  case 4:obj.cir_area();
                         break;
                  case 5:System.exit(0);
                          break;
                 }
             }while(true);
           }
         }
        }

