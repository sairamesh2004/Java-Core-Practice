class WrapperClass
{
byte b=20;
int c=30;
Float f=52.3f;
Long s=800000000l;
Double o=65.56656;
char ch='R';

void Boxing()
{
Byte bb=b;
Integer d=c;
Character c1=ch;
System.out.println("The object  Byte value "+bb);
System.out.println("The object Integer value "+d);
System.out.println("The object Character value "+c1);
}

void UnBoxing()
{
float ff=f;
long ss=s;
double oo=o;
System.out.println("The Premitive float value "+ff);
System.out.println("The primitive long value "+ss);
System.out.println("The primitive double value "+oo);
}


public static void main(String[]args)
{
WrapperClass wc=new WrapperClass();
wc.Boxing();
wc.UnBoxing();
}
}