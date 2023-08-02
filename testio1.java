import java.io.*;

class testio1 {

  public static void main(String[] args) throws IOException {
    try {
      // loading a file into f variable
      FileOutputStream f1 = new FileOutputStream("output.txt");

      // declaring a f1 as BufferedOutputStream
      BufferedOutputStream f2 = new BufferedOutputStream(f1);

      String s = "cime college";
      char arr[] = s.toCharArray();
      // initializing x to 0
      int x = 0;
      // while loop untill the end of the string.
      while (x < s.length()) {
        // writing a byte into "output.txt" file
        f2.write(arr[x++]);
      }
      // closing a file
      f2.close();
      f1.close();
    } catch (Exception e) {
      // printing exception
      System.out.println(e);
    }
  }
}