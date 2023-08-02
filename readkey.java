import java.io.*;  
class readkey {  
    public static void main(String[] args) throws Exception {  
        InputStreamReader inpred = new InputStreamReader(System.in);  
        BufferedReader bffr = new BufferedReader(inpred); 
 
        System.out.println("Whats your name");  
        String sname = bffr.readLine();  
        String a=bffr.readLine();
         int age=Integer.parseInt(a);
        System.out.println("age"+age);
        System.out.println("welcome " + sname + " to the java world");  
    }  
}  