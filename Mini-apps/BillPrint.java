import java.util.Scanner;
class BillPrint
{
Scanner sc=new Scanner(System.in);
int res;
int a;
int Billno=1;
int q1;
int q2;
int q3;
int q4;
int q5;
int q6;
int q7;
int q8;
int q9;
int q10;
String Date;
String item1;
String item2;
String item3;
String item4;
String item5;
String item6;
String item7;
String item8;
String item9;
String item10;

double IdlyCost=30.00;
double DosaCost=35.00;
double PooriCost=36.75;
double VadaCost=32.60;
double SambarIdlyCost=40.00;
double MasalaDosaCost=45.00;
double OnionDosaCost=40.00;
double UpmaDosaCost=48.85;
double TomatoBathCost=30.00;
double IdlyVadaCombCost=40.00;

void task()
{
do
{
System.out.println("Enter the date");
String Date=sc.next();
System.out.println("-----------------------------------------------------------------------");
System.out.println("                     Available items are                               ");
System.out.println("1.Idly");
System.out.println("2.Dosa");
System.out.println("3.Poori");
System.out.println("4.Vada");
System.out.println("5.Sambar Idly");
System.out.println("6.Masala Dosa");
System.out.println("7.Onion Dosa");
System.out.println("8.Upma Dosa");
System.out.println("9.Tomato Bath");
System.out.println("10.Idly+Vada(4pcs) Combo");
res=sc.nextInt();
switch(res)
{
case 1: 
{ 
String Item1="Idly";
System.out.println("The Selected Item Is Idly");
System.out.println("Enter The Quantity Of Selected Item");
int q1=sc.nextInt();
System.out.println("The Idly Cost ="+IdlyCost+" x "+q1+"="+IdlyCost*q1);
double IC=IdlyCost*q1;
break;
}//case1
case 2:
{
String Item2="Dosa";
System.out.println("The Selected Item Is Dosa");
System.out.println("Enter The Quantity Of Selected Item");
int q2=sc.nextInt();
System.out.println("The Dosa Cost ="+DosaCost+" x "+q2+"="+DosaCost*q2);
double DC=DosaCost*q2;
break;
}//case2
}//mainswitch

int itemno=0;
itemno++;
System.out.println("Do you Want Order more 1-Yes//0-No");
int a=sc.nextInt();
}//do
while(a==1);
Billno=Billno++;
}//taskend

public static void main(String[] args)
{
int itemno=1;
int c;
do{
BillPrint bp=new BillPrint();
bp.task();
System.out.println("-------------The Bill Prints From Here---------------------");
System.out.println("                 Palleturu2Patnam                            ");
System.out.println("                    Pure Veg                                ");
System.out.println("                 Kukatpally,Hyd                             ");
System.out.println("       ------------Tax Invoice-----------------             ");
System.out.println("        Date:"+.Date+          "Billno="+bp.Billno+"            ");
System.out.println("       ----------------------------------------             ");
System.out.println("         Item           Quantity  Rate  Amount              ");
System.out.println("       ----------------------------------------             ");
//for(int n=1;n<itemno;n++)
//{
//System.out.println("          
//}
Scanner sc1=new Scanner(System.in);

System.out.println("Is Bill Completed Want to go to start -1 // 0-exit");
 c=sc1.nextInt();
}//do
while(c==1);
}

}//classend