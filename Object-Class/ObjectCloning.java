class ObjectCloning implements Cloneable
{
String a="TRANCS iS NIVEIASHASD";
public static void main(String[]args)
{
ObjectCloning oc=new ObjectCloning();

System.out.println("This is from original obj data "+oc.a);
try{
ObjectCloning oc1=(ObjectCloning)oc.clone();
System.out.println("This is from Cloned obj data "+oc1.a);
}
catch(Exception e)
{
System.out.println(e);
}

}

}