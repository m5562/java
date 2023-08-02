import java.io.*; 
public class FIO1 {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new FileReader("help.txt"));
 String currentLine = br.readLine();
 while(currentLine != null) {
 System.out.println( currentLine.toUpperCase() );
 currentLine = br.readLine();
 }
 br.close();
 }
}
