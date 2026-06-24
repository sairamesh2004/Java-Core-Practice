class Swapping
{
static int a=10;
static int b=20;
int c;
static
{
System.out.println(a);
System.out.println(b);
}
void task()
{
c=a;
a=b;
b=c;
System.out.println(a);
System.out.println(b);
}
public static void main(String[] args)
{
Swapping s=new Swapping();
s.task();
}


}
