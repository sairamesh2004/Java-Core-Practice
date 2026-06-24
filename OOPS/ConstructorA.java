class Aconstructor
{
int a;
String s;

Aconstructor()
{


}
Aconstructor(int a,String s)
{
this.a=a;
this.s=s;


}
Aconstructor(int b,String x)
{
a=b;
s=x;
}
void task()
{
System.out.println(a);
System.out.println(s);
System.out.println(b);
System.out.println(x);


}


public static void main(String[]args)
{
Aconstructor a=new Aconstructor();
a.task();


}
}

