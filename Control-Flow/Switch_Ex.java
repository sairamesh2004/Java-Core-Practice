import java.util.Scanner;
class Switch_Ex
{
Scanner sc=new Scanner(System.in);
char a;

void task(){
System.out.println("*********Welcome To Book My Show********");
System.out.println("----------------------------------------");
System.out.println("The Available Movies are...");
System.out.println("K=>Kalki");
System.out.println("D=>Darling");
System.out.println("S=>Saaho");
System.out.println("Enter your fav Movie as per above options");
System.out.println("enter the options in upper case only");
a=sc.next().charAt(0);

switch(a)
{

  case 'K': {
System.out.println(" The selected Movie is Kalki");
break;
}
  case 'D': {
System.out.println("The selected Movie is Darling");
break;}

case 'S':{
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
