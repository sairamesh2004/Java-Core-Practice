class Encap1
{
public int a=10;
private int b=20,c;
protected int d=900,e;
int f=90;
public void task()
{
System.out.println(a);
System.out.println(b);
c=a+b;
System.out.println(c);
System.out.println(d);
System.out.println(f);
e=d+f;
System.out.println(e);

}
}

class Encap2 extends Encap1
{
void e(){
System.out.println(a);
//System.out.println(b);
//System.out.println(c);
System.out.println(d);
System.out.println(e);

}
}

class Encapsulation
{
public static void main(String [] args)
{
Encap1 e1=new Encap1();
e1.task();
Encap2 e2=new Encap2();
e2.e();
}
}