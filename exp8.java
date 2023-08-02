public class exp8
{ 
static void validate(int age)throws ClassNotFoundException
{ if(age<18) 
throw new ClassNotFoundException("not valid");
 else 
System.out.println("welcome to vote"); 
} 

public static void main(String args[])
{
 try{
 validate(13);
  }
 catch(ClassNotFoundException e)
  {
   System.out.println(e);
  } 
System.out.println("rest of the code...");
 } } 
