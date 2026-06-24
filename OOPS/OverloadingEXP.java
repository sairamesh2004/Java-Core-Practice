class WhatsApp
{
private String phonenum;
private String chat;

WhatsApp(String phonenum,String chat)
{
this.phonenum=phonenum;
this.chat=chat;
}

void Whats()
{
System.out.println("*");
System.out.println("Welecome To WhatApp*");
System.out.println("*");
System.out.println("Your PhoneNumber is : "+phonenum);
System.out.println("Your Chat Box is : "+ chat);
System.out.println("*");
}
void Whats(String status)
{
System.out.println("*");
System.out.println("Today Status : " +status);
System.out.println("*");
}

void Whats(String status,String voicecall)
{
System.out.println("*");
System.out.println("Today Status : " +status);
System.out.println("Voice Call From"+voicecall);
System.out.println("*");
}
}
class OverloadingEXP
{
public static void main(String[]args)
{
WhatsApp w=new WhatsApp("9640591713","Hi,Good Mrng");
w.Whats();
//w.Whats("Happy Sunday");
w.Whats("Happy Sunday","Samantha");

}

}