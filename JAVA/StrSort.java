import java.util.Arrays;
import java.util.Scanner;
public class StrSort{
public static void main(String[]args){
int n1;
Scanner read=new Scanner(System.in);
System.out.println("Enter the size of the array:");
n1=read.nextInt();
System.out.println("Enter the values:");
String[]arr=new String[n1];
for(int i=0;i<n1;i++)
 {
   arr[i]=read.next();
 }
Arrays.sort(arr);
System.out.println("String of array after sorting:");
for(int i=0;i<n1;i++)
{
  System.out.println(arr[i]+",");
 }
}
}     
