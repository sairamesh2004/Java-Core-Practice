class exceptionCHECK1
{
int a,b;
String c;
byte d;

void task()
{
try
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter a ");
a=sc.nextInt();
System.out.println("enter b ");
b=sc.nextInt();
float d=a/b;
System.out.println("the division of "+a+" and "+b+ " is "+d);
System.out.println("..");
System.out.println(c);
}
catch(ArithmeticException AE)
{
System.out.println("/#---Given Value 0 is not dividable----#/ ");
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String[]args)
{
exceptionCHECK1 Ec=new exceptionCHECK1();
Ec.task();


}
}