import java.util.Scanner;
class multipleConstructors
{
int a,b;
String s;
char c;
multipleConstructors(int a,int b)
{
this.a=a;
this.b=b;
}
multipleConstructors(String s,int a,int b)
{
this.s=s;
this.a=a;
this.b=b;
}
multipleConstructors(char f,int x,int y,String h)
{
c=f;
a=x;
b=y;
s=h;
}
void task()
{
System.out.println(a);
System.out.println(b);
System.out.println(s);
System.out.println(c);
}
public static void main(String[] args)
{
int a,b;
String s;
char c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a");
a=sc.nextInt();
System.out.println("enter the value of b");
b=sc.nextInt();
System.out.println("enter the value of string s");
s=sc.next();
System.out.println("enter the value of char c ");
c=sc.next().charAt(0);
multipleConstructors mc=new multipleConstructors(a,b);
mc.task();
multipleConstructors mc1=new multipleConstructors(s,a,b);
mc1.task();
multipleConstructors mc2=new multipleConstructors(c,a,b,s);
mc2.task();
}}