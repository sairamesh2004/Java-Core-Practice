import java.util.Scanner;
class Zomato
{ //class
Scanner sc=new Scanner(System.in);
  int res;
   
  void task()
{//task
  System.out.println("******************************Welcome To Zomato*********************************");
  System.out.println("-----------------------------------------------------------------------------------");
  System.out .println("             the available Restaurants At Your Service                            ");
  System.out.println("-----------------------------------------------------------------------------------");
  System.out.println("1.Kritunga");
  System.out.println("2.Santosh Daba");
  System.out.println("3.Paradise");
  System.out.println("4.Element 7");
  System.out.println("5.Kartik's Kitchen");
  System.out.println("-----------------------------------------------------------------------------------");
  System.out.println("                 Select your Restaurants As Per The Above                          ");
  res=sc.nextInt();
  switch(res)
{ //main switch
  case 1: 
{ 
double VegBiriyaniCost=299.0;
double PannerBiriyaniCost=399.0;
double VegFriedRiceCost=199.0;
double VegPulaoCost=349.0;
double ManchuriaCost=149.0;
System.out.println("************************Welcome To Kritunga Restaurant*******************************");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                               **Our Menu**                                          ");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("1.Veg Biriyani");
System.out.println("2.Paneer Biriyani");
System.out.println("3.Veg Fried Rice");
System.out.println("4.Veg Pulao");
System.out.println("5.Manchuria");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                      Select your Item As Per The Above                              ");
int i=sc.nextInt();
switch(i)
{ //inner switch
case 1: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Biriyani");
System.out.println("Enter the Quantity Of Veg Biriyani");
int q=sc.nextInt();
System.out.println("The Selected Veg Biriyani Cost ="+VegBiriyaniCost+" X "+q+"="+VegBiriyaniCost*q);
double VBCost=VegBiriyaniCost*q;
double GST=VBCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VBCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}
case 2: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Panner Biriyani");
System.out.println("Enter the Quantity Of Panner Biriyani");
int q=sc.nextInt();
System.out.println("The Selected Panner Biriyani Cost ="+PannerBiriyaniCost+" X "+q+"= "+PannerBiriyaniCost*q);
double PBCost=PannerBiriyaniCost*q;
double GST=PBCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=PBCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 3: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Fried Rice");
System.out.println("Enter the Quantity Of Veg Fried Rice");
int q=sc.nextInt();
System.out.println("The Selected Veg Fried Rice Cost ="+VegFriedRiceCost+" X "+q+"= "+VegFriedRiceCost*q);
double VFRCost=VegFriedRiceCost*q;
double GST=VFRCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VFRCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 4:
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Pulao");
System.out.println("Enter the Quantity Of Veg Pulao");
int q=sc.nextInt();
System.out.println("The Selected Veg Pulao  Cost ="+VegPulaoCost+" X "+q+"= "+VegPulaoCost*q);
double VPCost=VegPulaoCost*q;
double GST=VPCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VPCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 5: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Manchuria");
System.out.println("Enter the Quantity Of Manchuria");
int q=sc.nextInt();
System.out.println("The Selected Manchuria Cost ="+ManchuriaCost+" X "+q+"= "+ManchuriaCost*q);
double MCost=ManchuriaCost*q;
double GST=MCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=MCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

default: {
System.out.println("Enter the valid options");
break;
}
}//inner switch
break;
}//case 1

case 2: 
{ //main case 2
double CornSoupCost=120.0;
double VegDumBiriyaniCost=399.0;
double PannerDumBiriyaniCost=499.0;
double CurdRiceCost=169.0;
double MasalaRiceCost=225.0;
System.out.println("************************Welcome To Santhosh Daba Restaurant*******************************");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                               **Our Menu**                                          ");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("1.Corn Soup");
System.out.println("2.Veg Dum Biriyani");
System.out.println("3.Panner Dum Biriyani");
System.out.println("4.Curd Rice");
System.out.println("5.Masala Rice");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                      Select your Item As Per The Above                              ");
int i=sc.nextInt();
switch(i)
{ //inner switch1
case 1: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Corn Soup");
System.out.println("Enter the Quantity Of Corn Soup");
int q=sc.nextInt();
System.out.println("The Selected Corn Soup Cost ="+CornSoupCost+" X "+q+"="+CornSoupCost*q);
double CSCost=CornSoupCost*q;
double GST=CSCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=CSCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}
case 2: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Dum Biriyani");
System.out.println("Enter the Quantity Of Veg Dum Biriyani");
int q=sc.nextInt();
System.out.println("The Selected Veg Dum Biriyani Cost ="+VegDumBiriyaniCost+" X "+q+"= "+VegDumBiriyaniCost*q);
double VDBCost=VegDumBiriyaniCost*q;
double GST=VDBCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VDBCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 3: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Panner Dum Biriyani");
System.out.println("Enter the Quantity Of Panner Dum Biriyani");
int q=sc.nextInt();
System.out.println("The Selected Panner Dum Biriyani  Cost ="+PannerDumBiriyaniCost+" X "+q+"= "+PannerDumBiriyaniCost*q);
double PDBCost=PannerDumBiriyaniCost*q;
double GST=PDBCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=PDBCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 4: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Curd Rice");
System.out.println("Enter the Quantity Of Curd Rice");
int q=sc.nextInt();
System.out.println("The Selected Curd Rice Cost ="+CurdRiceCost+" X "+q+"= "+CurdRiceCost*q);
double CRCost=CurdRiceCost*q;
double GST=CRCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=CRCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 5: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Masala Rice");
System.out.println("Enter the Quantity Of Masala Rice");
int q=sc.nextInt();
System.out.println("The Selected Masala Rice Cost ="+MasalaRiceCost+" X "+q+"= "+MasalaRiceCost*q);
double MRCost=MasalaRiceCost*q;
double GST=MRCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=MRCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

default: {
System.out.println("Enter the valid options");
break;
}
}//inner switch1
break;
}//main case 2
case 3: 
{ //main case 3
double VegBiriyaniAllMixCost=520.0;
double PannerBiriyaniCost=499.0;
double DumMushroomBiriyaniCost=599.0;
double PannerTikkaCost=269.0;
double BabyCornTikkaCost=325.0;
System.out.println("************************Welcome To Paradise Restaurant*******************************");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                               **Our Menu**                                          ");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("1.Veg Biriyani All Mix");
System.out.println("2.Panner Biriyani");
System.out.println("3.Dum Mushroom Biriyani");
System.out.println("4.Panner Tikka");
System.out.println("5.Baby Corn Tikka");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                      Select your Item As Per The Above                              ");
int i=sc.nextInt();
switch(i)
{ //inner switch1
case 1: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Biriyani All Mix");
System.out.println("Enter the Quantity Of Veg Biriyani All Mix");
int q=sc.nextInt();
System.out.println("The Selected Veg Biriyani All Mix Cost ="+VegBiriyaniAllMixCost+" X "+q+"="+VegBiriyaniAllMixCost*q);
double VBAMCost=VegBiriyaniAllMixCost*q;
double GST=VBAMCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VBAMCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}
case 2: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Panner Biriyani");
System.out.println("Enter the Quantity Of Panner Biriyani");
int q=sc.nextInt();
System.out.println("The Selected Panner Biriyani Cost ="+PannerBiriyaniCost+" X "+q+"= "+PannerBiriyaniCost*q);
double PBCost=PannerBiriyaniCost*q;
double GST=PBCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=PBCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 3: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Dum Mushroom Biriyani");
System.out.println("Enter the Quantity Of Dum Mushroom Biriyani");
int q=sc.nextInt();
System.out.println("The Selected Dum Mushroom Biriyani Cost ="+DumMushroomBiriyaniCost+" X "+q+"= "+DumMushroomBiriyaniCost*q);
double DMBCost=DumMushroomBiriyaniCost*q;
double GST=DMBCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=DMBCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 4: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Panner Tikka");
System.out.println("Enter the Quantity Of Panner Tikka");
int q=sc.nextInt();
System.out.println("The Selected Panner Tikka Cost ="+PannerTikkaCost+" X "+q+"= "+PannerTikkaCost*q);
double PTCost=PannerTikkaCost*q;
double GST=PTCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=PTCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 5: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Baby Corn Tikka");
System.out.println("Enter the Quantity Of Baby Corn Tikka");
int q=sc.nextInt();
System.out.println("The Selected Baby Corn Tikka Cost ="+BabyCornTikkaCost+" X "+q+"= "+BabyCornTikkaCost*q);
double BCTCost=BabyCornTikkaCost*q;
double GST=BCTCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=BCTCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

default: {
System.out.println("Enter the valid options");
break;
}
}//inner switch1
break;
}//main case 3
case 4:
{ //main case 4
double VegMandiCost=320.0;
double VegAllMixMandiCost=359.0;
double PannerMandiCost=399.0;
double MushroomMandiCost=469.0;
double PlainFlavouredRiceCost=198.0;
System.out.println("************************Welcome To Element 7 Restaurant*******************************");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                               **Our Menu**                                          ");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("1.Veg Mandi");
System.out.println("2.Veg All Mix Mandi");
System.out.println("3.Panner Mandi");
System.out.println("4.Mushroom Mandi");
System.out.println("5.Plain Flavoured Rice");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                      Select your Item As Per The Above                              ");
int i=sc.nextInt();
switch(i)
{ //inner switch1
case 1: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Mandi");
System.out.println("Enter the Quantity Of Veg Mandi");
int q=sc.nextInt();
System.out.println("The Selected Veg Mandi Cost ="+VegMandiCost+" X "+q+"="+VegMandiCost*q);
double VMCost=VegMandiCost*q;
double GST=VMCost*2/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VMCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}
case 2: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg All Mix Mandi");
System.out.println("Enter the Quantity Of Veg All Mix Mandi");
int q=sc.nextInt();
System.out.println("The Selected Veg All Mix Mandi Cost ="+VegAllMixMandiCost+" X "+q+"= "+VegAllMixMandiCost*q);
double VAMMCost=VegAllMixMandiCost*q;
double GST=VAMMCost*2/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VAMMCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 3: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Panner Mandi");
System.out.println("Enter the Quantity Of Panner Mandi");
int q=sc.nextInt();
System.out.println("The Selected Dum Panner Mandi Cost ="+PannerMandiCost+" X "+q+"= "+PannerMandiCost*q);
double PMCost=PannerMandiCost*q;
double GST=PMCost*2/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=PMCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 4: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Mushroom Mandi");
System.out.println("Enter the Quantity Of Mushroom Mandi");
int q=sc.nextInt();
System.out.println("The Selected Mushroom Mandi Cost ="+MushroomMandiCost+" X "+q+"= "+MushroomMandiCost*q);
double MMCost=MushroomMandiCost*q;
double GST=MMCost*2/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=MMCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 5: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Plain Flavoured Rice");
System.out.println("Enter the Quantity Of Plain Flavoured Rice");
int q=sc.nextInt();
System.out.println("The Selected Plain Flavoured Rice Cost ="+PlainFlavouredRiceCost+" X "+q+"= "+PlainFlavouredRiceCost*q);
double PFRCost=PlainFlavouredRiceCost*q;
double GST=PFRCost*12/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=PFRCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

default: {
System.out.println("Enter the valid options");
break;
}
}//inner switch1
break;
}//main case 4
case 5:
{ //main case 5
double VegManchurianCost=120.0;
double VegNoodlesCost=110.0;
double VegFriedRiceCost=90.0;
double VegSanwidchCost=125.0;
double VegMomosCost=150.0;
System.out.println("************************Welcome To Kartik's kitchen Restaurant*******************************");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                               **Our Menu**                                          ");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("1.Veg Manchurian");
System.out.println("2.Veg Noodles");
System.out.println("3.Veg Fried Rice");
System.out.println("4.Veg Sanwidch");
System.out.println("5.Veg Momos");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("                      Select your Item As Per The Above                              ");
int i=sc.nextInt();
switch(i)
{ //inner switch1
case 1: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Manchurian");
System.out.println("Enter the Quantity Of Veg Manchurian");
int q=sc.nextInt();
System.out.println("The Selected Veg Manchurian Cost ="+VegManchurianCost+" X "+q+"="+VegManchurianCost*q);
double VMCost=VegManchurianCost*q;
double GST=VMCost*3/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VMCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}
case 2: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Noodles");
System.out.println("Enter the Quantity Of Veg Noodles");
int q=sc.nextInt();
System.out.println("The Selected Veg Noodles Cost ="+VegNoodlesCost+" X "+q+"= "+VegNoodlesCost*q);
double VNCost=VegNoodlesCost*q;
double GST=VNCost*2/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VNCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 3: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Fried Rice");
System.out.println("Enter the Quantity Of Veg Fried Rice");
int q=sc.nextInt();
System.out.println("The Selected Veg Fried Rice Cost ="+VegFriedRiceCost+" X "+q+"= "+VegFriedRiceCost*q);
double VFRCost=VegFriedRiceCost*q;
double GST=VFRCost*2/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VFRCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 4: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Sanwidch");
System.out.println("Enter the Quantity Of Veg Sanwidch");
int q=sc.nextInt();
System.out.println("The Selected Veg Sanwidch Cost ="+VegSanwidchCost+" X "+q+"= "+VegSanwidchCost*q);
double VSCost=VegSanwidchCost*q;
double GST=VSCost*3/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VSCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

case 5: 
{ 
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("The Selected Item Is Veg Momos");
System.out.println("Enter the Quantity Of Veg Momos");
int q=sc.nextInt();
System.out.println("The Selected Veg Momos Cost ="+VegMomosCost+" X "+q+"= "+VegMomosCost*q);
double VMCost=VegMomosCost*q;
double GST=VMCost*3/100;
System.out.println("GST="+GST);
double TAX=15.23;
System.out.println("TAX="+TAX);
System.out.println("-------------------------------------------------------------------------------------");
double TotalBill=VMCost+TAX+GST;
System.out.println("Your Total Bill ="+TotalBill);
System.out.println("-------------------------------------------------------------------------------------");
break;
}

default: {
System.out.println("Enter the valid options");
break;
}
}//inner switch1
break;
}//main case 5
}// main switch
}//task

public static void main(String[] args)
{//main
Zomato Z=new Zomato();
Z.task();
}//main
}//class