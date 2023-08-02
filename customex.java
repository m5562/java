class InvalidAgeException extends Exception
{
  InvalidAgeException(String m)
  {
   super(m);
}
}

class customex
{
public static void main(String[] s)
{
int age=18;
try{
 if(age<=0)
  throw new InvalidAgeException("age can not be -ve");
 }
catch(InvalidAgeException e)
{
 System.out.println(e.getMessage());
}
System.out.println("valid age");

}


}