abstract class OTP
{

abstract void Myotp();
}

class AnonymusInnerClassEXE
{
public static void main(String[]args)
{
OTP o=new OTP()
{
public void Myotp()
{
System.out.println("Your OTP is 1544654");
}
};
o.Myotp();
}
}