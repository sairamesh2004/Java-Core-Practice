import java.util.Scanner;
class SmallTwo
{
int a,b;
Scanner sc=new Scanner(System.in);

void task()
{
System.out.println("Enter the value");
a=sc.nextInt();
System.out.println("Enter the value");
b=sc.nextInt();
 if(a<b){
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
else
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
}
public static void main(String[] args)
{
SmallTwo st=new SmallTwo();
st.task();
}
}