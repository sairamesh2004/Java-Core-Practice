import java.util.Scanner;
class Prime
{
Scanner sc=new Scanner(System.in);
int a;
void task()
{
System.out.println("Enter a value");
a=sc.nextInt();
if(a%2==1)
{
System.out.println(a+"Is a Prime Number");
}
else {
System.out.println(a+"Is not a Prime Number");
}
}
public static void main(String[] args)
{
Prime p=new Prime();
p.task();
}


}