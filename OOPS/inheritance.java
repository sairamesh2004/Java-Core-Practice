class A
{
String s;
void task()
{
s="Hello,World!";
System.out.println(s);
}
}
class B
{
void task1()
{
A a=new A();
a.task();
System.out.print("World,Hello!");
}
}
class inheritance
{
public static void main(String[]args)
{
B  b=new B();
b.task1();
}
}