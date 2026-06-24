import java.util.Scanner;
class Scann{
 byte a;
 short b;
 int c;
 long d;
 float e;
 double f;
 char g;
 
void scan(){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the a value in the byte format ");
 a=sc.nextByte();
 System.out.println("Enter the b value in the short format ");
 b=sc.nextShort();
 System.out.println("Enter the c value in the int format ");
 c=sc.nextInt();
 System.out.println("Enter the d value in the long format ");
 d=sc.nextLong();
 System.out.println("Enter the e value in the float format ");
 e=sc.nextFloat();
 System.out.println("Enter the f value in the double format ");
 f=sc.nextDouble();
 System.out.println("Enter the g value in the char format ");
 g=sc.next().charAt(0);

}


void print(){
System.out.println("--------------------------------------------------------------------");
System.out.println(a+" is the given byte value");
System.out.println(b+" is the given short value");
System.out.println(c+" is the given int value");
System.out.println(d+" is the given long value");
System.out.println(e+" is the given float value");
System.out.println(f+" is the given double value");
System.out.println(g+" is the given char value");
}

public static void main(String[] args){
Scann s=new Scann();
 s.scan();
 s.print();

}
 
}
