class Tech1
{
String cname="TCS";
void Task(double sal)
{
sal=25000.00;
System.out.println("My Company Name is : "+cname);
System.out.println("My Salary is : "+sal);
}
}

class Tech2 extends Tech1
{
String cname="Accenture";

void Task(double sal)
{
System.out.println("My Company Name is : "+cname);
System.out.println("My Salary is : "+sal);
}
}

class OverRidingExp
{
public static void main(String[]args)
{
Tech1 t1=new Tech2();
t1.Task(60000);
System.out.println(t1.cname);

}
}