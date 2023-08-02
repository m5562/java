import java.io.*;
class demosleep
{
  
 

 public static void main(String[] s)
  {

for(int i=1;i<=10;i++)
{
System.out.println(i);
  
try{

 
  Thread.sleep(2000) ;
}
catch(InterruptedException e)
{
e.printStackTrace();
} 
}     
    



}
}