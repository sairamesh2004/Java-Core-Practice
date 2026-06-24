class poly1
{

int a,b,c,d;
double e;

void add(int a,int b)
{
System.out.println("in the normal method");
System.out.println(a);
System.out.println(b);
c=a+b;
System.out.println(c);
}
void operation(int a,int b)
{
System.out.println("in the operation method");
System.out.println(a);
System.out.println(b);
d=a*b;
System.out.println(d);
}
}

class poly2 extends poly1
{
void operation(int a,int b)
{
poly1 p1=new poly1();
p1.add(5,6);
System.out.println("in the OverRide method");
System.out.println(a);
System.out.println(b);
e=a/b;
System.out.println(e);
}
}

class Overriding
{
public static void main(String[]args)
{
poly1 p1=new poly1();
p1.operation(8,9);
poly2 p2=new poly2();
p2.operation(3,2);
}}