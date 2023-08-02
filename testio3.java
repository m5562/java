import java.io.*;

class testio3 {

  public static void main(String[] args) throws IOException {
    try {
      // loading a file into f1 variable using FileInputStream
      FileInputStream f1 = new FileInputStream("output.txt");

      // loading a file into f2 variable using BufferInputStream
      BufferedInputStream f2 = new BufferedInputStream(f1);

      // using the available method
      System.out.println("Available bytes: " + f2.available());

      int x = 0;
      // while loop untill the end of the file.
      while ((x = f2.read()) != -1) {
        // printing the character
        System.out.print((char) x);
      }
      System.out.println();
      // closing a file
      f2.close();
    } catch (Exception e) {
      // printing exception
      System.out.println(e);
    }
  }
}