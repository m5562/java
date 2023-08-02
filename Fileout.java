import java.io.*;
class Fileout  
  {  
    public static void main(String[] args)  
      {  
        try  
          {  
            FileOutputStream fo= new FileOutputStream("demo.txt");  
            String str="Thanks to visit my site";  
            byte b[]=str.getBytes();  
            fo.write(b);  
            fo.close();  
            System.out.println("you have successfuly inserted your data in your text file  ");  
          }  
        catch(Exception y)  
          {  
            System.out.println(y);  
          }  
      }     
  }    
 
