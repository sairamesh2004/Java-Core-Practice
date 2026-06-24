import JavaTut.PackageEx1;
import JavaTut.PackageEx2;

class OutPack
{
void task()
{
PackageEx1 p1=new PackageEx1();
PackageEx2 p2=new PackageEx2();
p1.task1();
p2.task2();
}
public static void main(String[]args)
{
OutPack op=new OutPack();
op.task();
}
}