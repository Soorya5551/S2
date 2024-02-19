import java.util.Scanner;
import java.lang.Exception;
class UsernameException extends Exception{
  UsernameException(String msg){
    System.out.println(msg);
   }
  }
class PasswordException extends Exception{
   PasswordException(String msg){
    System.out.println(msg);
   }
  }
public class UserNamepass{
  public static void main(String args []){
    Scanner reader=new Scanner(System.in);
    String username,password;
    System.out.println("Enter the username:");
    username=reader.nextLine();
    System.out.println("Enter the password:");
    password=reader.nextLine();
    int len=username.length();
    
   try{
        if(len<8)
          throw new UsernameException("Username must be greater than 8 characters.\n");
        else if(!password.equals("admin"))
           throw new PasswordException("Incorrect Password.\n");
        else
           System.out.println("Login Successfull.");  
      }           
    catch(UsernameException u)
    {
         System.out.println(u);
        }
    catch(PasswordException p)
    {
           System.out.println(p);                 
      }
    }
  }
        
