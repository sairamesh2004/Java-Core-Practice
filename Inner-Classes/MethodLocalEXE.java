class OuterClass
{
int a=00;
private String s="JKL";
public int b=999999;

void task1()
{
System.out.println("Iam Starting of the OuterClass Method ");
int c=a+b;
System.out.println(c);
System.out.println(s);
class Methodlocalinnerclass
{
int d=900;
String f="klj";
void task2()
{

System.out.println("Iam Starting of the LocalClass Method ");
int k=a+b+d;
System.out.println(k);
System.out.println(s);
System.out.println(f);
class Methodlocalinnerclass1
{
void task3()
{
System.out.println("Iam inside the 2nd Method local inner class");
}
}
Methodlocalinnerclass1 mlic1=new Methodlocalinnerclass1();
mlic1.task3(); 
}
}
Methodlocalinnerclass mlic=new Methodlocalinnerclass();
mlic.task2();
}
}

class MethodLocalEXE
{
public static void main(String[]args)
{
OuterClass oc=new OuterClass();
oc.task1();

}

}