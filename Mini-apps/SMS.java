import java.util.Scanner;
class SMS
{
long debAccno;
long credAccno;
double Amount;
String Date;
long TxnId=1394248240;
long MobNo=18005700;

void task()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the debited Acc no Last Three Digits");
debAccno=sc.nextLong();
System.out.println("Enter the Credited Acc no Last Three Digits");
credAccno=sc.nextLong();
System.out.println("Enter the Amount Needed to Transfer");
Amount=sc.nextDouble();
System.out.println("Enter the Date");
Date=sc.next();
System.out.println("                                                                                               ");
System.out.println("                                                                                               ");
System.out.println("                                                                                               "); 
System.out.println("Your ACC No:XXX"+ debAccno +" debited with "+ Amount + " on " + Date + " & A/c XXX" +credAccno+ " credited. Transaction ID-" +TxnId+ ".Call " +MobNo+ ",for any dispute - SBI");
}

public static void main(String[]args)
{
SMS s=new SMS();
s.task();

}




}