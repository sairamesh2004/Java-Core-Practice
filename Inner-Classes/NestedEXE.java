class NestedOuterClass
{
int a=100;
private String s="Hello";
int b=90;

void task1()
{
System.out.println("Iam From Outer class Method");
int c=b-a;
System.out.println(c);
System.out.println(s);
}

class NestedInnerClass
{
void task2()
{
System.out.println("Iam From Inner Class Method");
int c=a+b;
System.out.println(c);
System.out.println(s);
}
}
}

class NestedEXE
{
public static void main(String[]args)
{
NestedOuterClass noc=new NestedOuterClass();
noc.task1();
NestedOuterClass.NestedInnerClass nic=noc.new NestedInnerClass();
nic.task2();
}
}