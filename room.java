import java.util.*;
class room
{
	float vol;
	float calculate(float h,float w,float b)
	{
		vol=h*w*b;
		return vol;
	}
}
class Roomdemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float h,w,b;
		System.out.print("Enter height:- ");
		h=sc.nextFloat();
		System.out.print("Enter width:- ");
		w=sc.nextFloat();
		System.out.print("Enter breadth:- ");
		b=sc.nextFloat();

		room obj = new room();
			
		float vol=obj.calculate(h,w,b);
		
		System.out.println("Volume of the room:- "+ vol);	
		
	}
}
	