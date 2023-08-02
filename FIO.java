import java.util.*; // Scanner
import java.io.*; // File, PrintWriter
public class FIO {

 public static void main(String[] args){
 PrintWriter pw = null;
 try {
 pw = new PrintWriter(new File("help.txt"));
 }
 catch (FileNotFoundException e) {
 System.err.print("couldn't open file for writing!");
 System.exit(0);
 }
 pw.print("partial line ");
 pw.println("complete line");
 pw.printf("with %s\n","substitutions");
 pw.close(); // always!
 }
}