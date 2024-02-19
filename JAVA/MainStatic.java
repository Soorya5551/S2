import java.util.*;
class Test{
 static int max=10;
 int min=5;
 }
 public class MainStatic{
 public static void main(String[]args){
 Test obj=new Test();
 System.out.println("Min+1="+(obj.min+1));
 System.out.println("Max+1="+(Test.max+1));
 }
 }
