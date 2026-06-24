import java.util.Scanner;
class BigTwo
{
int a,b;
Scanner sc=new Scanner(System.in);

void task()
{
a=sc.nextInt();
b=sc.nextInt();
 if(a>b){
System.out.println(a+"is biggest number");
 if(a%2==0)
{
System.out.println(a+"is the even number");
}
else
{
System.out.println(a+"is the odd number");
}
}
else
{
System.out.println(b+"is the Biggest number");
if(b%2==0)
{
System.out.println(b+"is the even number");
}
else
{
System.out.println(b+"is the odd number");
}
}
}
public static void main(String[] args)
{
BigTwo bt=new BigTwo();
bt.task();
}
}