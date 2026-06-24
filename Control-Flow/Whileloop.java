class Whileloop
{
int i=1;
void task()
{
while(i<=100)
{
if(i%2==0)
{
System.out.println(i);
}
i++;
}
}
public static void main(String[]args)
{
Whileloop wl=new Whileloop();
wl.task();
}

}