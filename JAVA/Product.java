import java.util.*;
import java.util.Scanner;
public class Product{
 int pcode;
 String pname;
 double price;
  void input()
   {
      Scanner inp=new Scanner(System.in);
      System.out.println("Product Code : ");
      pcode=inp.nextInt();
      System.out.println("Product Name : ");
      pname=inp.next();
      System.out.println("Product Price : ");
      price=inp.nextInt();
   }
 void display()
  {
    System.out.println(pcode+"\t"+pname+"\t"+price) ;
  }
  static void lowest(double price1,double price2,double price3)
  {
    if(price1<price2 && price1<price3)
     {
       System.out.print("Product 1 is lowest price.");
      }
     else if(price2<price1 && price2<price3)
      {
        System.out.println("Product 2 is lowest price.");
      }
     else
      {
        System.out.println("Product 3 is lowest price.");                  
      }
   }
 public static void main(String[]args){
   Product obj1=new Product();
   Product obj2=new Product(); 
   Product obj3=new Product();
   System.out.println("Enter the details of 1st product:");
   obj1.input();  
   System.out.println("Enter the details of 2nd product:");
   obj2.input();  
   System.out.println("Enter the details of 3rd product:");  
   obj3.input();   
   System.out.println("Product Information:\n Product_Code\tProduct_Name\tProduct_Price");
     obj1.display();
     obj2.display();
     obj3.display();
     lowest(obj1.price,obj2.price,obj3.price); 
  }
  }    
