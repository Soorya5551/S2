import java.util.*;
import java.lang.Exception;
class NegException extends Exception{
   NegException(String str){
  System.out.print(str);
 } 
}
public class Avgposnum{
  public static void main(String args []){
     Scanner reader=new Scanner(System.in);
     double s=0;
     System.out.println("Enter the limit:");
     int n=reader.nextInt();
     System.out.println("Enter the numbers:");
     for(int a=0;a<n;a++){
       double i=reader.nextDouble();
      
      try{
        if(i<0){
            a=a-1;       
          throw new NegException("Numbers can't be negative.");
         }
        else
        {
            s=s+i;
        }    
      }

      catch(NegException u){
      System.out.println(u);
     }
    }     
   double avg=s/n;
   System.out.println("Average:"+avg);  
    }
   }  
                
