import java.util.Scanner;
class EvenOrOdd
{
int a;
Scanner sc=new Scanner(System.in);


void check()
{
System.out.println("Enter any number");
a=sc.nextInt();
if(a%2==0)
{
System.out.println("The Given No Is Even");
}
else
{
System.out.println("The Given No Is Odd");
}
}
public static void main(String[] args)
{
EvenOrOdd eo=new EvenOrOdd();
eo.check();
}
}
