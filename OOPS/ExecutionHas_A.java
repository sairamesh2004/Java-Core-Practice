class Has_A
{
int a=5;
int b=10;
int c;
void task()
{
c=a+b;
System.out.println("The sum is "+c);
}
}
class Has_A1
{
Has_A a=new Has_A();

void task1()
{
a.task();
System.out.println("in the task1");
}
}
class Has_A2
{
Has_A1 b=new Has_A1();
String s="Sai";
void task2()
{
b.task1();
System.out.println(s);
}
}
class ExecutionHas_A
{
public static void main(String[]args)
{
Has_A2 c=new Has_A2();
c.task2();
}
}