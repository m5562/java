import java.io.*;
class testio4
{
 public static void main(String[] s)throws FileNotFoundException
{
 FileOutputStream fo=new FileOutputStream("f1.txt");
 try
 {
   fo.write(12);
 }
 catch(IOException e){}  
FileInputStream fi=new FileInputStream("f1.txt");
 try{
    int n=(int)fi.read();
    System.out.println(n);
    }
catch(IOException e){}  
}
}
  