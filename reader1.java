import java.io.FileWriter;
import java.io.IOException;
class reader1
{
    public static void main(String[] args) throws IOException
    {
        // Accept a string
        String str = "Welcome to cime "+
                " FileWriter and FileReader";
 
        // attach a file to FileWriter
        FileWriter fw=new FileWriter("output1.txt");
 
        // read character wise from string and write
        // into FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
 
        System.out.println("Writing successful");
        //close the file
        fw.close();
    }
}