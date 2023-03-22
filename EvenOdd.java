import java.util.Scanner;
class EvenOdd
{
	public static void main (String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Program to Find Even or Odd Number");
		System.out.println("Enter a number");
		int i = a.nextInt();
		String p =(i%2==0)?("Even Number"):("Odd Number");
		System.out.println("The given number is "+p);
	}
}