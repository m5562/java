import java.io.*;
class throwdemo1
{
  static void f1()
{
throw new ArithmeticException();
}
 

 public static void main(String[] s)
  {
  try
    {
   f1();
      
    }
   catch(ArithmeticException e)
    {
      System.out.println(e.getMessage());
System.out.println("exception handled");
}

}
}