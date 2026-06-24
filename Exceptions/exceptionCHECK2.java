class exceptionCHECK2
{

int a,b;
String c;


void task1()
{
try
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter the int");
a=sc.nextInt();
System.out.println("enter the int");
b=sc.nextInt();
System.out.println("enter the string");
c=sc.next();

int d=a+b;
System.out.println("the "+c+" is "+d);
}
catch(Exception e)
{
System.out.println("Error Occurred i.e "+e);
}
}

void task2()
{
try
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter the int");
a=sc.nextInt();
System.out.println("enter the int");
b=sc.nextInt();
System.out.println("enter the string");
c=sc.next();

int d=a-b;
System.out.println("the "+c+" is "+d);
}
catch(Exception e)
{
System.out.println("Error Occurred i.e "+e);
}
}

void task3()
{
try
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter the int");
a=sc.nextInt();
System.out.println("enter the int");
b=sc.nextInt();
System.out.println("enter the string");
c=sc.next();

int d=a*b;
System.out.println("the "+c+" is "+d);
}
catch(Exception e)
{
System.out.println("Error Occurred i.e "+e);
}
}

void task4()
{
try
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter the int");
a=sc.nextInt();
System.out.println("enter the int");
b=sc.nextInt();
System.out.println("enter the string");
c=sc.next();

int d=a/b;
System.out.println("the "+c+" is "+d);
}
catch(Exception e)
{
System.out.println("Error Occurred i.e "+e);
}
}

void task5()
{
try
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter the int");
a=sc.nextInt();
System.out.println("enter the int");
b=sc.nextInt();
System.out.println("enter the string");
c=sc.next();

int d=a%b;
System.out.println("the "+c+" is "+d);
}
catch(Exception e)
{
System.out.println("Error Occurred i.e "+e);
}
}

public static void main(String[]args)
{
exceptionCHECK2 ec=new exceptionCHECK2();
ec.task1();
ec.task2();
ec.task3();
ec.task4();
ec.task5();

}









}