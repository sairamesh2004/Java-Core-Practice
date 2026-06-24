class OuterClass
{
static int a=100;
static String s="Hello";
static int b=90;
static int c;
static void task1()
{
System.out.println("Iam From Outer class Method");
int c=b-a;
System.out.println(c);
System.out.println(s);
}

class InnerClass
{
static void task2()
{
System.out.println("Iam From Inner Class Method");
int c=a+b;
System.out.println(c);
System.out.println(s);
}
}
}

class StaticInnerEXE
{
public static void main(String[]args)
{
OuterClass.task1();
OuterClass.InnerClass.task2();
}
}