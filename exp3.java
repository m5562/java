class exp3{
 
public static void main(String args[])
{ 
try{ 
int a[]={1,7,8,0}; 
a[5]=30/a[3]; 

} 
catch(ArithmeticException e) 
{
System.out.println("/ by 0");
System.exit(0);
}




/*catch(ArrayIndexOutOfBoundsException e) 
{
System.out.println("beyound array size");
}*/
catch(Exception e) 
{
e.printStackTrace();

 } 
finally
{
 System.out.println("exception handled");
}
System.out.println("rest of the code..."); 
 
} } 
