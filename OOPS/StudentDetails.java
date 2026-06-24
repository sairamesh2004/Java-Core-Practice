import java.util.Scanner;
class StudentDetails
{
String sname;
String sphno;
int sage;
String saddress;
String sgender;
String sfathername;
String smothername;


StudentDetails(String a,String b,int c,String d,String e,String f,String m)
{
sname=a;
sphno=b;
sage=c;
saddress=d;
sgender=e;
sfathername=f;
smothername=m;
}
void task()
{
System.out.println("                                        ");
System.out.println(" The details of the Student are");
System.out.println(" Name of the Student : "+sname);
System.out.println(" Father Name : "+sfathername);
System.out.println(" Mother Name : "+smothername);
System.out.println(" Mobile number : "+sphno);
System.out.println(" Gender : "+sgender);
System.out.println(" Age : "+sage);
System.out.println(" Address : "+saddress);
}
public static void main(String[]args)
{
String sname;
String sphno;
int sage;
String saddress;
String sgender;
String sfathername;
String smothername;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Student Name");
sname=sc.next();
System.out.println("Enter The Father Name Of "+sname);
sfathername=sc.next();
System.out.println("Enter The Mother Name Of "+sname);
smothername=sc.next();
System.out.println("Enter The Mobile Number Of "+sname);
sphno=sc.next();
System.out.println("Enter The Gender Of "+sname);
sgender=sc.next();
System.out.println("Enter The Age Of "+sname);
sage=sc.nextInt();
System.out.println("Enter The Address Of "+sname);
saddress=sc.next();

StudentDetails sd=new StudentDetails(sname,sphno,sage,saddress,sgender,sfathername,smothername);
sd.task();
}
}