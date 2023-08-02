class throwdemo
{
  public static void main(String[] s)
  {
   try
    {
      throw new ArithmeticException("can not divide 0");
    }
   catch(ArithmeticException e)
    {
      System.out.println(e.getMessage());
System.out.println("exception handled");
}}
}