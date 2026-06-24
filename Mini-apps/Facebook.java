import java.util.Scanner;
class Facebook
{ 
Scanner sc=new Scanner(System.in);
String a;
String b;
String c="Ramesh";
String d="Ramesh@123";


void Login()
{
System.out.println("enter the username");
a=sc.next();
System.out.println("enter the password");
b=sc.next(); 
if(a.equals(c)&& b.equals(d))
{
System.out.println("Login sucessful");
}
else{
System.out.println("Invalid Credentials! to Login Please Register."); 
}
}
public static void main(String[] args){
Facebook fb=new Facebook();
fb.Login();
}







}