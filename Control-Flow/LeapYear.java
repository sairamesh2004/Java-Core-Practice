class LeapYear
{
int year;
void leap()
{
for(year=1990;year<=2025;year++)
{
if(year%4==0 && year%100==0 && year%400==0)
{
System.out.println(year+" is a leap year");
}
}
public static void main(String[] args)
{
LeapYear ly=new LeapYear();
ly.leap();
}

}