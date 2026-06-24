class ObjectClass
{
int b;
public static void main(String[]args)
{
String a="a";
String b="a";
ObjectClass obj=new ObjectClass();

System.out.println(obj.getClass());
System.out.println(obj.hashCode());
System.out.println(a.equals(b));
System.out.println(obj.toString());

//System.out.println(ob.getClass());
}

}