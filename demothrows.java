import java.io.*;
class demothrows
{
  static void f1() throws ArithmeticException
{
System.out.println(6/0);
}
 

 public static void main(String[] s)
  {
try{

 
   f1();
}
catch(ArithmeticException e)
{
System.out.println("/ by 0");
}      
    



}
}