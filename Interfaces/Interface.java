interface ProjectManager1
{
String TeamName="alpha";
void task1();
void task2();
}
interface ProjectManager2
{
String TeamName="beta";
void task3();
void task4();
}
class Employees implements ProjectManager1,ProjectManager2
{

public void task1()
{
System.out.println("Iam From "+ProjectManager1.TeamName+" Team");
System.out.println("My task is addition");
int a=10;
int b=20;
int c=a+b;
System.out.println("the sum is "+c);
System.out.println("My Task is Completed");
}
public void task2()
{
System.out.println("Iam From "+ProjectManager1.TeamName+" Team");
System.out.println("My task is subtraction");
int a=30;
int b=40;
int c=b-a;
System.out.println("the subtraction is "+c);
System.out.println("My Task is Completed");
}
public void task3()
{
System.out.println("Iam From "+ProjectManager2.TeamName+" Team");
System.out.println("My task is Multiplication");
int a=100;
int b=20;
int c=a*b;
System.out.println("the multiplication is "+c);
System.out.println("My Task is Completed");
}
public void task4()
{
System.out.println("Iam From "+ProjectManager2.TeamName+" Team");
System.out.println("My task is division");
int a=10;
int b=20;
int c=b/a;
System.out.println("the division is "+c);
System.out.println("My Task is Completed");
}
}
class Interface
{
public static void main(String[]args)
{
ProjectManager1 p1=new Employees();
p1.task1();
p1.task2();
ProjectManager2 p2=new Employees();
p2.task3();
p2.task4();
}
}