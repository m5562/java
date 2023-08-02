import java.io.*;  
class large {  
 public static void main(String arg[]) throws IOException {  
  DataInputStream dr = new DataInputStream(System.in);  
  System.out.println("Enter the size of Array : ");  
  int no = Integer.parseInt(dr.readLine());  
  int a[] = new int[no];  
  System.out.println("Enter the Elements of Array...");  
  for (int i = 0; i < no; i++) {  
   a[i] = Integer.parseInt(dr.readLine());  
  }  
  int small = a[0];  
  int large = a[0];  
  for (int i = 0; i < no; i++) {  
   if (a[i] > large)  
    large = a[i];  
   else if (a[i] < small)  
    small = a[i];  
  }  
  System.out.println("The Smallest Number of the given array is : " + small);  
  System.out.println("The Largest Number of the given array is : " + large);  
 }  
}
