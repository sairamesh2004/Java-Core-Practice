class Stringe
{
public static void main(String[]args)
{
String str="RAMESH";
int length=str.length();//5
char ch;

for(int i=0;i<length;i++)//0
{

 ch=str.charAt(i);

if(i%2!=0 && Character.isUpperCase(ch))
{
 ch=Character.toLowerCase(ch);
}
System.out.print(ch);
}
}
}