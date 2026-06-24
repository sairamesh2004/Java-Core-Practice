class poly1
{
int a,b,c,v,f,h;

poly1(int a)
{
this.a=a;
}
poly1(int v,int b)
{
this.v=v;
this.b=b;
}
poly1(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}
void task(int a)
{
System.out.println("in the single parameter task");
System.out.println(a);
}
void task(int a,int b)
{
System.out.println("in the Two parameter task");
System.out.println(a);
System.out.println(b);
}
void task(int a,int b,int c)
{
System.out.println("in the Three parameter task");
System.out.println(a);
System.out.println(b);
//c=a+b;
System.out.println(c);
}
}
class Overloading
{
public static void main(String[]args)
{
poly1 p1=new poly1(12);
p1.task(1);
poly1 p2=new poly1(13,14);
p2.task(5,6);
poly1 p3=new poly1(15,16,17);
p3.task(7,8,9);
}
}