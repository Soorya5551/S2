public class complexnum{
  double real;
  double img;
  complexnum(double r,double i){
    this.real=r;
    this.img=i;
    }
 complexnum(){};
 complexnum sum(complexnum c1,complexnum c2)
  {
    complexnum temp=new complexnum();
    temp.real=c1.real+c2.real;
    temp.img=c1.img+c2.img;
    return temp;
  }
 public static void main(String[]args){
  complexnum c1=new complexnum(2,3);
   complexnum c2=new complexnum(3,6);
   complexnum temp1=new complexnum();
   temp1=temp1.sum(c1,c2);
   System.out.println("Sum of complex numbers is:"+temp1.real+"+i"+temp1.img);
  }
}   
   
        
