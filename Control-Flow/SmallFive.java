import java.util.Scanner;
class SmallFive
{
int a,b,c,d,e;
Scanner sc=new Scanner(System.in);

void task()
{
System.out.println("Enter the First number");
a=sc.nextInt();
System.out.println("Enter the Second number");
b=sc.nextInt();
System.out.println("Enter the Third number");
c=sc.nextInt();
System.out.println("Enter the Fourth number");
d=sc.nextInt();
System.out.println("Enter the Fifth number");
e=sc.nextInt();

 if(a<b && a<c && a<d && a<e){
System.out.println(a+" is Smallest number");
 if(a%2==0)
{
System.out.println(a+" is the even number");
}
else
{
System.out.println(a+" is the odd number");
}
}
else if(b<c && b<d && b<e)
{
System.out.println(b+" is the Smallest number");
if(b%2==0)
{
System.out.println(b+" is the even number");
}
else
{
System.out.println(b+" is the odd number");
}
}
else if(c<d && c<e)
{
System.out.println(c+" is the Smallest number");
if(c%2==0)
{
System.out.println(c+" is the even number");
}
else
{
System.out.println(c+" is the odd number");
}
}
else if(d<e)
{
System.out.println(d+" is the Smallest number");
if(d%2==0)
{
System.out.println(d+" is the even number");
}
else
{
System.out.println(d+" is the odd number");
}
}
else
{
System.out.println(e+" is the Smallest number");
if(e%2==0)
{
System.out.println(e+" is the even number");
}
else
{
System.out.println(e+" is the odd number");
}
} 
}
public static void main(String[] args)
{
SmallFive sf=new SmallFive();
sf.task();
}
}