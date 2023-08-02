import java.io.*;
class exp7
{
 public static void main(String[] s)
 {
  try
   { 
    int p=5/0;
    System.out.println(p);
    throw new ArithmeticException("/ by 0 operation");
//System.out.println("demo of throw");
    }
   catch(ArithmeticException e)
    {
     System.out.println("number / by 0");
     System.out.println(e);
    }
}
} 

