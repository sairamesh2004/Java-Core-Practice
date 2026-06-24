import java.util.Scanner;
class Switch_Ex_String
{
Scanner sc=new Scanner(System.in);
String a;

void task(){
System.out.println("*********Welcome To Book My Show********");
System.out.println("----------------------------------------");
System.out.println("The Available Movies are...");
System.out.println("Kalki=>Kalki");
System.out.println("Darling=>Darling");
System.out.println("Saaho=>Saaho");
System.out.println("Enter your fav Movie as per above options");
System.out.println("enter the options in upper case only");
a=sc.nextString();

switch(a)
{

  case "Kalki": {
System.out.println(" The selected Movie is Kalki");
break;
}
  case "Darling": {
System.out.println("The selected Movie is Darling");
break;}

case "Saaho":{
System.out.println("The Selected Movie is Saaho");
break;}

default:{
System.out.println("enter the valid option");
}
}
}
public static void main(String[] args){
Switch_Ex s=new Switch_Ex();
s.task();
}
}
