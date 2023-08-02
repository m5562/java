class exp
{
 public static void main(String[] s)
 {
  int x=12;
  int y=0;
try{
  int r=x/y;
  System.out.println(r);
 int[] x1={12,34};
 System.out.println(x1[5]);
}

catch(ArrayIndexOutOfBoundsException e)
 {
  System.out.println("Array out 0f size");
 System.out.println(e);
 }
catch(ArithmeticException e)
{
 System.out.println("/by 0");
}

 }
}