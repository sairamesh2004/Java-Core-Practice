class Variable
{
static
{
System.out.println("Hello,World");
}

static
{
System.out.println("Program");

}

int a=10;
int b=100;
static String s="RAMESH";
static void task1()
{
int c=20;
int d=200;
s="Suresh";
System.out.println(s);
}
void task2()
{
int e=30;
int f=300;

}
public static void main(String[] args)
{
Variable v=new Variable();
Variable.task1();
v.task2();
} 



}
