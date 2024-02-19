import java.util.*;
class array{
  public static void main(String[]args){
    int []a=new int[5];
    int temp,i,j;
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter elements:");
    for(i=0;i<a.length;i++)
      a[i]=inp.nextInt();
    for(i=0;i<a.length;i++)
     {
       for(j=i+1;j<a.length;j++)
         {
            if(a[i]>a[j])
              {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
              }
         }
     }
     System.out.println("Array elements after sorting is:");
     for(i=0;i<a.length;i++)
   System.out.println(a[i]);
  }    
  }        
