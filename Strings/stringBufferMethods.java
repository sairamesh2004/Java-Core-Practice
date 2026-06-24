class stringBufferMethods
{
public static void main(String[]args)
{
StringBuffer sb=new StringBuffer("SAI RAMESH");
System.out.println(sb.reverse());
StringBuffer sb1=new StringBuffer("Ramesh");
System.out.println(sb1.insert(0,"SAI"));//insert
StringBuffer sb2=new StringBuffer("HELLO");
System.out.println(sb2.append(",WORLD!"));
System.out.println(sb1.length());
System.out.println(sb2.charAt(6));
System.out.println(sb1.equals(sb2));
System.out.println(sb2.replace(1,2,"FIVE"));
System.out.println(sb2.delete(1,4));
System.out.println(sb1.capacity());

} 
                                                              

}