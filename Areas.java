import java.util.Scanner;
class Areas
{
	float pi=3.14f;
	
	void circle(int r)
	{
		//int r=5;
		System.out.println("Radius is"+(pi*r*r));
		
	}
	void triangle(int b,int h)
	{
		//int b=12,h=6;
		System.out.println("Area of Triangle is"+(b*h/2));
	}
	void square(int a)
	{
		//int a=7;
		System.out.println("Area of Square is"+(a*a));
	}
	public static void main(String args[])
	{
		Areas a1=new Areas();
		Areas a2=new Areas();
		Areas a3=new Areas();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius to find area of circle");
		int r=sc.nextInt();
		a1.circle(r);
		System.out.println("Enter the length and breadth to find area of triangle");
		int b=sc.nextInt();
		int h=sc.nextInt();
		a2.triangle(b,h);
		System.out.println("Enter the side to find area of square");
		int a=sc.nextInt();
		a3.square(a);
	}
}