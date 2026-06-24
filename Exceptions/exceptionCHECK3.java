class exceptionCHECK3
{
int a,b;
String c;
String f="true";
void task1()
{
try{
java.util.Scanner sc=new java.util.Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.next();

int d=a+b;
System.out.println("the "+c+" is "+d);

}
catch(Exception e)
{
System.out.println("Error occurred i.e"+e);
f="false";
}
finally
{
if(f.equals("true"))
{
System.out.println("The Program Has Been Executed Sucessfully");
}
else
{
System.out.println("The Program Raised an Exception");
}
}
}

public static void main(String[]args)
{
exceptionCHECK3 ec=new exceptionCHECK3();
ec.task1();
}
}