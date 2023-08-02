import java.io.*;
class demoio
{
 public static void main(String[] s)throws FileNotFoundException
  {
   FileOutputStream fo=new FileOutputStream("a.txt");
   try{
   fo.write(10);
fo.close();
   }
  catch(IOException e){}
FileInputStream fi=new FileInputStream("a.txt");
  try
  {
   int i=(int)fi.read();
   System.out.println(i);
  }
 catch(IOException e){}
   
}
}