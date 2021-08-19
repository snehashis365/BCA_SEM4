import java.util.*;
class box
{
	double s1,s2,s3;
	box()
	{
		s1=0.0;
		s2=0.0;
		s3=0.0;
	}
	box(double a1,double a2,double a3)
	{
		s1=a1;		
		s2=a2;
		s3=a3;
	}
	box(double len)
	{
		s1=s2=s3=len;
	}
	double vol()
	{
		double volume = s1*s2*s3;	
		return volume;
	}
}
class calculate
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of the box:-");
		double l=sc.nextDouble();
		System.out.print("Enter the width of the box:-");
		double b=sc.nextDouble();
		System.out.print("Enter the height of the box:-");
		double h=sc.nextDouble();
		
		box obj1 = new box(l,b,h);
		box obj2 = new box(l);
	
		double v= obj1.vol();
		double v1= obj2.vol();
		System.out.println("Volume of the 1st box:- " + v);
		System.out.println("Volume of the 2nd box:- " + v1);
	}
}
