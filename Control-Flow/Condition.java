class Condition
{
int a=100;
int b=200;

void comp(){

if(a>b){
System.out.println("the a value is greater");
}

else{
System.out.println("the b value is greater");
}
}
public static void main(String[] args){
Condition c=new Condition();
c.comp();
}
}