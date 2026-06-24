class Typecasting
{
long l=5646546543l;
byte b=44;
int i=3465465;
float f=54.252f;

void ImplicityCasting()
{
int a=b;
System.out.println("the converted no "+a);
long lo=i;
System.out.println("the converted no "+lo);
double db=f;
System.out.println("the converted no "+db);
}

void ExplicityCasting()
{
int a=(int)l;
System.out.println("the converted no "+a);
byte bb=(byte)i;
System.out.println("the converted no "+bb);
int c=(int)f;
System.out.println("the converted no "+c);

}
public static void main(String[]args)
{
Typecasting tc=new Typecasting();
tc.ImplicityCasting();
tc.ExplicityCasting();


}



}
